package com.vo;

import java.sql.Date;

public class UserVO {
	private Integer uid;//用户ID
	private String uaccount;//用户账号
	private String upassword;//用户密码
	private String uname;//用户名
	private Integer utype;//用户工作状态（是否离职）
	private Integer upost;//用户职务(经理0、员工1)
	private Integer uage;//用户年龄
	private Integer uowner;//用户所属负责人id(直接给id)
	private String usex;//用户性别
	private Date uwrokday;//用户入职日期
	private Date uquitworkday;//用户离职日期
	private AddressVO uaddress;//外键  地址
	public UserVO() {
	}
	
	public UserVO(Integer uid, String uaccount, String upassword, String uname, Integer utype, Integer upost,
			Integer uage, Integer uowner, String usex, Date uwrokday, Date uquitworkday, AddressVO uaddress) {
		this.uid = uid;
		this.uaccount = uaccount;
		this.upassword = upassword;
		this.uname = uname;
		this.utype = utype;
		this.upost = upost;
		this.uage = uage;
		this.uowner = uowner;
		this.usex = usex;
		this.uwrokday = uwrokday;
		this.uquitworkday = uquitworkday;
		this.uaddress = uaddress;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUaccount() {
		return uaccount;
	}

	public void setUaccount(String uaccount) {
		this.uaccount = uaccount;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getUtype() {
		return utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}

	public Integer getUpost() {
		return upost;
	}

	public void setUpost(Integer upost) {
		this.upost = upost;
	}

	public Integer getUage() {
		return uage;
	}

	public void setUage(Integer uage) {
		this.uage = uage;
	}

	public Integer getUowner() {
		return uowner;
	}

	public void setUowner(Integer uowner) {
		this.uowner = uowner;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public Date getUwrokday() {
		return uwrokday;
	}

	public void setUwrokday(Date uwrokday) {
		this.uwrokday = uwrokday;
	}

	public Date getUquitworkday() {
		return uquitworkday;
	}

	public void setUquitworkday(Date uquitworkday) {
		this.uquitworkday = uquitworkday;
	}

	public AddressVO getUaddress() {
		return uaddress;
	}

	public void setUaddress(AddressVO uaddress) {
		this.uaddress = uaddress;
	}

	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", uaccount=" + uaccount + ", upassword=" + upassword + ", uname=" + uname
				+ ", utype=" + utype + ", upost=" + upost + ", uage=" + uage + ", uowner=" + uowner + ", usex=" + usex
				+ ", uwrokday=" + uwrokday + ", uquitworkday=" + uquitworkday + ", uaddress=" + uaddress + "]";
	}
	
}
