package Jfs.ECommerceWithDependency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ECommerceWithDependencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceWithDependencyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner clr(ApplicationContext Context)
	{
		return args->{
			String[] beanNames= Context.getBeanDefinitionNames();
			System.out.println("Let see the Beans:");
			for(String b:beanNames)
			{
				System.out.println(b);
			}
		};
	}
	
}
