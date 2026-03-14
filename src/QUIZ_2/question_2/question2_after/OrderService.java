package QUIZ_2.question_2.question2_after;

public class OrderService {
    private INotificationService serviceToNotify;
    public OrderService(INotificationService serviceToNotify){
        this.serviceToNotify = serviceToNotify;
    }

    public void placeOrder(){
        System.out.println("Order placed");
        serviceToNotify.sendNotification("Thank you for choosing us. For info: 444 0 350");
    }
}
