package in.coderarmy.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

@Qualifier("sms")

public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification sent");
    }
}
