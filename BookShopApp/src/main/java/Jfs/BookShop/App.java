package Jfs.BookShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	MyBook mybook=context.getBean(MyBook.class);
//    	mybook.displayMyBook();
//    	mybook.Count();
    	
    	Thriller thriller=context.getBean(Thriller.class);
    	thriller.thrillerBook();
    }
}
