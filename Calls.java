package caller.history;

import java.util.*;

public class Calls{
	private String sim, toNum;
	public Calls(){
		sim = toNum = null;
	}
	public Calls(String sim, String toNum){
		this.sim = sim;
		this.toNum = toNum;
	}
	public void oneLog(String s, String n){
		sim = s;
		toNum = n;
	}
	public String[] getDet(){
		String det[] = new String[2];
		det[0] = toNum;
		det[1] = sim;
		return det;}
}