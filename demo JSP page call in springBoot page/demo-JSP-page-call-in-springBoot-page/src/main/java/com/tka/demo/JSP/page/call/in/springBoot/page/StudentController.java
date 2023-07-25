package com.tka.demo.JSP.page.call.in.springBoot.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

	@RequestMapping("loginPage")
	String loginPage() {
		return "login.jsp";

	}

	@RequestMapping("homePage")
	String homePage() {
		return "home.jsp";
	}

	@RequestMapping("aboutPage")
	String aboutPage() {
		return "about.jsp";
	}

	@RequestMapping("serverPage")
	String serverPage() {
		return "Server.jsp";

	}

	@RequestMapping("currentPage")
	String currentPage() {
		return "current.jsp";
	}
}
