package JFS.JFS_Hibernate_XmlConfig;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	//Configuration
    	Configuration config=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Person.class);;
    	
    	//ServiceRegistry
    	ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings
    			(config.getProperties()).buildServiceRegistry();
    	
    	//Sessionfactory
    	SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
    	
    	//Session Open
    	Session session=sessionFactory.openSession();
    	
    	//Session Transaction
    	session.beginTransaction();
  
    	Query q=session.createQuery("from Person");
    	
    	List<Person> l=q.list();
    	for(Person p:l)
    	{
    		System.out.println(p);
    	}
    	
    	Query q1=session.createQuery("from Person where pid>1");
    	System.out.println(q1.uniqueResult());
    	
    	

    	
    	session.getTransaction().commit();
    	
    	Laptop laptop=new Laptop();
    	Laptop lap1=new Laptop();
        Person person=new Person();
        Person person1=new Person();
    	
    	//inserting in db
    	laptop.setLid(7);
    	laptop.setBrand("SAMSUNG");
    	laptop.setPrice(120000);
    	
    	
    	
        //Updating in the db
    	lap1.setPrice(200000);

    	
    	//delete in db
    	
    	session.delete(lap1);
    	session.getTransaction().commit();
    	
    	lap1.setLid(8);
    	lap1.setBrand("ASUS");
    	lap1.setPrice(100000);
    	lap1.setPrice(280000);
    	
    	

        person.setPid(103);
        person.setPname("MOHAN");
        person.getLaptop().add(laptop);
        person1.setPid(104);
        person1.setPname("RAM");
        person1.getLaptop().add(lap1);
    	
    	
    	session.save(laptop);
       	session.save(lap1);
    	session.save(person);
    	session.save(person1);
    	

  	
    		
    }
    
}
