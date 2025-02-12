package com.mysite.jgo.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jgo/dashboard")
public class DashboardController {
	@GetMapping("/list")
	@ResponseBody
	public String list() {
		return "dashboard_list";
	}
}
