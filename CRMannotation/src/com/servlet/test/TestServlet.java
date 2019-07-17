package com.servlet.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.service.user.UserService;
import com.vo.AddressVO;
import com.vo.UserVO;

@Controller
public class TestServlet {
	
	@Autowired
	public UserService userService;
	
	@RequestMapping("/findOneUser")
	public ModelAndView findOneUser() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("*********************************");
		
		UserVO u = new UserVO();
		u.setUid(1);
		
		u =  userService.showOneUser(u);
		List<UserVO> nlist = userService.showOwnerUser(u);	
		
		System.out.println("***************************"+u.getUname());
		
		System.out.println("***************************"+nlist.get(0).getUname());
		
		modelAndView.setViewName("index.jsp");
		
		return modelAndView;
	}
	
	//ajax
	@RequestMapping("/ajaxTest")
	@ResponseBody
	public List<UserVO> ajaxTest(@RequestBody List<UserVO> list){
		
		System.out.println("******************************"+list);
		
		List<UserVO> nlist = new ArrayList<UserVO>();
		nlist.add(userService.showOneUser(list.get(0)));
		nlist.add(userService.showOneUser(list.get(1)));
		
		//System.out.println(nlist.get(0).getUname());	
		return nlist;		
	}
	
	@RequestMapping("/testCharSet/{uid}/{uname}")
	public ModelAndView testCharSet(@PathVariable(name = "uid") String uid,@PathVariable(name = "uname") String uname) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		UserVO u = new UserVO();
		u.setUid(Integer.valueOf(uid));
		u.setUname(uname);
		
		System.out.println("***************************"+u.getUname());
				
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
	
	
	
	
}
