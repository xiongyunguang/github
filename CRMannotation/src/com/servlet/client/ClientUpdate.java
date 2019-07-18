package com.servlet.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.client.ClientService;
import com.vo.ClientVO;

@Controller
public class ClientUpdate {

	@Autowired
	private ClientService clientService;

	private static Logger log = LogManager.getLogger();

	/*
	 * @RequestMapping("/updateClient")
	 * 
	 * @ResponseBody public ModelAndView updateClient(@RequestBody
	 * HttpServletRequest request) { ModelAndView modelView=new ModelAndView();
	 * 
	 * 
	 * ClientVO client=new ClientVO(); if(request.getParameter("cid")!=null) {
	 * client.setCid(Integer.parseInt(request.getParameter("cid"))); }
	 * if(request.getParameter("cprofession")!=null) {
	 * client.setCprofession(request.getParameter("cprofession")); }
	 * client.setCstate(2); client.setCname("琪琪");
	 * 
	 * 
	 * 
	 * 
	 * log.debug("已更新的客户信息：**************************************************"+c);
	 * //获得从findclient.jsp传入的需要修改的客户id
	 * 
	 * boolean b=clientService.changeClient(c);
	 * log.debug("是否更新成功：****************************************88"+b); if(b) {
	 * modelView.setViewName("forward:/showAllClient"); }else {
	 * modelView.setViewName("/addclienterror.jsp"); }
	 * 
	 * 
	 * return modelView; }
	 */

	@RequestMapping("/updateClient")
	public ModelAndView updateClient(@ModelAttribute ClientVO c,String location) {
		
		ModelAndView modelView = new ModelAndView();
		
		boolean b = clientService.changeClient(c,location);
		
		if (b) {
			modelView.setViewName("forward:/showAllClient");
		} else {
			modelView.setViewName("/addclienterror.jsp");
		}

		return modelView;
	}

}
