package com.junit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.conf.ApplicationConfig;
import com.dao.job.JobDao;
import com.dao.job.impl.JobDaoImpl;
import com.dao.user.UserDao;
import com.dao.user.impl.UserDaoImpl;
import com.service.job.JobService;
import com.service.job.impl.JobServiceImpl;
import com.service.user.UserService;
import com.service.user.impl.UserServiceImpl;
import com.vo.JobVO;
import com.vo.UserVO;

public class JobTest {
	private static AnnotationConfigApplicationContext context;
	private static Logger log;
	
	private JobDao jobDao;
	private JobService jobService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		log = LogManager.getLogger();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.registerShutdownHook();
	}

	@Before
	public void setUp() throws Exception {
		jobDao = context.getBean(JobDaoImpl.class);
		jobService = context.getBean(JobServiceImpl.class);
	}

	@After
	public void tearDown() throws Exception {		
	}

	@Test
	@Ignore
	public void test() {
		
	}
	
	@Test
	public void testShowOneJob() {
		
		JobVO j = new JobVO();
		
		j.setJid(1);
		
		log.debug("**************************************"+jobDao.showOneJob(j).getJid());
		
		j = jobDao.showOneJob(j);
		
		UserVO u = new UserVO();
		u.setUid(3);
		
		List<JobVO> list = jobDao.showOwnerJob(u);
		
		log.debug(list.size()+"**************************************"+list);
		log.debug("**************************************"+list.get(0).getJid());
		log.debug("**************************************"+j.getJid());
		//assertTrue(j.getJid()==1);
	}
}
