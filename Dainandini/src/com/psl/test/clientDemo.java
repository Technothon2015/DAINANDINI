package com.psl.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Event;
import com.psl.bean.EventPriority;
import com.psl.bean.EventStatus;
import com.psl.bean.EventType;
import com.psl.bean.Expense;
import com.psl.bean.ExpenseType;
import com.psl.bean.User;

public class clientDemo {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    SessionFactory sf=cfg.buildSessionFactory();  
	    Session session=sf.openSession();  
	    Transaction tx=session.beginTransaction();  
	      
	    User user1=new User();
	    user1.setUsername("rahul");
	    user1.setPassword("rahul");
	    user1.setFirstName("firstName");
	    user1.setLastName("lastName");
	    user1.setHomeAddress("homeAddress");
	    user1.setOfficeAddress("officeAddress");
	    user1.setProfilePicture("profilePicture");
	    
	    Expense expense1 = new Expense();
	    expense1.setUsername(user1.getUsername());
	    expense1.setExpenseAmount(100);
	    expense1.setExpenseType(ExpenseType.others);
	    expense1.setExpenseDescription("SUTTA");
	    expense1.setExpenseDate(new Date());
	    
	    Event event1=new Event();
	    event1.setUsername("Ashay");
	    event1.setEventType(EventType.Home);
	    event1.setEventDescription("TP");
	    event1.setPostDate(new Date());
	    event1.setEventStatus(EventStatus.Pending); 
	    event1.setEventPriority(EventPriority.High);
	    
	    session.persist(user1);
	    session.persist(expense1);
	    session.persist(event1);
	    
	    tx.commit();  
	      
	    session.close();  
		System.out.println("Done");
	}

}
