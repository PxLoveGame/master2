package spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring_project.helloer.IHelloer;

public class App {

	public static void main(String[] args) {
		

		ApplicationContext ctx = new FileSystemXmlApplicationContext("config.xml");
		IHelloer hey = (IHelloer) ctx.getBean("helloer");
		
		hey.sayHello();
		

	}

}
