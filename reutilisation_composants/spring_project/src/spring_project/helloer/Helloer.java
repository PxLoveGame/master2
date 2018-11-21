package spring_project.helloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import spring_project.printer.IPrinter;

@Component("helloer")
public class Helloer implements IHelloer{

	@Value("Bonjours tout le monde !")
	private String msg;
	
	@Autowired
	@Qualifier("graphical")
	private IPrinter myPrinter;
	

	
	public void sayHello() {
		myPrinter.printHello(msg);
		//myGraphicPrinter.printHello(msg);
	}
	
	
	public void setmsg(String msg){
		this.msg = msg;
	}
	
	/*
	 * 
	@Autowired
	@Qualifier("myGraphicPrinter")
	public void setmyGraphicPrinter(IPrinter myGraphicPrinter) {
		this.myGraphicPrinter = myGraphicPrinter;
	}
	
	*/

}
