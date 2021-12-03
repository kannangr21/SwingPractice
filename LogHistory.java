package caller.history;

import caller.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LogHistory implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
		JFrame f = new JFrame("Log History");
		JButton b = new JButton("Back");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f.dispose();
			}
		});
		f.setBounds(100,100,300,425);
		f.setLayout(new BorderLayout());
		
		Object list[][] = new Object[SwingExampleOne.l.getLogs().size()][2];
		
		int i = 0;
		for(i=0; i<SwingExampleOne.l.getLogs().size(); i++){
			list[i] = SwingExampleOne.l.getLogs().get(i).getDet();
		}
		String columns[] = new String[2];
		columns[0] = "";
		columns[1] = "";
		JTable table = new JTable(list,columns);
		JScrollPane pane = new JScrollPane(table);
		f.add(pane, "Center");
		f.add(b, "South");
		f.setVisible(true);
	}
}