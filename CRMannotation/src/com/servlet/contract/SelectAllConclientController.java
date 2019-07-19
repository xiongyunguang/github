package com.servlet.contract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.service.client.ClientService;
import com.vo.ClientVO;
import com.vo.UserVO;

@Controller
@SessionAttributes("Conclient")
public class SelectAllConclientController{
	
	@Autowired
	private ClientService clientService;

	@RequestMapping("/showAllConclient")
	public ModelAndView showAllClient(){
		
		ModelAndView modelAndView = new ModelAndView();
		UserVO user = new UserVO();
		user.setUid(1);	
		
		List<ClientVO> list= clientService.showAllClient(user);
		modelAndView.addObject("Conclient",list);
		modelAndView.setViewName("addcontract.jsp");
		return modelAndView;
	}
}
