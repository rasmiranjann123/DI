package in.coderarmy.notification;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Email Notification sent");
    }
}
