package com.service.job;

import java.util.List;

import com.vo.JobVO;
import com.vo.UserVO;

public interface JobService {
	    //传入工作对象  获取该工作
		public JobVO showOneJob(JobVO j);
		
		//传入用户对象  获取该用户的所有工作
		public List<JobVO> showOwnerJob(UserVO u);
		
		//传入工作对象  添加新的工作
		public boolean addNewJob(JobVO j);
		
		//传入工作对象  更新该工作
		public boolean changeJob(JobVO j);
}
