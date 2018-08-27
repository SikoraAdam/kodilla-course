package com.kodilla.good.patterns.challenges.modul_9_2;

import com.kodilla.good.patterns.challenges.modul_9_2.info_service.MailInformationService;
import com.kodilla.good.patterns.challenges.modul_9_2.order.ItemOrderService;
import com.kodilla.good.patterns.challenges.modul_9_2.order.OrderSummary;
import com.kodilla.good.patterns.challenges.modul_9_2.order.OrderSummaryRetriever;
import com.kodilla.good.patterns.challenges.modul_9_2.order_repository.ItemOrderRepository;
import com.kodilla.good.patterns.challenges.modul_9_2.product.ProductOrderService;

public class Application {

    public static void main(String[] args) {

        OrderSummaryRetriever orderSummaryRetriever = new OrderSummaryRetriever();
        OrderSummary orderSummary = orderSummaryRetriever.retriever();

        ProductOrderService productOrderService = new ProductOrderService(
                new ItemOrderService(), new MailInformationService(), new ItemOrderRepository());
        productOrderService.process(orderSummary);
    }
}