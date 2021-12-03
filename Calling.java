import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calling implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		
		Calls cl = new Calls();
		cl.oneLog(LayoutTester.l1.getText(), e.getActionCommand());
		SwingExampleOne.l.logEntry(cl);
		JFrame t = new JFrame("Calling...");
		t.setBounds(100,100,300,425);
		t.setLayout(new BorderLayout());
		
		JLabel head = new JLabel("Ringing...", SwingConstants.CENTER);
		JPanel pa = new JPanel();
		pa.setLayout(new BoxLayout(pa, BoxLayout.PAGE_AXIS));
		
		JLabel num = new JLabel(LayoutTester.l1.getText(), SwingConstants.CENTER);
		JLabel sim = new JLabel(e.getActionCommand(), SwingConstants.CENTER);
		
		JButton keypad = new JButton("Keypad"), hold = new JButton("Hold"), addCall = new JButton("Add Call"),
		record = new JButton("Record"), speaker = new JButton("Speaker"), endCall = new JButton("End Call");
		
		num.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,25));
		num.setAlignmentX(Component.CENTER_ALIGNMENT);
		sim.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel controls = new JPanel(new GridLayout(4,3));
		
		
		LayoutTester.buttonStyle(keypad, -1);
		LayoutTester.buttonStyle(hold, -1);
		LayoutTester.buttonStyle(addCall, -1);
		LayoutTester.buttonStyle(record, -1);
		LayoutTester.buttonStyle(speaker, -1);
		LayoutTester.buttonStyle(endCall, -1);
		
		controls.add(keypad);
		controls.add(hold);
		controls.add(addCall);
		controls.add(record);
		controls.add(speaker);
		controls.add(endCall);
		
		endCall.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t.dispatchEvent(new WindowEvent(t, WindowEvent.WINDOW_CLOSING));
				LayoutTester.l1.setText("");
			}
		});
		
		keypad.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton back = new JButton("Back");
				pa.remove(controls);
				pa.add(LayoutTester.nums);
				//pa.addActionListener(new ActionListener(){
				//	public void actionPerformed(ActionEvent e){
				//		System.out.println(e.getActionCommand());
				//	}
				//});
				pa.revalidate();
				
			}
		});
		
		hold.addActionListener(new DialogBox());
		addCall.addActionListener(new DialogBox());
		record.addActionListener(new DialogBox());
		speaker.addActionListener(new DialogBox());
		
		pa.add(num);
		pa.add(sim);
		pa.add(controls);
		t.add(head, "North");
		t.add(pa, "Center");
		t.setVisible(true);
	}
	
}