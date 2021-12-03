package caller.style;

import caller.style.*;
import caller.history.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutTester extends JFrame{
	public static JLabel l1;
	public static JButton b1 = new JButton("1"), b2 = new JButton("2"), b3 = new JButton("3"),
	b4 = new JButton("4"), b5 = new JButton("5"), b6 = new JButton("6"),
	b7 = new JButton("7"), b8 = new JButton("8"), b9 = new JButton("9"),
	bs = new JButton("+"), b0 = new JButton("0"), bb = new JButton("Del"),
	s1 = new JButton("Sim 1"), s2 = new JButton("Sim 2"), lo = new JButton("Logs");
	public static JPanel nums = new JPanel(new GridLayout(4, 3, 10, 10));
	public LayoutTester(){
		setTitle("Dummy Dialpad");
		setBounds(100,100,300,425);
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout(50,50));
		
		l1 = new JLabel("", SwingConstants.CENTER);
		l1.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,25));
		
		
		
		buttonStyle(b1,0);buttonStyle(b2,0);buttonStyle(b3,0);buttonStyle(b4,0);
		buttonStyle(b5,0);buttonStyle(b6,0);buttonStyle(b7,0);buttonStyle(b8,0);
		buttonStyle(b9,0);buttonStyle(b0,0);buttonStyle(bb,0);buttonStyle(bs,0);
		
		nums.add(b1);nums.add(b2);nums.add(b3);
		nums.add(b4);nums.add(b5);nums.add(b6);
		nums.add(b7);nums.add(b8);nums.add(b9);
		nums.add(bs);nums.add(b0);nums.add(bb);
		
		JPanel keys = new JPanel(new FlowLayout());
		keys.add(s1); keys.add(s2); keys.add(lo);
		
		pane.add(l1,"North");
		pane.add(nums, "Center");
		pane.add(keys, "South");
	
		b1.addActionListener(new AddNumber());
		b2.addActionListener(new AddNumber());
		b3.addActionListener(new AddNumber());
		b4.addActionListener(new AddNumber());
		b5.addActionListener(new AddNumber());
		b6.addActionListener(new AddNumber());
		b7.addActionListener(new AddNumber());
		b8.addActionListener(new AddNumber());
		b9.addActionListener(new AddNumber());
		b0.addActionListener(new AddNumber());
		bs.addActionListener(new AddNumber());
		bb.addActionListener(new AddNumber());
		s1.addActionListener(new Calling());
		s2.addActionListener(new Calling());
		lo.addActionListener(new LogHistory()); 
	}
	
	public static void buttonStyle(JButton jb, int i){
		jb.setBorder(BorderFactory.createEmptyBorder());
		jb.setOpaque(false);
		jb.setContentAreaFilled(false);
        jb.setBorderPainted(false);
        jb.setFocusPainted(false);
		if(i == 0)
		jb.setFont(new java.awt.Font("Arial",java.awt.Font.BOLD,27));		
	}
}

