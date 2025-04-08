package optional;

import optional.model.Delivery;
import optional.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DeliveryMain {
    static Map<Long, Order> orderRepository = new HashMap<>();

    static {
        orderRepository.put(1l, new Order(1l, new Delivery("배송완료", false)));
        orderRepository.put(2l, new Order(2l, new Delivery("배송중", false)));
        orderRepository.put(3l, new Order(3l, new Delivery("배송중", true)));
        orderRepository.put(4l, new Order(4l, null));
    }

    public static void main(String[] args) {
        System.out.println("1 = " + getDeliveryStatus(1l));
        System.out.println("2 = " + getDeliveryStatus(2l));
        System.out.println("3 = " + getDeliveryStatus(3l));
        System.out.println("4 = " + getDeliveryStatus(4l));
    }

    private static String getDeliveryStatus(Long orderId){
        return  findOrder(orderId)
                .map(Order::getDelivery)
                .filter(d -> !d.isCanceled())
                .map(Delivery::getStatus)
                .orElse("배송X");
    }

    static Optional<Order> findOrder(Long orderId){
        return Optional.ofNullable(orderRepository.get(orderId));
    }
}
