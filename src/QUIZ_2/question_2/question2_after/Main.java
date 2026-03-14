package QUIZ_2.question_2.question2_after;

public class Main {
    static void main() {
        //first we construct our notification service(s)
        INotificationService emailService = new EmailService();
        INotificationService smsService = new SmsService();


        //If I want to notify user via email:
        OrderService orderEmail = new OrderService(emailService); //injected emailService
        orderEmail.placeOrder(); //output: Email sent: Thank you for choosing us. For info: 444 0 350
        System.out.println("--------------------------------");
        //If I want to notify user via SMS:
        OrderService orderSms = new OrderService(smsService); //injected smsService
        orderSms.placeOrder(); //output: SMS sent: Thank you for choosing us. For info: 444 0 350

    }
}
