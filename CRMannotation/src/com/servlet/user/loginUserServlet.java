package com.servlet.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.user.UserService;
import com.vo.UserVO;

@Controller
public class loginUserServlet {
	
	@Autowired
	public  UserService   userService;
	
	@RequestMapping("/loginuser")
	public ModelAndView loginUser(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView   model  = new   ModelAndView();
		
		UserVO   uvo = new   UserVO();
		uvo.setUpassword(arg0.getParameter("password"));
		uvo.setUaccount(arg0.getParameter("account"));
		
		UserVO  uu=userService.showOneUser(uvo);
		if(uu!=null) {
			arg0.getSession().setAttribute("user",uu);
			// 标识  upost   用户职务(经理0、员工1)
			if("1".equals(uu.getUpost())) {
				model.setViewName("/index.jsp");
			}else {
				model.setViewName("/users/index.jsp");
			}
		}else{
			//  返回登录界面
			model.setViewName("/login.jsp");
		}
		return  model;
	}
	
	
}
