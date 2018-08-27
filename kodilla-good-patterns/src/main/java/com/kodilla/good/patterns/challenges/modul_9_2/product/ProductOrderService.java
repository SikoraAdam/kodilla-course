package com.kodilla.good.patterns.challenges.modul_9_2.product;

import com.kodilla.good.patterns.challenges.modul_9_2.info_service.InformationService;
import com.kodilla.good.patterns.challenges.modul_9_2.order.OrderDto;
import com.kodilla.good.patterns.challenges.modul_9_2.order.OrderService;
import com.kodilla.good.patterns.challenges.modul_9_2.order.OrderSummary;
import com.kodilla.good.patterns.challenges.modul_9_2.order_repository.OrderRepository;

public class ProductOrderService {

    private final OrderService orderService;
    private final InformationService informationService;
    private final OrderRepository productOrderRepository;

    public ProductOrderService(final OrderService orderService, final InformationService informationService,
                        final OrderRepository productOrderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDto process(OrderSummary orderSummary) {

        boolean isBought = orderService.handleOrder(orderSummary.getOrder());

        if (isBought) {
            informationService.informAboutOrder(orderSummary.getBuyer(), orderSummary.getOrder());
            productOrderRepository.createRepository(orderSummary.getBuyer(), orderSummary.getProduct(), orderSummary.getOrder());
            return new OrderDto(orderSummary.getBuyer(), true);
        } else {
            return new OrderDto(orderSummary.getBuyer(), false);
        }
    }
}


