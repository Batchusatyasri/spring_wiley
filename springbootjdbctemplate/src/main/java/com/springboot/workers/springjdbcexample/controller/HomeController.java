package com.springboot.workers.springjdbcexample.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.workers.springjdbcexample.util.DateTimeUtilities;
@RestController
public class HomeController
{
	@GetMapping("/")
	public String index()
	{
		return "<h2> Hello Visitor!\n The Visited time: "+DateTimeUtilities.getTimeStamp
				()+" "+"</h2>";
	}
}
