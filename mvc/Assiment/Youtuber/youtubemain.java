package mvc.Assiment.Youtuber;

public class youtubemain {
    public static void main(String[] args) {

        Youtuber TravelVlogs=new Youtuber("Travelogues");
         Youtuber Song=new Youtuber("T-Serice");
        Subscribers sub1=new Subscribers("Rahul");
        Subscribers sub2=new Subscribers("vijay");
Subscribers sub3=new Subscribers("lalit");
Subscribers sub4=new Subscribers("Ram");
TravelVlogs.new_sub(sub1);
Song.new_sub(sub2);
Song.new_sub(sub3);
TravelVlogs.new_sub(sub3);
Song.new_sub(sub4);
TravelVlogs.notifyVideo("Traval");
Song.notifyVideo("Bajan");
Song.removes(sub4);
Song.notifyVideo("Sangam");
    }
}
