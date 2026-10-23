package in.coderarmy.notification;

public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification sent");
    }
}
