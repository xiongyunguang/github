package com.service.client.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.client.ClientDao;
import com.vo.AddressVO;
import com.service.client.ClientService;
import com.vo.ClientVO;
import com.vo.UserVO;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	public ClientDao clientDao;


	@Override
	public ClientVO showOneClient(ClientVO c) {
		
		return clientDao.showOneClient(c);
	}


	@Override
	public List<ClientVO> showAllClient(UserVO user) {
		
		return clientDao.showOwnerClient(user);
	}


	@Override
	public boolean addClient(ClientVO c,String clocation,String cuid) {
		//将前端传入的地区的id(字符串类型)绑定到client对象中
		AddressVO a=new AddressVO();
		a.setAid(Integer.parseInt(clocation));
		
		//将前端传入的员工的id(字符串类型)绑定到client对象中
		UserVO u=new UserVO();
		u.setUid(Integer.parseInt(cuid));
		
		c.setClocation(a);
		c.setUserid(u);
		
		return clientDao.addNewClient(c);
	}


	@Override
	public boolean changeClient(ClientVO c,String clocation){
		AddressVO a=new AddressVO();
		a.setAid(Integer.parseInt(clocation));
		c.setClocation(a);
		return clientDao.changeClient(c);
	}
	
}
