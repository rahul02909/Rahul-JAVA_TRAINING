package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@GetMapping("/name")
	public String name()
	{
		return "RAHUL";
	}
	@GetMapping("/id")
	public int id()
	{
		return 10;
	}
	@GetMapping("/place")
	public String place()
	{
		return "CHENNAI";
	}
}
