package com.mall.model.system;
import java.util.Date;

/**
 * 
 * <p>Title:系统日志</p>
 * <p>Description:系统日志</p>
 * <p>Copyright:Copyright (c) 2016</p>
 * <p>Company:易泓咨询管理公司 </p>
 * <p>Date:2016年9月27日 下午3:00:59</p>
 * <p>Modify:2016年9月27日 下午3:00:59 </p>
 * <p>Bug:</p>
 * 
 * @author xuliting
 * @version 1.1
 */
public class SysLog {

	private Long id;//主键
	private Date opt_time;//日志操作时间
	private Long opt_category;//日志类型
	private String opt_summary;//日志的详情
	private String ip_address;//IP地址
	private String computer_name;//计算机名称
	private Long operator;//操作者Id
	private String userName;//操作者名称
	private String startTime;//开始操作时间
	private String endTime;//结束操作时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOpt_time() {
		return opt_time;
	}
	public void setOpt_time(Date opt_time) {
		this.opt_time = opt_time;
	}
	public Long getOpt_category() {
		return opt_category;
	}
	public void setOpt_category(Long opt_category) {
		this.opt_category = opt_category;
	}
	public String getOpt_summary() {
		return opt_summary;
	}
	public void setOpt_summary(String opt_summary) {
		this.opt_summary = opt_summary;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getComputer_name() {
		return computer_name;
	}
	public void setComputer_name(String computer_name) {
		this.computer_name = computer_name;
	}
	public Long getOperator() {
		return operator;
	}
	public void setOperator(Long operator) {
		this.operator = operator;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
