import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Logs{
	private ArrayList<Calls> log;
	public Logs(){
		log = new ArrayList<Calls>();
	}
	public void logEntry(Calls cl){
		log.add(cl);
		System.out.println("Log save aairuchu da");
	}
	
	public ArrayList<Calls> getLogs(){return log;}

}
