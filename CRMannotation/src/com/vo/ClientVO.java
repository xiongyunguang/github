package com.vo;

public class ClientVO {
	private Integer cid;//客户id
	private String cname;//客户姓名
	private String csex;//客户性别
	private Integer cage;//客户年龄
	private String cphone;//客户联系方式
	private String cemail;//客户邮箱
	private String cprofession;//客户职业
	private Integer cstate;//客户状态(潜在、新客户、老客户)
	private String ccontext;//客户详细描述信息
	private AddressVO clocation;//客户所属地区
	private String cimage;//客户照片
	private UserVO userid;//外键  所属员工

	public ClientVO() {
	}

	public ClientVO(Integer cid, String cname, String csex, Integer cage, String cphone, String cemail,
			String cprofession, Integer cstate, String ccontext, AddressVO clocation, String cimage, UserVO userid) {
		this.cid = cid;
		this.cname = cname;
		this.csex = csex;
		this.cage = cage;
		this.cphone = cphone;
		this.cemail = cemail;
		this.cprofession = cprofession;
		this.cstate = cstate;
		this.ccontext = ccontext;
		this.clocation = clocation;
		this.cimage = cimage;
		this.userid = userid;
	}

	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public Integer getCage() {
		return cage;
	}
	public void setCage(Integer cage) {
		this.cage = cage;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCprofession() {
		return cprofession;
	}
	public void setCprofession(String cprofession) {
		this.cprofession = cprofession;
	}
	public Integer getCstate() {
		return cstate;
	}
	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}
	public String getCcontext() {
		return ccontext;
	}
	public void setCcontext(String ccontext) {
		this.ccontext = ccontext;
	}
	
	
	public AddressVO getClocation() {
		return clocation;
	}
	public void setClocation(AddressVO clocation) {
		this.clocation = clocation;
	}
	public String getCimage() {
		return cimage;
	}
	public void setCimage(String cimage) {
		this.cimage = cimage;
	}
	public UserVO getUserid() {
		return userid;
	}
	public void setUserid(UserVO userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "ClientVO [cid=" + cid + ", cname=" + cname + ", csex=" + csex + ", cage=" + cage + ", cphone=" + cphone
				+ ", cemail=" + cemail + ", cprofession=" + cprofession + ", cstate=" + cstate + ", ccontext="
				+ ccontext + ", clocation=" + clocation + ", cimage=" + cimage + ", userid=" + userid + "]";
	}
	
	
}
