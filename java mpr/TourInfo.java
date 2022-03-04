import java.util.*;

public class TourInfo{

    static TourInfo obj[][]=new TourInfo[2][3];
    String tourNameGT;
    String tourIti;
    int price;
    String fromDate;
    String toDate;
    static int CTprice;
    static double discount;
    static double finalPrice;
    static String tourNameCT;

    public static String TourNameGT(int x, int y){

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                obj[i][j]=new TourInfo();
            }
        }
       
        obj[0][0].tourNameGT="Statue Of Unity & Narmada Tent City";        

        obj[1][0].tourNameGT="Delhi Agra";

        obj[0][1].tourNameGT="Markha Valley - Ladakh Trek";

        obj[1][1].tourNameGT="Hampta Pass - Himachal Trek";

        obj[0][2].tourNameGT="Jaipur Udaipur";

        obj[1][2].tourNameGT="Varanasi";

        System.out.println("\\\\\\\\ "+ obj[x][y].tourNameGT.toUpperCase() +" ////");

        return obj[x][y].tourNameGT;
    }

    public static String TourNameCT(){
        tourNameCT=InputDetails.dest.toUpperCase();
        System.out.println("\\\\\\\\ "+tourNameCT+" ////");
        return tourNameCT;
    }

    public static String FromDate(int x, int y){

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                obj[i][j]=new TourInfo();
            }
        }

        obj[0][0].fromDate="03-12-2021";
        obj[1][0].fromDate="05-12-2021"; //*Choose the particular batch of tour*
        obj[0][1].fromDate="15-12-2021";
        obj[1][1].fromDate="17-12-2021";
        obj[0][2].fromDate="10-01-2022";
        obj[1][2].fromDate="12-01-2022";

        return obj[x][y].fromDate;

    }

    public static String ToDate(int x, int y){

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                obj[i][j]=new TourInfo();
            }
        }

        obj[0][0].toDate="05-12-2021";
        obj[1][0].toDate="07-12-2021";
        obj[0][1].toDate="21-12-2021";
        obj[1][1].toDate="24-12-2021";
        obj[0][2].toDate="15-01-2022";
        obj[1][2].toDate="16-01-2022";

        return obj[x][y].toDate;

    }

    public static String TourIti(int x, int y){

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                obj[i][j]=new TourInfo();
            }
        }
        
        obj[0][0].tourIti="\n~ Day 01 \nAhmedabad --> Narmada Tent City\nArrive at Ahmedabad & meet TravelPro Tour Manager as well as other Group Tour Members.\nProceed to Narmada Tent City. Visit to Sarovar Dam & Zoological Park.\nIn the evening, Enjoy Cultural Show at Tent City.\nAt Night, we will go for an Exciting Jungle Safari.\n\n Day 02 \nNarmada Tent City\nVisit Valley of Flowers & Butterfly Garden.\nLater, we Visit The Iconic Statue of Unity.\nIn the evening, we will enjoy an Illumination Tour of Kevadiya City.\n\n Day 03 ~\nNarmada Tent City --> Ahmedabad --> Departure\nProceed to Ahmedabad.\nIt is time now to say goodbye to our travel companions & Let's meet again on yet another Memorable Tour :)";

        
        obj[1][0].tourIti="\n~ Day 01 \nDelhi --> Agra\nArrive at Delhi & meet TravelPro Tour Manager as well as other Group Tour Members.\nProceed to Agra. Visit Mehtab Bagh, Agra Fort & Taj Mahal.\nIn the evening, we enjoy boating in Yamuna River.\n\n Day 02 \nAgra --> Mathura --> Vrindavan --> Delhi\nWe proceed to Mathura and Vrindavan to visit some famous Temples.\nWe then proceed to Delhi.\n\n Day 03 ~\nDelhi --> Departure\nToday we visit Raj Ghat & also drive past India Gate & Parliament House.\nIt is time now to say goodbye to our travel companions & Let's meet again on yet another Memorable Tour :)";

        
        obj[0][1].tourIti="\n~ Day 01 \nLeh\nArrive at Leh & meet TravelPro Tour Manager as well as other Group Trek Members. Proceed to Hotel.\nIn the evening we will have a Meet & Greet session to get acquainted with fello group members.\nOvernight at Hotel in Leh.\n\n Day 02 \nLikir --> Yangthang( 3630m / 4-5 hrs Trek )\nToday we start our trek.\nFrom Likir, the route heads west up to the first pass - Phobe La(3580m).\nWe will trek steadily upwards till we get to Chagatse La(3630m). We shall camp for the night at this pass.\n\n Day 04 \nYangthang --> Hemis Shukpachen( 3875m / 2-3 hrs Trek )\nToday the trail heads north climbing up to the Tsermangchen La (3750m).\nWe trek down to Hemis Shukpachen. Overnight at a Hmestay.\n\n Day 05 \nHemis Shukpachan --> Tingmosgang ( 3230m / 4hrs Trek )\nToday we trek from a village of Hemis Shukpachan. A steep descent lead us to the right side of mountains.\nWe climb steadily towards Mebtak La(3720m). We then head to Tingmosgang. This marks an end to our trekking journey.\nOvernight stay at a Homestay.\n\n Day 06 ~\nTingmosgang --> Leh --> Departure\nToday we drive back to Leh. On the way we visit Alchi Gompa & also see the Sangam of Indus and Zanskar rivers.\nIt is time now to say goodbye to our travel companions & Let's meet again on yet another Memorable Tour :)";

        
        obj[1][1].tourIti="\n~ Day 01 \nChandigarh --> Kalath Base Camp\nArrive at Chandigarh & meet TravelPro Tour Manager as well as other Group Trek Members. Proceed to Kalath Base Camp.\nOn arrival in Kalath, we report to our base camp.\nOvernight at base camp at Kalath\n\n Day 02 \nKalath --> Sethan --> Uchung Bihadi( 3017m / 3-4 hrs Trek )\nToday we start our trek which takes about 3-4 hours.\nThe route passes through Apple Orchards & forests of Blue Pine, Cedar and Oak.\nWe reach our Camp in Uchung Bihadi. Overnight at the Camp.\n\n Day 04 \nUchung Bihadi --> Balu ka Ghera( 3536m / 4-5 hrs Trek )\nToday the trek passes through some spectacular landscape just below the Hamta Pass, where we trek on a grassy bank.\nThe trail now begins to ascend towards Hamta Pass and reaches Balu Ka Ghera.\nOvernight at Campsite.\n\n Day 05 \nBalu ka Ghera --> Hampta Pass --> Balu ka Ghera( 3536m / 6-7 hrs Trek )\nToday we begin a steep climb which brings us to Hampta Pass.\nYou can enjoy close views of Indrasan peak & rugged peaks of Lahaul rising upon tier.\nWe then return back to our Camp at Balu ka Ghera. Overnight at the Camp.\n\n Day 06 \nBalu ka Ghera --> Chikka --> Kalath( 1850m / 4-5 hrs Trek )\nToday we descend the same route back and then drive to the Base Camp at Kalath.\nOvernight at the Base Camp.\n\n Day 07 ~\nKalath --> Chandigarh --> Departure\nWe proceed to Chandigarh. It is time now to say goodbye to our travel companions & Let's meet again on yet another Memorable Tour :)";

        
        obj[0][2].tourIti="\n~ Day 01 \nJaipur\nArrive at Jaipur & meet TravelPro Tour Manager as well as other Group Tour Members. Proceed to Hotel.\nVisit Amer Fort & witness a beautiful Light & Sound Show.\n\n Day 02 \nJaipur\nVisit Hawa Mahal & Jantar Mantar.\nLater we visit City Palace.\nIn the evening we have free time for shopping & exploring Rajasthani Art.\n\n Day 03 \nJaipur --> Pushkar\nProceed to Pushkar.\nVisit Kishangarh & Brahma Mandir.\nLater we visit Pushkar Tirth & witness divine aarti at Pushkar Ghat.\n\n Day 04 \nPushkar --> Udaipur\nProceed to Udaipur. Visit Chittorgarh Fort & Vijay Stambh\nLater we visit Queen Padmini's Palace.\nIn the evening, get ready for Bonfire night with some music & dance.\n\n Day 05 \nUdaipur\nVisit Pearl Hill & City Palace.\nThen we enjoy Boat Ride to Jag Mandir - a palace built in Lake Pichola.\nIn the evening, we enjoy traditional Music Show\n\n Day 06 ~\nUdaipur --> Departure\nIt is time now to say goodbye to our travel companions & Let's meet again on yet another Memorable Tour :)";

        
        obj[1][2].tourIti="\n~ Day 01 \nVaranasi\nArrive at Varanasi & meet TravelPro Tour Manager as well as other Group Tour Members. Proceed to Hotel.\nIn the evening, we take a Boat Ride and witness Ganga Aarti.\n\n Day 02 \nVaranasi --> Prayagraj -->Varanasi\nProceed to Prayagraj. Visit Anand Bhavan & Allahabad Fort.\nVisit the Hanuman Temple.\nLater we enjoy Boat Ride in Triveni Sangam & return back to Varanasi.\n\n Day 03 \nVisit Kashi Temple & Bharat Mata Temple.\nLater we visit Banaras Hindu University & Birla Temple.\nIn the evening, we have free time for shopping & to explore the local Culture and Art.\n\n Day 04 \nVaranasi --> Sarnath --> Varanasi\nProceed to Sarnath. Visit Dhamek Stupa & Sarnath Archaeological Museum.\nLater we visit Ashoka Pillar & Tibetan Monastery.\nThen we return back to Varanasi & visit Sarai Village.\n\n Day 05 ~\nVaranasi --> Departure\nIt is time now to say goodbye to our travel companions & Let's meet again on yet another Memorable Tour :)";

        System.out.println("\nYour Tour Itinerary:");
        System.out.println(obj[x][y].tourIti);

        return obj[x][y].tourIti;
    }

    public static int GTPerPersonPrice(int x, int y){

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                obj[i][j]=new TourInfo();
            }
        }
        
        obj[0][0].price=15000;
        obj[1][0].price=20000;
        obj[0][1].price=25000;
        obj[1][1].price=30000;
        obj[0][2].price=35000;
        obj[1][2].price=40000;

        System.out.println("Per Person Price (Excluding GST):\t"+obj[x][y].price);

        return obj[x][y].price;

    }

    public static int CTPerPersonPrice(){
        int min=20000;
        int max=40000;
        CTprice=(int)(Math.random()*(max-min+1)+min);
        System.out.println("Per Person Price:\t"+CTprice);
        return CTprice;
    }

    public static void InclExcl(){
        System.out.println("INCLUSIONS:");
        System.out.println("1. To and Fro economy class airfare and airport taxes for tour guests as mentioned in the itinerary.\n2. Tour Manager Services from Day 01 Meeting point till the dropping point on last day.\n3. All Meals - Breakfast, Lunch, Dinner (set menu) as mentioned in the itinerary");
        System.out.println("\nEXCLUSIONS:");
        System.out.println("1. Any increase in Airfare, Airport tax, Fuel surcharge and any new taxes introduced and levied by the Government\n2. Any upgradation in Airline class or hotel room category\n3. Any extra expense such as route change, Airline change, Date change, Accommodation facilities, etc incurred due to the unforeseen, unavoidable forced circumstances during the tour.");
    }

    public static void Offers(){
        Date ob=new Date();
        String s=ob.toString();
        String month=s.substring(4,7);
        month=month.toUpperCase();
        if(month.equals("NOV") || month.equals("DEC") || month.equals("JAN")){
            discount=20.0;
            System.out.println("\nWe have a CHILLING Offer for you!");
        }
        else if(month.equals("FEB") || month.equals("MAR") || month.equals("APR") || month.equals("MAY")){
            discount=25.0;
        }
        else if(month.equals("JUN") || month.equals("JUL") || month.equals("AUG")){
            discount=15.0;
        }
        else if(month.equals("SEP") || month.equals("OCT")){
            discount=17.0;
        }
        System.out.println("It's "+month+" now! So we have "+discount+"% discount on all of our tours");
    }

    public static void FinalPrice(int perPrice, int num, int trvl, double disc){
        finalPrice=(perPrice*num);
finalPrice+=(finalPrice*trvl*0.1*num); //Increment of Total Price according to Travel Mode chosen
        finalPrice+=finalPrice*0.18; //Adding GST
        finalPrice=(double)Math.round(finalPrice*100)/100;
        System.out.println("\n\t\t\t Total Price of "+num+" people:\t"+finalPrice);
        finalPrice-=disc/100*finalPrice;
        finalPrice=(double)Math.round(finalPrice*100)/100;
        System.out.println("Final Price After "+disc+"% Discount (Including GST):\t"+finalPrice);
    }

}