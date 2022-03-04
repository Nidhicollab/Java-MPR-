import java.lang.Math;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;

class Bill implements ActionListener,ItemListener
{
    public static String[] name;
    public static String[] age;
    public static String[] aadharNo;
    public static String[] gender;
    static String address, email, contactNo;

    public static void init(){
        name=new String[InputDetails.totalPpl+1];
        age=new String[InputDetails.totalPpl+1];
        aadharNo=new String[InputDetails.totalPpl+1];
        gender=new String[InputDetails.totalPpl+1];
    }

    public static void details(String Name, String Age, String AadharNo, String Gender, String Email, String ContactNo, String Address, int i){
        name[i]=Name.toUpperCase();
        age[i]=Age;
        aadharNo[i]=AadharNo;
        gender[i]=Gender;
        if(i==1){
            address=Address;
            email=Email;
            contactNo=ContactNo;        
        }
    }

	Bill() 
	{
		

        Frame f=new Frame("BILL PAGE");
	ScrollPane sp = new ScrollPane();
		sp.getVAdjustable().setUnitIncrement(12);
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setSize(960, 2000);
		sp.add(panel);
		f.add(sp);
        Label l1=new Label("TRAVELPRO");
        l1.setBounds(25,50,200,30);	
        panel.add(l1);

        Label l33=new Label("Thadomal Shahani Engineering College");
        l33.setBounds(715,50,210,30);
        Label l34=new Label("Mumbai Bandra-400000");
        l34.setBounds(715,80,200,30);
        Label l35=new Label("Ph No.: 123456789");
        l35.setBounds(715,110,200,30);
        Label l36=new Label("Email: travelpro@gmail.com");
        l36.setBounds(715,140,200,30);
        panel.add(l33);
        panel.add(l34);
        panel.add(l35);
        panel.add(l36);

        Label l120=new Label("--- INVOICE ---", Label.CENTER);
        l120.setBounds(350, 180, 100, 30);
        panel.add(l120);

        Label l2=new Label("Bill To:");
        Label l3=new Label(name[1]);
        l2.setBounds(25,200,50,30);
        l3.setBounds(100,200,200,35);
        panel.add(l2);
        panel.add(l3);
        Label l4=new Label("Address:");
        Label l5=new Label(address);
        l4.setBounds(25,230,50,30);
        l5.setBounds(100,230,400,30);
        panel.add(l4);
        panel.add(l5);
        Label l6=new Label("Ph no.:");
        String s1 = String.valueOf(contactNo);
        Label l7=new Label(s1);
        l6.setBounds(25,260,50,30);
        l7.setBounds(100,260,200,30);
        panel.add(l6);
        panel.add(l7);
        Label l8=new Label("Email:");
        Label l9=new Label(email);
        l8.setBounds(25,290,50,30);
        l9.setBounds(100,290,200,30);
        panel.add(l8);
        panel.add(l9);

        Date d = new Date();
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        Label l38=new Label("Bill No.:");
        Label l39=new Label("Date:");
        l38.setBounds(715,200,50,30);
        l39.setBounds(715,230,50,30);
        panel.add(l38);
        panel.add(l39);
        double m=100000*Math.random();
        int x=(int)m;
        String s5=Integer.toString(x);
        Label l40=new Label(s5);
        Label l41=new Label(a.format(d));
        l40.setBounds(765,200,200,30);
        l41.setBounds(765,230,200,30);
        panel.add(l40);
        panel.add(l41);

        Label l10=new Label(Display.tourName.toUpperCase(), Label.CENTER);
        l10.setBounds(200,320,400,30);
        panel.add(l10);

        Label l11=new Label("Destination name:");
        Label l12=new Label(Display.tourName);
        l11.setBounds(25,380,100,30);
        l12.setBounds(125,380,200,30);
        panel.add(l11);
        panel.add(l12);
        Label l13=new Label("Travel Mode:");
        Label l14;
        if(InputDetails.travelMode==1)
            l14=new Label("Railways");
        else
            l14=new Label("Airways");
        l13.setBounds(25,410,100,30);
        l14.setBounds(125,410,100,30);
        panel.add(l13);
        panel.add(l14);

        Label l15=new Label("From:");
        Label l16=new Label(Display.fromDate);
        l15.setBounds(715,380,50,30);
        l16.setBounds(765,380,200,30);
        panel.add(l15);
        panel.add(l16);
        Label l17=new Label("To:");
        Label l18=new Label(Display.toDate);
        l17.setBounds(715,410,50,30);
        l18.setBounds(765,410,200,30);
        panel.add(l17);
        panel.add(l18);

		Label l111=new Label("NAME");
		Label l112=new Label("AGE");
		Label l113=new Label("AADHAR NO.");
		Label l114=new Label("GENDER");
		l111.setBounds(120,470,50,30);
		l112.setBounds(340,470,50,30);
		l113.setBounds(505,470,100,30);
		l114.setBounds(740,470,100,30);
		panel.add(l111);
		panel.add(l112);
		panel.add(l113);
		panel.add(l114);
        int i;
		for(i=1;i<=InputDetails.totalPpl;i++)
		{
			Label l115=new Label(name[i], Label.CENTER);
			Label l116=new Label(age[i], Label.CENTER);
			Label l117=new Label(aadharNo[i], Label.CENTER);
			Label l118=new Label(gender[i], Label.CENTER);	
			l115.setBounds(40,470+i*50,200,30);
			l116.setBounds(300,470+i*50,100,30);
			l117.setBounds(490,470+i*50,100,30);
			l118.setBounds(715,470+i*50,100,30);
			panel.add(l115);
			panel.add(l116);
			panel.add(l117);
			panel.add(l118);
		}
    
        int bound=500+i*50;
        Label l27=new Label("Cost per Person:");
        Label l28=new Label("Discount applied:");
        Label l29=new Label("Total Price (Incl. of all Taxes):");
        l27.setBounds(25,bound,100,30);
        l28.setBounds(25,bound+30,100,30);
        l29.setBounds(25,bound+60,160,30);
        String s2 = String.valueOf(Display.perPrice);
        String s3 = String.valueOf(Display.discount);
        String s4 = String.valueOf(Display.finalPrice);
        Label l30=new Label(s2);
        Label l31=new Label(s3+"%");
        Label l32=new Label(s4);
        l30.setBounds(125,bound,100,30);
        l31.setBounds(125,bound+30,100,30);
        l32.setBounds(200,bound+60,100,30);
        panel.add(l27);
        panel.add(l28);
        panel.add(l29);
        panel.add(l30);
        panel.add(l31);
        panel.add(l32);

        Button b1=new Button("Print this Bill");
        b1.setBounds(400, 400, 70, 30);
        panel.add(b1);
			
		f.setVisible(true);
		//f.setLayout(null);
		f.setSize(960,960);

        panel.WindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
                Exit.thanks();
            }    
        });   
	}
    
}