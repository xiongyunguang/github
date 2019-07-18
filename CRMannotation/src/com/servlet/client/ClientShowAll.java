package com.servlet.client;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.client.ClientService;
import com.vo.ClientVO;
import com.vo.UserVO;

@Controller
public class ClientShowAll {
	
	private static Logger log=LogManager.getLogger();
	
	@Autowired
	private ClientService clientService;

	@RequestMapping("/showAllClient")
	public ModelAndView showAllClient(){
		
		ModelAndView modelAndView = new ModelAndView();
		/************8���ϵ�ʱ����Ҫ�޸�*********/
		UserVO user = new UserVO();
		user.setUid(2);
		/************8���ϵ�ʱ����Ҫ�޸�*********/
		
		
		List<ClientVO> list= clientService.showAllClient(user);
				
		modelAndView.addObject("allClient", list);
		
		modelAndView.setViewName("/findclient.jsp");
		
		return modelAndView;
	}

}
