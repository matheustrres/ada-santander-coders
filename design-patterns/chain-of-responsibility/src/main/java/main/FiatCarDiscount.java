package main;

import java.math.BigDecimal;

public class FiatCarDiscount extends CarDiscount {
    private final static BigDecimal FIAT_DISCOUNT = new BigDecimal(1_000);

    public FiatCarDiscount(CarDiscount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal carPrice = car.getPrice();
        String carBrand = car.getBrand().name();

        return Brand.FIAT.name().equals(carBrand)
                ? carPrice.subtract(FIAT_DISCOUNT)
                : nextDiscount.applyDiscount(car);
    }
}
