package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private final OrderService orderService;
    private final InformationService informationService;
    private final OrderRepository productOrderRepository;

    ProductOrderService(final OrderService orderService, final InformationService informationService,
                        final OrderRepository productOrderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDto process(OrderSummary orderSummary) {

        boolean isBought = orderService.handleOrder(orderSummary.order);

        if (isBought) {
            informationService.informAboutOrder(orderSummary.buyer, orderSummary.order);
            productOrderRepository.createRepository(orderSummary.buyer, orderSummary.product, orderSummary.order);
            return new OrderDto(orderSummary.buyer, true);
        } else {
            return new OrderDto(orderSummary.buyer, false);
        }
    }
}


