package Assignment1;

import java.util.*;
import java.lang.*;


public class pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	//initialize
	public pet() {
		name = "";
		age = 0;
		location = "";
		type = "";
	}
	
	//set data
	public void setData(String setName, int setAge, String setLocation){
		this.name = setName; 
		this.age = setAge;
		this.location = setLocation;
	}
	
	//get data
	public static Object[] getData(String getName, int getAge, String getType){
		String gname = getName; 
		int gage = getAge;
		String gtype = getType;
		
		return new Object[] { gname, gage, gtype};
	}
	

}
