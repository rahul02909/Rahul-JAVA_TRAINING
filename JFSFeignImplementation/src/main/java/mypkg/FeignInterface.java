package mypkg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value="feigndemo",url="http://localhost:8080")
public interface FeignInterface {
	
	@GetMapping("/name")
	String getname();
	@GetMapping("/id")
	String getid();
	@GetMapping("/place")
	String getplace();

}
