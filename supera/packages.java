package supera;



class order {
    int orderId;
    int orderNumber;
    int location;
    int amount;
    int gst;


    public order(int orderId, int orderNumber, int location, int amount, int gst) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.location = location;
        this.amount = amount;
        this.gst = gst;
    }
    int totalAmount(){
        int a=(amount*gst /100)+amount;
        return a;
    }

}
class  Client extends order{
    String clientName,clientCity;
    int clientCreditLimit,totalCredit;

    public Client(int orderId, int orderNumber, int location, int amount, int gst, String clientName, String clientCity, int clientCreditLimit, int totalCredit) {
        super(orderId, orderNumber, location, amount, gst);
        this.clientName = clientName;
        this.clientCity = clientCity;
        this.clientCreditLimit = clientCreditLimit;
        this.totalCredit = totalCredit;
    }

}


class finalc{
void displayClientDetails(){
    System.out.println("Client:");
    System.out.println("");
}


}

