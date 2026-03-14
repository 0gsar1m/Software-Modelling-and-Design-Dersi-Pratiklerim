package QUIZ_2.question_2.question2_before;

public class OrderService {
    private EmailService notificationService;
    public OrderService(){
        notificationService = new EmailService(); //Tight coupling here
    }
    public void placeOrder(){
        System.out.println("Order placed");
        notificationService.sendEmail("Order confirmed, thank you for buying");
    }
}
