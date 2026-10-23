package in.coderarmy.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("em")
public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Email Notification sent");
    }
}
