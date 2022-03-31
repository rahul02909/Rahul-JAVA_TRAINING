package JFS.HQL_Query;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import JFS.HQL_Query.*;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//Configuration
    	Configuration config=new Configuration().configure().addAnnotatedClass(Details.class);
    	config.addAnnotatedClass(Laptop.class);
    	
    	//ServiceRegistry
    	ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings
    			(config.getProperties()).buildServiceRegistry();
    	
    	//Sessionfactory
    	SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
    	
    	//Session Open
    	Session session=sessionFactory.openSession();
    	
    	//Session Transaction
    	session.beginTransaction();
    	
    	Query q=session.createQuery("from Details");
    	
    	List<Details> l=q.list();
    	for (Details d:l)
    	{
    		System.out.println(d);
    	}
    	
    	
    	Query q1=session.createQuery("from Details where id=5");
    	System.out.println("Directly Printing from Query Result:"+q1.uniqueResult());
    	System.out.println("\n");
    	Details d=(Details)q1.uniqueResult();
    	System.out.println("After Assining to a Variable:"+d);
    	
    	
    	Query q2=session.createQuery("update Details set name='John' where id=1");
    	int valueupdate=q2.executeUpdate();
    	
    	System.out.println(valueupdate);
    	
    	System.out.println("\n");
    	
    	Query q3=session.createQuery("delete from Details where id=8");
    	int valuedelete=q3.executeUpdate();
    	
    	System.out.println(valuedelete);
    	System.out.println("\n");
    	Query q4=session.createQuery("from Details d order by d.id desc");
    	List<Details> l1=q4.list();
    	for(Details de:l1)
    	{
    		System.out.println(de);
    	}
    	
    	System.out.println("\n");
    	Query q5=session.createQuery("select d.name from Details d");
    	List<Details> l2=q5.list();
    	for(Object obj:l2)
    	{
    		System.out.println(obj);
    	}
    	System.out.println("\n");
    	Query q6=session.createQuery("select sum(price) from Laptop");
    	System.out.println("Sum Of Priceis "+q6.uniqueResult());
    	
    	System.out.println("\n");
    	System.out.println("----------------------------------------------");
    	
    	
        Query q7=session.createQuery("from Details");  
        List<Details> details = q7.list();
        details.forEach(detail -> {
            System.out.println("ID   is - "+detail.getId());
            System.out.println("Name is - "+detail.getName());
            System.out.println("---------------------");
        });
        
    	System.out.println("\n");
    	
        Query q8=session.createQuery("select avg(price) from Laptop");  
        System.out.println("\nThe Average Of Price is:"+q8.uniqueResult());
        
        
        Query q9 =session.createQuery("select max(price) from Laptop");
        System.out.println("\nThe Maximum Price is:"+q9.uniqueResult());
        
        
        
        Query q10 =session.createQuery("select min(price) from Laptop");
        System.out.println("\nThe Minimmum Price is:"+q10.uniqueResult());
        
        
        Query q11=session.createQuery("from Laptop where price=(select min(price) from Laptop)");
        System.out.println("\n"+q11.uniqueResult());
        
        Query q12=session.createQuery("from Laptop where price=(select max(price) from Laptop)");
        System.out.println("\n"+q12.uniqueResult());
    	
        
       // Query q13=session.createQuery("select Laptop.id,Details.id,Details.name,Laptop.brand,Laptop.price from Details inner join Laptop where Details.id=Laptop.id");
        
        
       
    	session.getTransaction().commit();
    	
    }
}
