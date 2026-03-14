package QUIZ_2.question_2.question2_after;

public class EmailService implements INotificationService{

    @Override
    public void sendNotification(String context) {
        System.out.println("Email sent: " + context);
    }
}
