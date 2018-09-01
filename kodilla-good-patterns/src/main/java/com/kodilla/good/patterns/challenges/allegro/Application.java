package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.info.service.MailInformationService;
import com.kodilla.good.patterns.challenges.allegro.order.ItemOrderService;
import com.kodilla.good.patterns.challenges.allegro.order.OrderSummary;
import com.kodilla.good.patterns.challenges.allegro.order.OrderSummaryRetriever;
import com.kodilla.good.patterns.challenges.allegro.order.repository.ItemOrderRepository;
import com.kodilla.good.patterns.challenges.allegro.product.ProductOrderService;

public class Application {

    public static void main(String[] args) {

        OrderSummaryRetriever orderSummaryRetriever = new OrderSummaryRetriever();
        OrderSummary orderSummary = orderSummaryRetriever.retriever();

        ProductOrderService productOrderService = new ProductOrderService(
                new ItemOrderService(), new MailInformationService(), new ItemOrderRepository());
        productOrderService.process(orderSummary);
    }
}