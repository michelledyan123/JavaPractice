package Assignment1;

import java.util.*;
import java.lang.*;


public class car {
	private String carMake;
	private String carModel;
	private int carYear;
	
	//initialize
	public car() {
		carMake = "";
		carModel = "";
		carYear = 0;
	}
	
	public car(String carMK, String carMD) {
		carMake = carMK;
		carModel = carMD;
	}
	
	public car(String carMK, String carMD, int carYR ) {
		carMake = carMK;
		carModel = carMD;
		carYear = carYR;
	}
	
	//set data
	public void setData(String setCarMake, String setCarModel, int setCarYear){
		this.carMake = setCarMake; 
		this.carModel = setCarModel;
		this.carYear = setCarYear;
	}
	
	//get data
	public static Object[] getData(String getCarMake, String getCarModel, int getCarYear){
		String gCMK = getCarMake; 
		String gCMD = getCarModel;
		int gCYR = getCarYear;
		
		return new Object[] { gCMK, gCMD, gCYR};
	}
	
	//return string	   
	public static String retString(String rs) {
	      String retStrg;
	      retStrg = rs;
	      return retStrg;
	}
	
	//return boolean	   
	public Boolean retBoolean() {
	      boolean retBool =true;
	      return retBool;
	}
	

}
