package com.service.contract;

import java.util.List;

import com.vo.ClientVO;
import com.vo.ContractVO;
import com.vo.UserVO;

public interface ContractService {

	//传入合同对象  生成新合同
	public String addNewContract(ContractVO c);
	
	//传入合同对象  获取该合同
	public ContractVO showOneContract(ContractVO c);
	
	//传入合同对象   修改合同信息
	public String changeContract(ContractVO c);
	
	//传入用户对象   获取其所有合同，id
	public List<ContractVO> showOwnerContract(UserVO u);
	
	//传入客户对象 获取合同信息，id
	public List<ContractVO> showCidContract(ClientVO c);
}
