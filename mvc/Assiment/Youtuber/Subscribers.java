package mvc.Assiment.Youtuber;

public class Subscribers implements subcribe {
    private String name;
    public Subscribers(String name){
        this.name=name;

    }


    @Override
    public void update(String subcribe) {
        System.out.println("The new video is avalible  name is "+subcribe+"notyfi to "+name);
    }
}
