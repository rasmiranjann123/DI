package in.coderarmy;

import in.coderarmy.notification.EmailNotification;
import in.coderarmy.notification.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotificationService notificationService=new EmailNotification();

        OrderService orderService=new OrderService(notificationService);

        orderService.placedOrder();



    }
}