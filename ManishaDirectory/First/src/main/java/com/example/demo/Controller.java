package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private WebService webService;

	@RequestMapping("/myfirst")
	public String Hello() {
		return webService.supportedHello();

	}

	@Component
	class WebService {
		public String supportedHello() {
			return "Dependency injection";

		}
	}
}
