package com.mall.model;
import java.util.List;

import com.github.pagehelper.PageInfo;

public class Page {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Page(List list){
		this.page=new PageInfo(list);
		this.pageSize=page.getPageSize();
		this.currentPage=page.getPageNum();
		this.totalPage=page.getPages();
		this.totalResult=(int) page.getTotal();
		this.currentResult=page.getStartRow();
		
	}
	
	private int pageSize=10; //每页显示记录数
	private int totalPage;		//总页数
	private int totalResult;	//总记录数
	private int currentPage;	//当前页
	private int currentResult;	//当前记录起始索引
	private String pageStr;		//最终页面显示的底部翻页导航，详细见：getPageStr();
	private PageInfo<?> page;
	public int getTotalPage() {
		return totalPage;
	}
	
	public int getTotalResult() {
		return totalResult;
	}
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public String getPageStr() {
		StringBuffer sb = new StringBuffer();
		if(totalResult>0){
			sb.append("	<ul>\n");
			if(currentPage==1){
				sb.append("	<li><a>共<font color='red'>"+totalResult+"</font>条</a></li>\n");
				sb.append("	<li><input type=\"number\" value=\"\" id=\"toGoPage\" style=\"width:50px;text-align:center;float:left\" placeholder=\"页码\" value=\""+currentPage+"\"/></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"toTZ();\"  class=\"btn btn-mini btn-success\">跳转</a></li>\n");
				sb.append("	<li><a>首页</a></li>\n");
				sb.append("	<li><a>上页</a></li>\n");
			}else{
				sb.append("	<li><a>共<font color=red>"+totalResult+"</font>条</a></li>\n");
				sb.append("	<li><input type=\"number\" value=\"\" id=\"toGoPage\" style=\"width:50px;text-align:center;float:left\" placeholder=\"页码\"/></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"toTZ();\"  class=\"btn btn-mini btn-success\">跳转</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage(1)\">首页</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage("+(currentPage-1)+")\">上页</a></li>\n");
			}
			int showTag = 5;//分页标签显示数量
			int startTag = 1;
			if(currentPage>showTag){
				startTag = currentPage-1;
			}
			int endTag = startTag+showTag-1;
			for(int i=startTag; i<=totalPage && i<=endTag; i++){
				if(currentPage==i)
					sb.append("<li><a><font color='#808080'>"+i+"</font></a></li>\n");
				else
					sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage("+i+")\">"+i+"</a></li>\n");
			}
			if(currentPage==totalPage){
				sb.append("	<li><a>下页</a></li>\n");
				sb.append("	<li><a>尾页</a></li>\n");
			}else{
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage("+(currentPage+1)+")\">下页</a></li>\n");
				sb.append("	<li style=\"cursor:pointer;\"><a onclick=\"nextPage("+totalPage+")\">尾页</a></li>\n");
			}
			sb.append("	<li><a>第"+currentPage+"页</a></li>\n");
			sb.append("	<li><a>共"+totalPage+"页</a></li>\n");
			
			
			sb.append("	<li><select title='显示条数' style=\"width:55px;float:left;\" onchange=\"changeCount(this.value)\">\n");
			if(pageSize==10){
				sb.append("	<option value='10' selected='selected'>10</option>\n");
			}else{
				sb.append("	<option value='10'>10</option>\n");
			}
			if(pageSize==20){
				sb.append("	<option value='20' selected='selected'>20</option>\n");
			}else{
				sb.append("	<option value='20'>20</option>\n");
			}
			if(pageSize==30){
				sb.append("	<option value='30' selected='selected'>30</option>\n");
			}else{
				sb.append("	<option value='30'>30</option>\n");
			}
			if(pageSize==40){
				sb.append("	<option value='40' selected='selected'>40</option>\n");
			}else{
				sb.append("	<option value='40'>40</option>\n");
			}
			if(pageSize==50){
				sb.append("	<option value='50' selected='selected'>50</option>\n");
			}else{
				sb.append("	<option value='50'>50</option>\n");
			}
			if(pageSize==60){
				sb.append("	<option value='60' selected='selected'>60</option>\n");
			}else{
				sb.append("	<option value='60'>60</option>\n");
			}
			if(pageSize==70){
				sb.append("	<option value='70' selected='selected'>70</option>\n");
			}else{
				sb.append("	<option value='70'>70</option>\n");
			}
			if(pageSize==80){
				sb.append("	<option value='80' selected='selected'>80</option>\n");
			}else{
				sb.append("	<option value='80'>10</option>\n");
			}
			if(pageSize==90){
				sb.append("	<option value='90' selected='selected'>90</option>\n");
			}else{
				sb.append("	<option value='90'>90</option>\n");
			}
			if(pageSize==100){
				sb.append("	<option value='100' selected='selected'>100</option>\n");
			}else{
				sb.append("	<option value='100'>100</option>\n");
			}
			sb.append("	</select>\n");
			sb.append("	</li>\n");
			
			
			
