import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddNumber implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String dialpad = LayoutTester.l1.getText();
		if(e.getSource() instanceof JButton){
			String key = e.getActionCommand();
			if(key == "Del"){
				try{
					dialpad = dialpad.substring(0, dialpad.length()-1);
				}catch(StringIndexOutOfBoundsException error){
					dialpad = "";
				}
			}
			else
			dialpad += e.getActionCommand();
		}
		LayoutTester.l1.setText(dialpad);
	}
}