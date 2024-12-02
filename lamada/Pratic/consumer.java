package lamada.Pratic;
interface con{

    void noreturn();
}
public class consumer implements con {
    public static void main(String[] args) {


        con da;
        da = () -> {
            System.out.println("Hello");
        };

        da.noreturn();
    }

    @Override
    public void noreturn() {

    }
}
