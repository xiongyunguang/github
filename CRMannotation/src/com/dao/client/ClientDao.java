package com.dao.client;

import java.util.List;

import com.vo.ClientVO;
import com.vo.UserVO;

public interface ClientDao {
//	  |-查看：只能查看受自己管理的客户(客户的基本信息)
//    |-新增：必须记录客户的姓名、联系方式、客户状态
//    |-修改：客户的状态
	
	//传入客户对象  查询这一客户所有信息
	public ClientVO showOneClient(ClientVO c);
	
	//传入客户对象  新增客户
	public boolean addNewClient(ClientVO c);
	
	//传入客户对象  修改客户信息
	public boolean changeClient(ClientVO c);
	
	//传入用户对象  获取其下所有客户信息
	public List<ClientVO> showOwnerClient(UserVO u);
	
}
