package com.junit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
import com.dao.user.UserDao;
import com.dao.user.impl.UserDaoImpl;
import com.service.user.UserService;
import com.service.user.impl.UserServiceImpl;
import com.vo.UserVO;

public class UserDaoTest {
	private static AnnotationConfigApplicationContext context;
	private static Logger log;
	
	private UserDao userDao;
	private UserService userService;

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
		userDao = context.getBean(UserDaoImpl.class);
		userService = context.getBean("userServiceImpl",UserServiceImpl.class);
	}

	@After
	public void tearDown() throws Exception {		
	}

	@Test
	@Ignore
	public void test() {
		
	}
	
	@Test
	public void testShowOneUser() {
		UserVO u = new UserVO();
		u.setUid(1);
		u = userDao.showOneUser(u);
		log.debug("*********************"+u);
		assertTrue(u.getUname() != null);
	}
}
