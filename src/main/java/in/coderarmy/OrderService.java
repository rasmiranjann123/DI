package in.coderarmy;

import in.coderarmy.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private NotificationService notificationService;

    public OrderService(@Qualifier("pop") NotificationService notificationService) {

        System.out.println("Order Service...");

        this.notificationService = notificationService;
    }

//    @Autowired
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    public void placedOrder(){
        System.out.println("Order Placed...");
        notificationService.sendNotification();
    }
}
