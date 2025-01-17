package Assignment1;

import java.util.*;


public class Assignment1a {

	public static void main(String[] args) {
        List <Integer> intList=new ArrayList<Integer>();
        long product = 1;
        Scanner userdata = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] strNums = null;
        if (userdata.hasNextLine()) {
            strNums = userdata.nextLine().split(" ");
        }
        if (strNums != null) {
            for (String strNum: strNums) {
                try {
                    intList.add(Integer.parseInt(strNum.trim()));
                } catch (Exception e) {
                    System.out.println("Invalid input");
                    return;
                }
            }
            
            System.out.println("Sum of the numbers:" + intList.stream().mapToInt(value -> value).sum());
            OptionalInt mn = intList.stream().mapToInt(value -> value).min();
            OptionalInt mx = intList.stream().mapToInt(value -> value).max();
            System.out.println("Minimum number:" + mn.getAsInt());
            System.out.println("Maximum number:" + mx.getAsInt());
            for (int prd: intList)
            {
               product *= prd; 
            }
            System.out.println("Product of the numbers:" + product);

        }
	}

}
