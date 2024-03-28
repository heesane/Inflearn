package inflearn2.heesane.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
