package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate restTemplate; 
	
//	@GetMapping("/home")
//	public String home()
//	{
//		String cricket=restTemplate.getForObject("http://localhost:8082/cricket", String.class);
//		return cricket;
//		
//		//return "Welcome To Home Page";
//		
//	}
	
	@GetMapping("/home")
	//public String home() {
		public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		String product=restTemplate.getForObject("http://Microservice2/cricket",String.class);
		mv.addObject("product",product);
		mv.setViewName("check");
		return mv;
	}
	
}