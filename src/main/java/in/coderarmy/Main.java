package in.coderarmy;

import in.coderarmy.notification.EmailNotification;
import in.coderarmy.notification.NotificationService;
import in.strike.Cart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService service=context.getBean(OrderService.class);

        service.placedOrder();

        User user=context.getBean(User.class);

        System.out.println(user.getName());

        Cart cart=context.getBean(Cart.class);

        cart.addToCart();

    }
}