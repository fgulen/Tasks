package Tasks;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
}

	public static void timeConversion(String s) {
		
		if(s.length()==10) {
			
			if(s.substring(8, 10).contentEquals("PM")){
				String hour=s.substring(0,2);
				int hourInt=Integer.parseInt(hour);
				int hourPm=hourInt+12;
				String hourPm2=Integer.toString(hourPm);
				String min=s.substring(2,8);
				
				if(hourPm==24){
					System.out.println("00"+min);
				}else{
					System.out.println(hourPm2+min);
				};
						
				
			} else {
				System.out.println(s.substring(0,8));
			}
		}else 
			if(s.substring(7,9).contentEquals("PM")){

				String hour=s.substring(0,1);
				int hourInt=Integer.parseInt(hour);
				int hourPm=hourInt+12;
				String hourPm2=Integer.toString(hourPm);
				String min=s.substring(1,7);
				
				if(hourPm==24){
					System.out.println("00"+min);
				}else{
					System.out.println(hourPm2+min);
				};
						
				
			} else {
				System.out.println(s.substring(0,7));
			}
		}

 }
