package spring_project.printer;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

@Component("graphical")
public class GraphicalPrinter implements IPrinter {

	@Override
	public void printHello(String msg) {
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
