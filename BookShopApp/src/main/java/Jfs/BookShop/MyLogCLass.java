package Jfs.BookShop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyLogCLass {
	
	
	

//	@Before(value= "execution(public void thrillerBook())")
//	public void beforeDisp1(){
//		System.out.println("Log info: to be displayed Before Thriller");
//	}
//	
//	@After(value= "execution(public void thrillerBook())")
//	public void afterDisp1()
//	{
//		System.out.println("Log info: to be displayed After Thriller");
//	}
//	
	
//	@Before(value= "execution(public void displayMyBook())")
//	public void beforeDisp(){
//		System.out.println("Log info: to be displayed Before");
//	}
//	
//	@After(value= "execution(public void displayMyBook())")
//	public void afterDisp()
//	{
//		System.out.println("Log info: to be displayed After");
//	}
//	@AfterReturning(value="execution(public Integer Count())",returning="Count")
//	public void afterReturning()
//	{
//		System.out.println("-----------------------------------");
//		System.out.println("Log info: Displayed After Returning");
//		System.out.println("-----------------------------------");
//	}
//	@Pointcut("execution(* displayMyBook(..))")
//	public void ptcut()
//	{
//		
//	}
//	@Around("ptcut()")
//	public void Aroundptcut()
//	{
//		System.out.println("Log info: Around Annotation");
//	}
	
	@Before(value= "execution(public void thrillerBook())")
	public void beforeDisp2(JoinPoint jointpoint){
		System.out.println("***********************************");
		System.out.println("Log info: to be displayed Before Thriller");
		System.out.println("Sorce Location : "+jointpoint.getSourceLocation());
		System.out.println("Class Name     : "+jointpoint.getClass().getName());
		System.out.println("Hash Code      : "+jointpoint.getKind().hashCode());
		System.out.println("Target         : "+jointpoint.getTarget().toString());
		System.out.println("Static Part    : "+jointpoint.getStaticPart());
		System.out.println("***********************************");
	}
	
	@After(value= "execution(public void thrillerBook())")
	public void afterDisp2(JoinPoint jointpoint)
	{
		System.out.println("***********************************");
		System.out.println("Log info: to be displayed After Thriller");
		System.out.println("Arguments      : "+jointpoint.getArgs());
		System.out.println("Declaring Type : "+jointpoint.getSignature().getDeclaringType());
		System.out.println("***********************************");
	}
		
	
}
