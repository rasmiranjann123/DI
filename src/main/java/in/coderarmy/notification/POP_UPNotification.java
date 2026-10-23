package in.coderarmy.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pop")
public class POP_UPNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("POP UP Notification sent");
    }
}
