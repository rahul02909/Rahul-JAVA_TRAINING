package mypkg;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages= {"com.netflix.client.config.IClientConfig"})
@RestController
@RibbonClient(name="JFS-RibbonApp",configuration=RibbonConfig.class)
public class JfsRibbonImplementationApplication {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/load-balancing")
	public String callService() {
		return restTemplate.getForObject("http://localhost:8088/app",String.class);
	}
	
	@Bean
	public RestTemplate createTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(JfsRibbonImplementationApplication.class, args);
	}

}
