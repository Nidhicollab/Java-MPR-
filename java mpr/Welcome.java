import java.util.Scanner;
class Welcome
{
    Welcome(){
        System.out.println("\n\t\t\t\t\t\t\t TRAVELPRO");

        System.out.println("\n~ TRAVELING - it leaves you speechless, then turns you into a storyteller. ~\n\n- We here at TravelPro have designend various packages for you, and each one of them tells a different story.\n- We want to sell beautiful experiences through our state-of-the-art designed holiday packages and other essential travel services.\n- No matter how many travel experiences we sell every day, we ensure that you are the protagonist of your own travel story.");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\n->Press Enter to Display TravelPro Tour Packages");
        String enter=sc.nextLine();
    }
}