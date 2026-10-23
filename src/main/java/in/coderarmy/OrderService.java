package in.coderarmy;

import in.coderarmy.notification.NotificationService;

public class OrderService {

    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {

        this.notificationService = notificationService;
    }

    public void placedOrder(){
        System.out.println("Order Placed...");
        notificationService.sendNotification();
    }
}
