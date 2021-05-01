package comm.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
	
	
	public static void main(String[] args) {
		
		ApplicationContext contest=new ClassPathXmlApplicationContext("beans.xml");
		Message msg=(Message)getBean(Message.class);
	}

	
	

}
