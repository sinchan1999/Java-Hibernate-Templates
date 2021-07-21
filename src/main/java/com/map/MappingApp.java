package com.map;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

public class MappingApp {
	
	public static void main( String[] args )
    {
      
    
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
       // Creating Question objects
       Question q1=new Question();
       q1.setQuestionId(1204);
       q1.setQuestion("What is your Name ?");
       
       //Creating Answer objects
       Answer answer=new Answer();
       answer.setAnswerId(2277);
       answer.setAnswer("SINCHAN PANDA");      
       
       
       
    // Creating Question objects
       Question q2=new Question();
       q2.setQuestionId(1211);
       q2.setQuestion("What is RollNo. ?");
       
       //Creating Answer objects
       Answer answer1=new Answer();
       answer1.setAnswerId(2299);
       answer1.setAnswer("17005544");
       
       
       
       q1.setAnswer(answer);    
       q2.setAnswer(answer1);
       
         
       
       // Session
       Session sess = factory.openSession();
       Transaction tx=sess.beginTransaction();
       
       // Saving data
       sess.save(q1);
       sess.save(q2);
       sess.save(answer);
       sess.save(answer1);
       
       
       
       tx.commit();
       sess.close();   
       factory.close();

  }
	
}
	
