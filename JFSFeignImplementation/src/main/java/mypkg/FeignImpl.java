package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignImpl {

	@Autowired
	FeignInterface feigninterface;
	
	@GetMapping("/username")
	public String getname()
	{
		return feigninterface.getname();
	}
	@GetMapping("/id")
	public String id()
	{
		return feigninterface.getid();
	}
	@GetMapping("/place")
	public String place()
	{
		return feigninterface.getplace();
	}
	
}
