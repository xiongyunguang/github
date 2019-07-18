package com.servlet.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.client.ClientService;
import com.vo.AddressVO;
import com.vo.ClientVO;
import com.vo.UserVO;

@Controller
public class ClientAdd {
	@Autowired
	private ClientService clientService;
	
	private static Logger log=LogManager.getLogger();

	@RequestMapping("/addClient")
	public ModelAndView addClient(ClientVO c,String location,String cuid) {
		
		ModelAndView modelView=new ModelAndView();
		
		/*
		 * ClientVO c=new ClientVO(); AddressVO a=new AddressVO(); UserVO u=new
		 * UserVO(); u.setUid(1); a.setAid(1);
		 * 
		 * c.setCage(18); c.setCcontext("hao,henhao,feichanghao");
		 * c.setCemail("888888@qq.com"); c.setCimage("111111");
		 * c.setCprofession("666666"); c.setCsex("Å®"); c.setUserid(u); c.setCstate(1);
		 * c.setClocation(a); c.setCname("á¯Ñà");
		 */
		
		boolean b=clientService.addClient(c,location,cuid);
		
		log.debug("*****************************"+b);
		if (b) {
			modelView.setViewName("forward:/showAllClient");
		} else {
			modelView.setViewName("/addclienterror.jsp");
		}
		
		return modelView;
	}

}
