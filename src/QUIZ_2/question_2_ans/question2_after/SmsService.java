package QUIZ_2.question_2_ans.question2_after;

public class SmsService implements INotificationService{
    //If I want to add SMS service,
    // I just create the class and use it on Main that's it wallahi

    @Override
    public void sendNotification(String context) {
        System.out.println("SMS sent: " + context);
    }
}
