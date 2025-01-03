package in.acer.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.acer.beans.Motor;

public class MainApp {
  public static void main(String[] args) {
	
	  ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
	  
	  Motor motor = (Motor)context.getBean(Motor.class);
	  motor.doWork();
	  
	  ConfigurableApplicationContext cfct = (ConfigurableApplicationContext)context;
	  cfct.registerShutdownHook();//close that method when JVM is close
	  //cfct.close();//manually we are closing directly 
}
}
