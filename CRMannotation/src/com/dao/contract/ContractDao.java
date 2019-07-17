package com.dao.contract;

import java.util.List;

import com.vo.ClientVO;
import com.vo.ContractVO;
import com.vo.UserVO;

public interface ContractDao {
//	  |-新增合同：图片及合同必要信息   在新增合同后对客户的状态进行更改
//    |-查看合同：只能查看未归档状态的合同，只能查看自己签订的合同
//    |-修改合同：只能修改未成交合同的日期以及状态
	
	//传入合同对象  生成新合同
	public boolean addNewContract(ContractVO c);
	
	//传入合同对象  获取该合同，id
	public ContractVO showOneContract(ContractVO c);
	
	//传入合同对象   修改合同信息
	public boolean changeContract(ContractVO c);
	
	//传入用户对象   获取其所有合同，id
	public List<ContractVO> showOwnerContract(UserVO u);
	
	//传入客户对象 获取合同信息，id
	public List<ContractVO> showCidContract(ClientVO c);
}
