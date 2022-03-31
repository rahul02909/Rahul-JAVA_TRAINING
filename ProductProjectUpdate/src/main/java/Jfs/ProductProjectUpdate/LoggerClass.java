package Jfs.ProductProjectUpdate;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggerClass {
	@Before(value= "execution(public void display())")
	public void beforedisp()
	{
		System.out.println("Log info:Executed Before displayed method");
		System.out.println("-----------------------------------------");
	}
	@After(value= "execution(public void display())")
	public void afterdisp()
	{
		System.out.println("----------------------------------------");
		System.out.println("Log info:Executed After displayed method");
	}
	
//	@Around(value= "execution(public void dummy())")
//	public void arounddisp()
//	{
//		
//		System.out.println("Log info:Around the method");
//	}
	
	@Pointcut("execution(* dummy())")
	public void ptcut()
	{
		
	}
	@Around("ptcut()")
	public void Aroundptcut()
	{
		System.out.println("Log info:Around the method");
	}
	
	
}
