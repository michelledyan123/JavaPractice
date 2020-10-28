package Assignment1;

import java.util.*;
import java.lang.*;


public class Assignment1b {

	public static void main(String[] args) {
		String carUserInputChk;
		Map<String, String> car = new HashMap<String, String>();
		        
        car.put("Honda","CRV");
        car.put("Toyota","RAV4");
        car.put("BMW","X5");
        car.put("Mazda","CX5");
        car.put("Audi","Q5");
		
        Scanner userdata = new Scanner(System.in);
        System.out.print("Enter car model, all uppercase : ");
        String strCarKey = null;
        if (userdata.hasNextLine()) {
        	strCarKey = userdata.nextLine();
        }
        
        if (strCarKey != null) {
        	
        	//carUserInputChk = car.getValue(strCarKey);
        	//if (carUserInputChk == null) {
        	//	System.out.print("Car model does not exist");
        	//} else {
        	//	for (Map.Entry<String, String> entry : car.entrySet()) {
        	//		if (entry.getKey().equals(strCarKey)) {
        	//			System.out.println("Car Make: " + entry.getKey() + " and Model:" + entry.getValue());
        	//		}
        	//	}
        	if (car.containsValue(strCarKey)) {
        		for (Map.Entry<String, String> entry : car.entrySet()) {
        			if (entry.getValue().equals(strCarKey)) {
        				System.out.println("Oh, you're looking for a " + entry.getValue() + "? Our " + 
        						entry.getKey() + " selection is right over here....");
        			}
        		}
        		
        	} else {
        		System.out.print("Car model does not exist");
        	}
        	
        }
	}

}
