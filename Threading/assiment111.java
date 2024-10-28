package Threading;
class company extends Thread{
    String Company_name;
    company(String Company_name){
        this.Company_name=Company_name;
    }
      public void run(){
          System.out.println(Company_name);
          }
}
class City extends Thread{
    String city;
    City(String city){
        this.city=city;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(city);
          }

}
class lang extends Thread{
    String language;
    lang(String language){
        this.language=language;
    }
    public void run(){
        System.out.println(language);
            }

}


public class assiment111 {
    public static void main(String[] args) {


        company com=new company("Tata");
        City cty=new City("Mumbai");
        lang lan=new lang("Javaa");
        com.start();
        cty.start();
        lan.start();
    }
}
