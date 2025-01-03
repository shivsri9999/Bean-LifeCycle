package in.acer.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor{
     public Motor() {
    	 System.out.println("Motor::Constructor");
     }
     
     public void m1() throws Exception {
     	System.out.println("Motor Start.....");
     	
     }
//     public void start() {
//    	 System.out.println("Motor Started.....");
//     }
     public void doWork() {
    	 System.out.println("Motor Pulling Water.....");
    	 
     }
     
//     public void stop() {
//    	 System.out.println("Motor Stopped...");
//     }
  
	public void m2() throws Exception {
		System.out.println("Motor Stop.......");
		
	}
   

}
