package caller;

import caller.style.*;
import caller.history.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class SwingExampleOne{
	public static Logs l = new Logs();
	public static void main(String args[]){
		JFrame f = new LayoutTester();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}