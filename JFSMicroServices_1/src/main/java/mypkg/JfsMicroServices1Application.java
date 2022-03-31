package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@SpringBootApplication
@EnableHystrix
public class JfsMicroServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(JfsMicroServices1Application.class, args);
	}
	@RequestMapping(value="/")
	@HystrixCommand(fallbackMethod="fallback_fault", commandProperties= {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1000")})
	
	public String fault() throws InterruptedException {
		Thread.sleep(2000);
		
		return "Welcome !!! Hystrix Fault Tolarence enabled";
	}
	
	public String fallback_fault() {
		return "Its takes longer time than usual";
	}

}


