package com.dao.job;

import java.util.List;

import com.vo.JobVO;
import com.vo.UserVO;

public interface JobDao {
//	  |-新增：
//  |-查看：只能查看受自己的工作安排
//  |-修改：对已有工作安排的完成状态修改
	
	//传入工作对象  添加新的工作
	public boolean addNewJob(JobVO j);
	
	//传入工作对象  修改工作信息
	public boolean changeJob(JobVO j);
	
	//传入工作对象  获取该工作
	public JobVO showOneJob(JobVO j);
	
	//传入用户对象  获取其所有工作
	public List<JobVO> showOwnerJob(UserVO u);
	
}
