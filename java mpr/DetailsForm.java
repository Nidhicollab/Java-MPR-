import java.awt.*;
import java.awt.event.*;

public class DetailsForm extends Frame implements ActionListener,ItemListener
{
	Label label,label1,label2,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	TextArea area1,area2;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;
	Checkbox checkbox1,checkbox2,checkbox3,checkbox4, cb1, cb2, cb3;
	CheckboxGroup cbg, cbg1;
	Button b1,b2;
	Choice c1,c2,c3;
	//Scrollbar s;
	volatile boolean done=false;

	static String name, age, gender, aadharNo, email, contactNo, address, check="";
	int i;
	DetailsForm()
	{
		for(i=1;i<=InputDetails.totalPpl;i++)
		{
			done=false;
			removeAll();
			setTitle("TravelPro Personal Details Form");

			ScrollPane sp = new ScrollPane();
			sp.getVAdjustable().setUnitIncrement(12);
			Panel panel = new Panel();
			panel.setLayout(null);
		
			l1=new Label("-- TRAVELPRO --");
			l1.setAlignment(Label.CENTER);
			l1.setBounds(250,40,200,30);
	
			l2=new Label("Please enter your following Personal Details TRAVELLER "+i+ " : ");
			l2.setBounds(25,90,310,30);		
		
			l3=new Label("First Name : ");
			l3.setBounds(25,140,70,30);
			tf1 = new TextField();
			tf1.setBounds(100,145,100,20);

			l4=new Label("Middle Name : ");
			l4.setBounds(220,140,75,30);
			tf2 = new TextField();
			tf2.setBounds(300,145,100,20);

			l5=new Label("Last Name : ");
			l5.setBounds(430,140,70,30);
			tf3 = new TextField();
			tf3.setBounds(500,145,100,20);
		
			l7=new Label("Age : ");
			l7.setBounds(60,190,40,30);
			tf5 = new TextField();
			tf5.setBounds(100,195,55,20);

			l17=new Label("Date of Birth : ");
			l17.setBounds(220,190,80,30);

			//Date Choice
			c1 = new Choice();
			c1.setBounds(300,195,80,100);
			c1.add("Date");
			for(int k=1; k<=31; k++){
				c1.add(Integer.toString(k));
			}

			//Month Choice
			c2 = new Choice();
			c2.setBounds(400,195,80,100);
			c2.add("Month");
			c2.add("January");
			c2.add("February");
			c2.add("March");
			c2.add("April");
			c2.add("May");
			c2.add("June");
			c2.add("July");
			c2.add("August");
			c2.add("September");
			c2.add("October");
			c2.add("November");
			c2.add("December");

			//Year Choice
			c3 = new Choice();
			c3.setBounds(500,195,80,100);
			c3.add("Year");
			for(int k=1930; k<=2021; k++){
				c3.add(Integer.toString(k));
			}

			l10=new Label("Gender:");
			l10.setBounds(45, 235, 50, 30);
			cbg=new CheckboxGroup();
			cb1=new Checkbox("Male", cbg, false);
			cb2=new Checkbox("Female", cbg, false);
			cb3=new Checkbox("Other", cbg, false);
			cb1.setBounds(100, 242, 50, 20);
			cb2.setBounds(150, 242, 55, 20);
			cb3.setBounds(215, 242, 55, 20);

			l6=new Label("Email ID : ");
			l6.setBounds(35,280,65,30);
			tf4 = new TextField();
			tf4.setBounds(100,285,150,20);

			label1=new Label("Occupation:");
			label1.setBounds(25,325,70,30);
			cbg1 = new CheckboxGroup();
			checkbox1 = new Checkbox("Employee",cbg1,true);
			checkbox1.setBounds(100,318,80,50);
			checkbox2 = new Checkbox("Non-Employee",cbg1,false);
			checkbox2.setBounds(200,318,100,50);
			checkbox3 = new Checkbox("Student",cbg1,false);
			checkbox3.setBounds(320,318,80,50);
			checkbox4 = new Checkbox("Other",cbg1,false);
			checkbox4.setBounds(420,318,80,50);
		
			l9=new Label("Contact Number:");
			l9.setBounds(25,375,100,30);
			tf6 = new TextField();
			tf6.setBounds(125,380,90,20);
		
			l11=new Label("Aadhar Card Number:");
			l11.setBounds(300,375,120,30);
			tf8 = new TextField();
			tf8.setBounds(425,380,120,20);
		
			l12=new Label("Country : ");
			l12.setBounds(25,430,50,30);
			tf9 = new TextField();
			tf9.setBounds(80,435,80,20);
			l13=new Label("State : ");
			l13.setBounds(180,430,40,30);
			tf10 = new TextField();
			tf10.setBounds(225,435,80,20);
			l14=new Label("City : ");
			l14.setBounds(330,430,30,30);
			tf11 = new TextField();
			tf11.setBounds(365,435,80,20);
		
			l15=new Label("Please enter your full personal address in the box given below: ");
			l15.setBounds(25,480,350,30);
			area1 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
			area1.setBounds(25,515,350,70);

			b1=new Button("Submit");
			b1.setBounds(250,650,50,20);
		
			b2 = new Button("Cancel");
			b2.setBounds(350,650,50,20);
		
			label=new Label();
			label.setBounds(25,1100,200,30);
		
			label2=new Label();
			label2.setBounds(25,1150,100,30);
		
			//s=new Scrollbar();

			//Submit DBox
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String name1=tf1.getText();
					String name2=tf2.getText();
					String name3=tf3.getText();
					name=name1+" "+name2+" "+name3;
					age=tf5.getText();
					aadharNo=tf8.getText();
					if(cb1.getState()){gender="Male";}
					if(cb2.getState()){gender="Female";}
					if(cb3.getState()){gender="Other";}
					email=tf4.getText();
					contactNo=tf6.getText();
					address=area1.getText();

					if(name.equals("") || age.equals("") || aadharNo.equals("") || email.equals("") || contactNo.equals("") || address.equals("")){
						noInfo();
					}
					else if(check(name, contactNo, aadharNo, email, age)){
						incorrectInfo();
						check="";
					}
					else{
						String s1 = tf1.getText().toUpperCase();
						Dialog d1 = new Dialog(DetailsForm.this, "Response", true);
						d1.setBounds(150, 250, 450, 120);
						d1.setLayout(null);
						Label label1 = new Label(s1 + ", your form has been successfully submitted. Thank you for your time.");
					
						Button b = new Button("OK");
						b.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent e)
							{
								d1.setVisible(false);
								if(i==1){Bill.init();}

									Bill.details(name, age, aadharNo, gender, email, contactNo, address, i);
								
								done=true;
							}
						});
					
