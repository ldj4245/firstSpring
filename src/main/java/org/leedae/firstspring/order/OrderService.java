package org.leedae.firstspring.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);


}
