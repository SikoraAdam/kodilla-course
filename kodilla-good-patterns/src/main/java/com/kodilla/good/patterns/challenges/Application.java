package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderSummaryRetriever orderSummaryRetriever = new OrderSummaryRetriever();
        OrderSummary orderSummary = orderSummaryRetriever.retriever();

        ProductOrderService productOrderService = new ProductOrderService(
                new ItemOrderService(), new MailInformationService(), new ItemOrderRepository());
        productOrderService.process(orderSummary);
    }
}
