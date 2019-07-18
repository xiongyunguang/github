package com.service.client;

import java.util.List;

import com.vo.ClientVO;
import com.vo.UserVO;

public interface ClientService {
	//传入客户对象  查询这一客户所有信息
	public ClientVO showOneClient(ClientVO c);
	
	//查询登录员工的所有客户
	public List<ClientVO> showAllClient(UserVO user);
	
	//录入新增用户信息
	public boolean addClient(ClientVO c,String clocation,String cuid); 
		
	//修改信息
	public boolean changeClient(ClientVO c,String clocation);
}
