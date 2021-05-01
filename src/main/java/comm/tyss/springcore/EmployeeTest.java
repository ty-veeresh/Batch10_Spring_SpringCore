package comm.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee) context.getBean("emp2");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		
		
		
	}
	
}
