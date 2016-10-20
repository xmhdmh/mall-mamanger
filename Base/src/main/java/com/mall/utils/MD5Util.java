package com.mall.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @ClassName: MD5Util
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年5月30日 上午9:47:09
 * 
 */

public class MD5Util {
    // 全局数组
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    public MD5Util() {
    }

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        // System.out.println("iRet="+iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    // 返回形式只为数字
    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        //System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    // 转换字节数组为16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
    
    public static String GetMD5Code(String strObj,int random) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            String randomStr=String.valueOf(random);
            resultString=randomStr.substring(0,2)+resultString+randomStr.substring(2,randomStr.length());
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
    /**
     * shiro用户数据库密码加密
    * @Title: shiroPassword 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param password
    * @param @param nameAndSalt
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    public static String shiroPassword(String password,String nameAndSalt){
        return new Md5Hash(password,nameAndSalt,2).toString();
    }

    public static void main(String[] args) {
        System.out.println(shiroPassword("123456","admin8d78869f470951332959580424d4bf4f"));
    }
}
