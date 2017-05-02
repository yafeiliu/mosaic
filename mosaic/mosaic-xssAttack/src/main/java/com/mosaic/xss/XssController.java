package com.mosaic.xss;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘亚飞:
 * @version 创建时间：2017年4月27日 下午3:23:40
 */
@Controller
@RequestMapping(value = "/xss")
public class XssController {
	@GetMapping(value = "/xssGet")
	public String test1() {
		return "xss1";
	}

	@PostMapping(value = "/xssPost")
	public String test2(ServletRequest request) {

		String search3 = request.getParameter("search3");
		System.out.println(search3);
		return "xss2";
	}
}
