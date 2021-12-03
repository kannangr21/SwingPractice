package caller.style;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogBox implements  ActionListener{
	public void actionPerformed(ActionEvent e){
		JFrame box = new JFrame("Call Operation");
		box.setBounds(350,350,200,150);
		box.setLayout(new BorderLayout());
		JLabel label = new JLabel("");
		if(e.getActionCommand() == "Hold"){
			label.setText("Your call is on hold!");
		}
		else if(e.getActionCommand() == "Add Call"){
			label.setText("You can add calls in a mobile");
		}
		else if(e.getActionCommand() == "Record"){
			label.setText("Call Recording.....");
		}
		else if(e.getActionCommand() == "Speaker"){
			label.setText("Speakers On! Can you hear me??");
		}
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				box.dispatchEvent(new WindowEvent(box, WindowEvent.WINDOW_CLOSING));
			}
		});
		box.add(label, "Center");
		box.add(back, "South");
		box.setVisible(true);
	}
}