						label1.setBounds(20, 30, 700, 20);
						b.setBounds(190, 80, 70, 20);
					
						d1.add(label1);
						d1.add(b);
						d1.setVisible(true);
					}
				}
			});

			//Cancel DBox
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					cancelDBox();
				}
			});
	
			//s.addAdjustmentListener(this);
		
			panel.add(l1);
			panel.add(l2);
			panel.add(l3);
			panel.add(l4);
			panel.add(l5);
			panel.add(l6);
			panel.add(l7);
			panel.add(l9);
			panel.add(l10);
			panel.add(l11);
			panel.add(l12);
			panel.add(l13);
			panel.add(l14);
			panel.add(l15);
			panel.add(l17);
			panel.add(label);
			panel.add(label1);
			panel.add(label2);
		
			panel.add(tf1);
			panel.add(tf2);
			panel.add(tf3);
			panel.add(tf4);
			panel.add(tf5);
			panel.add(tf6);
			panel.add(tf8);
			panel.add(tf9);
			panel.add(tf10);
			panel.add(tf11);
		
			panel.add(b1);
			panel.add(b2);
				
			panel.add(checkbox1);
			panel.add(checkbox2);
			panel.add(checkbox3);
			panel.add(checkbox4);
			panel.add(cb1);
			panel.add(cb2);
			panel.add(cb3);
	
			panel.add(area1);
		
			panel.add(c1);
			panel.add(c2);
			panel.add(c3);
		
			panel.setSize(1200, 1200);
		
			sp.add(panel);
		
			add(sp);
		
			addWindowListener(new WindowAdapter() 
			{
            	public void windowClosing(WindowEvent we) 
				{
					cancelDBox();
					done=true;
            	}
        	});
				
			setSize(1000,1000);
			//setLayout(null);
			setVisible(true);
		
			while(!done);
			
		}//end of for loop

		Bill ob=new Bill();
		setVisible(false);
	}

	public void cancelDBox(){
		String s1 = tf1.getText();
		Dialog d2 = new Dialog(DetailsForm.this, "Cancel", true);
		d2.setBounds(250, 250, 280, 120);
		d2.setLayout(null);
		Label label2 = new Label(s1 + ", Are you sure you want to cancel?");
	
		Button ba = new Button("Yes");
		ba.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d2.setVisible(false);
				dispose();//to destroy the detailsform awt frame , different as compared to system.exit(0) , as the latter will return us back to the cmd , instaed of directing us to the bill form
				Exit.goodbye();
				//System.exit(0);
				//continue;
				done=true;
			}
		});
	
		Button bb = new Button("No");
		bb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d2.setVisible(false);
			}
		});
		label2.setBounds(20, 30, 500, 20);
		ba.setBounds(50, 80, 70, 20);
		bb.setBounds(140,80,70,20);
		d2.add(label2);
		d2.add(ba);
		d2.add(bb);
		d2.setVisible(true);
	}

	public void noInfo(){
		String s1 = tf1.getText();
		Dialog d2 = new Dialog(DetailsForm.this, "Details Not Entered", true);
		d2.setBounds(250, 250, 300, 120);
		d2.setLayout(null);
		Label label2 = new Label(s1 + ", Please enter all your Required Details");
	
		Button okBtn = new Button("OK");
		okBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d2.setVisible(false);
				//done=true;
			}
		});
		label2.setBounds(20, 30, 500, 20);
		okBtn.setBounds(100, 80, 70, 20);
		d2.add(label2);
		d2.add(okBtn);
		d2.setVisible(true);
	}

	public boolean check(String Name, String PhNo, String AadharNo, String Email, String Age){
		if(!Name.matches("^[a-zA-Z ]*$")){check="Name";}
		else if(!Age.matches("^[0-9]*$")){check="Age";}
		else if(!Email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]*$")){check="Email";}
		else if(!PhNo.matches("^[0-9]*$") && PhNo.length()>10){check="Contact Number";}
		else if(!AadharNo.matches("^[0-9]*$") && AadharNo.length()>12){check="Aadhar Number";}		
		if(!check.equals("")){return true;}
		return false;
		//^ means "start of string", and $ is "end of string". These are called "anchors". + means "one or more" and * means "zero or more" (yes, * can match zero characters)
	}

	public void incorrectInfo(){
		String s1 = tf1.getText();
		Dialog d2 = new Dialog(DetailsForm.this, "Details Entered in Unappropriate Format", true);
		d2.setBounds(150, 250, 350, 120);
		d2.setLayout(null);
		Label label2 = new Label(s1 + ", Please enter your "+ check +" in APPROPRIATE Format");
	
		Button okBtn = new Button("OK");
		okBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d2.setVisible(false);
				//done=true;
			}
		});
		label2.setBounds(20, 30, 500, 20);
		okBtn.setBounds(100, 80, 70, 20);
		d2.add(label2);
		d2.add(okBtn);
		d2.setVisible(true);
	}

	/*public void adjustmentValueChanged(AdjustmentEvent e) 
	{    
		done=true;	    
	} */   
	public void itemStateChanged(ItemEvent e) 
	{      
		done=true;
	}
	public void actionPerformed(ActionEvent e)
	{
		done=true;
	}

}