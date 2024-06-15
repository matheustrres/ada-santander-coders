package main;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SellCarService sellCarService = new SellCarService();

        Car car = new Car();
        car.setBrand(Brand.FORD);
        car.setModel("Fusion");
        car.setPrice(new BigDecimal("90000.00"));

        BigDecimal carSellingValue = sellCarService.calculateSellingValue(car);

        System.out.println("Fusion selling price: " + car.getPrice());
        System.out.println("Fusion selling price with discount: " + carSellingValue);

        Car car2 = new Car();
        car2.setBrand(Brand.FIAT);
        car2.setModel("Uno");
        car2.setPrice(new BigDecimal("40000.00"));

        BigDecimal car2SellingValue = sellCarService.calculateSellingValue(car2);

        System.out.println("Uno selling price: " + car2.getPrice());
        System.out.println("Uno selling price with discount: " + car2SellingValue);
    }
}