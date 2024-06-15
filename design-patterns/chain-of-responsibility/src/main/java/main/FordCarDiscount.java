package main;

import java.math.BigDecimal;

public class FordCarDiscount extends CarDiscount {
    private final static BigDecimal FORD_DISCOUNT = new BigDecimal(2_000);

    public FordCarDiscount(CarDiscount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal carPrice = car.getPrice();
        String carBrand = car.getBrand().name();

        return Brand.FORD.name().equals(carBrand)
                ? carPrice.subtract(FORD_DISCOUNT)
                : nextDiscount.applyDiscount(car);
    }
}