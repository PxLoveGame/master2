package spring_project.printer;

import org.springframework.stereotype.Component;

@Component("textual")
public class Printer implements IPrinter {

	
	public void printHello(String msg){
		System.out.println("message : " + msg);
	}
}
