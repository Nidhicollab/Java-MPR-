import java.util.*;
class TourOptions
{
    static Scanner sc = new Scanner(System.in);
	static String dup_Choice;
    static int choice;

	public static int displayCateg()
	{
		System.out.println("~ Main Menu ~\n1.Group Tours\n2.Customized Tours\n3.Exit\n->Please choose from the Above Categories, which kind of tour you are planning");
		dup_Choice=sc.nextLine();
		choice=check(dup_Choice);
		return choice;
	}
	public static int displayGTCateg()
	{
		System.out.println("\n~ Group Tours ~\n1.Short Trips\n2.Treks and Hikes\n3.Womens Special\n4.Go Back to Main Menu\n5.Exit\n->Choose your Mood");
		dup_Choice=sc.nextLine();
		choice=check(dup_Choice);
		return choice;
	}
	public static int displaySTCateg()
	{
		System.out.println("\n~ Short Trips ~\n1.Statue of Unity and Narmada Tent City\n2.Delhi and Agra\n3.Go Back\n4.Go back to Main Menu\n5.Exit\n->Choose your Short Trip option");
		dup_Choice=sc.nextLine();
		choice=check(dup_Choice);
		return choice;
	}
	public static int displayTHCateg()
	{
		System.out.println("\n~ Treks and Hikes ~\n1.Markha Valley - Ladakh Trek\n2.Hampta Pass - Himachal Trek\n3.Go Back\n4.Go back to Main Menu\n5.Exit\n->Choose your Treks & Hikes option");
		dup_Choice=sc.nextLine();
		choice=check(dup_Choice);
		return choice;
	}
	public static int displayWSCateg()
	{
		System.out.println("\n~ Womens Special ~\n1.Jaipur and Udaipur(The Pink City and The City Of Lakes)\n2.Varanasi\n3.Go Back\n4.Go back to Main Menu\n5.Exit\n->Choose your short trip option");
		dup_Choice=sc.nextLine();
		choice=check(dup_Choice);
		return choice;
	}	

	public static boolean isNumeric(String s){
		try{
			int n=Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException e){
			System.out.println("\n--You have entered a NON-NUMERIC Option--\n--Please Enter 'NUMERIC' & Appropriate Option--\n");
			return false;
		}
	}

	public static int check(String s){
		if(isNumeric(s)){
			int n=Integer.parseInt(s);
			return n;
		}
		return 'a';
	}
}