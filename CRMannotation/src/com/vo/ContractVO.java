package com.vo;

import java.sql.Date;

public class ContractVO {
	private Integer conid;//合同id
	private String conimg;//合同图片
	private String contitle;//合同标题
	private String condetails;//合同详情
	private Date condate;//合同时间
	private Integer constatus;//合同状态
	private ClientVO conclient;//外键  合同客户(甲)
	private UserVO conuser;//外键  合同员工(乙)
	public ContractVO() {
	}
	public ContractVO(Integer conid, String conimg, String contitle, String condetails, Date condate, Integer constatus,
			ClientVO conclient, UserVO conuser) {
		this.conid = conid;
		this.conimg = conimg;
		this.contitle = contitle;
		this.condetails = condetails;
		this.condate = condate;
		this.constatus = constatus;
		this.conclient = conclient;
		this.conuser = conuser;
	}
	public Integer getConid() {
		return conid;
	}
	public void setConid(Integer conid) {
		this.conid = conid;
	}
	public String getConimg() {
		return conimg;
	}
	public void setConimg(String conimg) {
		this.conimg = conimg;
	}
	public String getContitle() {
		return contitle;
	}
	public void setContitle(String contitle) {
		this.contitle = contitle;
	}
	public String getCondetails() {
		return condetails;
	}
	public void setCondetails(String condetails) {
		this.condetails = condetails;
	}
	public Date getCondate() {
		return condate;
	}
	public void setCondate(Date condate) {
		this.condate = condate;
	}
	public Integer getConstatus() {
		return constatus;
	}
	public void setConstatus(Integer constatus) {
		this.constatus = constatus;
	}
	public ClientVO getConclient() {
		return conclient;
	}
	public void setConclient(ClientVO conclient) {
		this.conclient = conclient;
	}
	public UserVO getConuser() {
		return conuser;
	}
	public void setConuser(UserVO conuser) {
		this.conuser = conuser;
	}
	@Override
	public String toString() {
		return "ContractVO [conid=" + conid + ", conimg=" + conimg + ", contitle=" + contitle + ", condetails="
				+ condetails + ", condate=" + condate + ", constatus=" + constatus + ", conclient=" + conclient
				+ ", conuser=" + conuser + "]";
	}
}