			sb.append("</ul>\n");
			sb.append("<script type=\"text/javascript\">\n");
			

			//换页函数
			sb.append("/*<![CDATA[*/function nextPage(page){");
			//sb.append(" top.jzts();");
			sb.append("	if(document.forms[0]){\n");
			sb.append("		var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append("		if(url.indexOf('?')>-1){url += \"&currentPage=\";}\n");
			sb.append("		else{url += \"?currentPage=\";}\n");
			sb.append("		url = url + page + \"&pageSize="+pageSize+"\";\n");
			sb.append("		document.forms[0].action = url;\n");
			sb.append("		document.forms[0].submit();\n");
			sb.append("	}else{\n");
			sb.append("		var url = document.location+'';\n");
			sb.append("		if(url.indexOf('?')>-1){\n");
			sb.append("			if(url.indexOf('currentPage')>-1){\n");
			sb.append("				var reg = /currentPage=\\d*/g;\n");
			sb.append("				url = url.replace(reg,'currentPage=');\n");
			sb.append("			}else{\n");
			sb.append("				url += \"&currentPage=\";\n");
			sb.append("			}\n");
			sb.append("		}else{url += \"?currentPage=\";}\n");
			sb.append("		url = url + page + \"&pageSize="+pageSize+"\";\n");
			sb.append("		document.location = url;\n");
			sb.append("	}\n");
			sb.append("}\n");
			
			//调整每页显示条数
			sb.append("function changeCount(value){");
			//sb.append(" top.jzts();");
			sb.append("	if(document.forms[0]){\n");
			sb.append("		var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append("		if(url.indexOf('?')>-1){url += \"&currentPage=\";}\n");
			sb.append("		else{url += \"?currentPage=\";}\n");
			sb.append("		url = url + \"1&pageSize=\"+value;\n");
			sb.append("		document.forms[0].action = url;\n");
			sb.append("		document.forms[0].submit();\n");
			sb.append("	}else{\n");
			sb.append("		var url = document.location+'';\n");
			sb.append("		if(url.indexOf('?')>-1){\n");
			sb.append("			if(url.indexOf('currentPage')>-1){\n");
			sb.append("				var reg = /currentPage=\\d*/g;\n");
			sb.append("				url = url.replace(reg,'currentPage=');\n");
			sb.append("			}else{\n");
			sb.append("				url += \"1&currentPage=\";\n");
			sb.append("			}\n");
			sb.append("		}else{url += \"?currentPage=\";}\n");
			sb.append("		url = url + \"&pageSize=\"+value;\n");
			sb.append("		document.location = url;\n");
			sb.append("	}\n");
			sb.append("}\n");
			//跳转函数 
			sb.append("function toTZ(){");
			sb.append("var toPaggeVlue = document.getElementById(\"toGoPage\").value;");
			sb.append("if(toPaggeVlue == ''){document.getElementById(\"toGoPage\").value=1;return;}");
			sb.append("if(isNaN(Number(toPaggeVlue))){document.getElementById(\"toGoPage\").value=1;return;}");
			sb.append("nextPage(toPaggeVlue);");
			sb.append("}\n/*]]>*/");
			sb.append("</script>\n");
		}
		pageStr = sb.toString();
		return pageStr;
	}
	
	public int getPageSize() {
		return pageSize;
	}


	public int getCurrentResult() {
		return currentResult;
	}
	
}
