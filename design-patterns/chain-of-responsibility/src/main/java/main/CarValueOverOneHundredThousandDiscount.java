package main;

import java.math.BigDecimal;

public class CarValueOverOneHundredThousandDiscount extends CarDiscount {
    private final static BigDecimal DISCOUNT = new BigDecimal(10_000);

    private final static BigDecimal ONE_HUNDRED_THOUSAND = new BigDecimal("100000.00");

    public CarValueOverOneHundredThousandDiscount(CarDiscount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal carPrice = car.getPrice();

        return carPrice.compareTo(ONE_HUNDRED_THOUSAND) > 0
                ? carPrice.subtract(DISCOUNT)
                : nextDiscount.applyDiscount(car);
    }
}