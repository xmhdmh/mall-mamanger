package com.mall.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

public class IOUtil {

	private static Logger logger = Logger.getLogger(IOUtil.class);
	private static final String encoding = "UTF-8";
	public static void writerIO(String pathUrl,String content){
		//做标记flag
		int flag=1;
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathUrl,true),encoding));
		} catch (FileNotFoundException e) {
			logger.info("读取的文件不存在！");
			flag=0;
		} catch (UnsupportedEncodingException e){
			logger.info("读取的文件内容编码格式错误！");
			flag=0;
		} 
		if(flag==1)
		{
			try {
				//文件的写入
				bw.write(content, 0,content.length());
				//内容的分割
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				logger.info("读写过程出错！");
				flag=0;
			}finally
			{
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
					flag=0;
				}
			}
		}
		if(flag==1)
		{
			logger.info("读写过程顺利完成！");
		}
	}
	//此方法只针对windows系统
	public static String getMACAddress(String ip) {
        String macAddress = "";
        String temp;
        BufferedReader br=null;
        try {
            Process p = Runtime.getRuntime().exec("nbtstat -a " + ip);
            br = new BufferedReader(new InputStreamReader(p.getInputStream(),encoding));
            while ((temp=br.readLine())!=null) {
            	if (temp.indexOf("MAC ") > 1) {
                  macAddress = temp.substring(13, temp.length());
                  break;
              }
			}
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return macAddress;
    }
}
