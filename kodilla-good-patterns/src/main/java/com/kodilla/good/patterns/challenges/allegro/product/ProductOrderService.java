package com.kodilla.good.patterns.challenges.allegro.product;

import com.kodilla.good.patterns.challenges.allegro.info.service.InformationService;
import com.kodilla.good.patterns.challenges.allegro.order.OrderDto;
import com.kodilla.good.patterns.challenges.allegro.order.OrderService;
import com.kodilla.good.patterns.challenges.allegro.order.OrderSummary;
import com.kodilla.good.patterns.challenges.allegro.order.repository.OrderRepository;

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


