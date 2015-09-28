package temp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Greeter msg = (Greeter) context.getBean("greeter");
		String result = msg.getGreeting();
		System.out.println(result);
	}

}
