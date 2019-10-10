package com.prem.hello_world;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApplicationConfiguration {

	@RequestMapping("hello")
	public String hello()
	{
		return "Hello from Prem Shab !!!";
	}
	@RequestMapping("welcome")
	public String welcome()
	{
		return "Welcome from Mr.Prem !!!";
	}
}
