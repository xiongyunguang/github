package com.service.client.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.client.ClientDao;
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
	public boolean addClient(ClientVO c) {
		
		return clientDao.addNewClient(c);
	}


	@Override
	public boolean changeClient(ClientVO c) {
		
		return clientDao.changeClient(c);
	}
	
}
