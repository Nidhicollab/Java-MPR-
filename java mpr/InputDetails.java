import java.util.*;
public class InputDetails extends Exception
{
	static int adult, child, totalPpl, travelMode, days, age[], count1=0, count2=0, count3=0, count4=0, count5=0, count6=0;
	static long ph;
	static String dest, email, address, dupT_Ppl, dupT_Mode, dup_Days, dup_Dest, fromDate, toDate;
	static Scanner sc=new Scanner(System.in);
	static boolean check1, check2, check3, check4;

	public static void InputGTInfo()
	{
		//count1=0; count2=0;
		if(count1==0){
			System.out.println("\n->Enter Total Number Of People");
			dupT_Ppl=sc.nextLine();//taking input in string form to handle exceptions , not using nextInt()
			check1=isNumeric(dupT_Ppl);
			if(check1){totalPpl=Integer.parseInt(dupT_Ppl); count1=1;}
		}
		
		if(count2==0){
			System.out.println("\n1. Railways\n2. Airways\n->Enter mode of Travel");
			dupT_Mode=sc.nextLine();
			check2=isNumeric(dupT_Mode);
			if(check2){
				travelMode=Integer.parseInt(dupT_Mode);  
				if(travelMode!=1 && travelMode!=2){
					System.out.println("--Enter Appropriate Option between 1 and 2 ONLY--");
				}	//input is num , but to check if its 1 or 2			
				else{count2=1;}
			}
		}

		if(!check1 || !check2){
			//System.out.println("\nPlease enter your details again correctly : \n");
			InputGTInfo();
		}//dry run , if check1=false , check2=true , if(true || flase) , even if 1 is true , it will be executed 
		else{if(count2==0){InputGTInfo();}}
	}	
    
	public static void InputCTInfo()
	{	
		//count3=0; count4=0; count5=0; count6=0;
		if(count3==0){
			System.out.println("->Enter Destination");
			dup_Dest=sc.nextLine();
			check1=isAlpha(dup_Dest);
			if(check1){dest=dup_Dest; count3=1;}
		}
		
		if(count4==0){
			System.out.println("\n->Enter Number Of Days");
			dup_Days=sc.nextLine();
			check2=isNumeric(dup_Days);
			if(check2){days=Integer.parseInt(dup_Days); count4=1;}
		}
		
		if(count5==0){
			System.out.println("\n->Enter Total Number Of People");
			dupT_Ppl=sc.nextLine();
			check3=isNumeric(dupT_Ppl);
			if(check3){totalPpl=Integer.parseInt(dupT_Ppl); count5=1;}
		}
		
		if(count6==0){
			System.out.println("\n1. Railways\n2. Airways\n->Enter mode of Travel");
			dupT_Mode=sc.nextLine();
			check4=isNumeric(dupT_Mode);
			if(check4){
				travelMode=Integer.parseInt(dupT_Mode); 
				if(travelMode!=1 && travelMode!=2){
					System.out.println("--Enter Appropriate Option between 1 and 2 ONLY--");
				}				
				else{count6=1;}
			}
		}

		

		System.out.println("\n->Enter the Tour Dates(Enter in dd-mm-yyy format) : \n");
		System.out.println("From-\t");
		fromDate=sc.nextLine();
		System.out.println("To-\t");
		toDate=sc.nextLine();
		
		if(!check1 || !check2 || !check3 || !check4){
			System.out.println("\nPlease enter your details again correctly : \n");
			InputCTInfo();
		}	
		else{if(count6==0){InputCTInfo();}}	

					
	}

	public static void InputPersonalInfo()
	{
		DetailsForm obj=new DetailsForm();
	}

	public static boolean isNumeric(String s){
		try{
			int n=Integer.parseInt(s);
		}
		catch(NumberFormatException nfe){
			System.out.println("--You have entered a NON-NUMERIC Option--\n--Please Enter 'NUMERIC' & Appropriate Option--");
	 		return false;
		}
		return true;
	}

	public static boolean isAlpha(String s){
		try{
			if(s != null && s.matches("^[a-zA-Z]*$")){return true;}//^ means "start of string", and $ is "end of string". These are called "anchors". + means "one or more" and * means "zero or more" (yes, * can match zero characters)
			else{
				InputDetails e=new InputDetails();
				throw e;
			}
		}
		catch(InputDetails e){
			System.out.println("--You have entered a NON-ALPHABETIC Destination Name\nPlease Enter Appropriate Destination Name--");
	 		return false;
		}
	}
}