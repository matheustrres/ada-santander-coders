package main;

import java.math.BigDecimal;

public class SellCarService {
    public BigDecimal calculateSellingValue(Car car) {
        CarDiscount discount = new FiatCarDiscount(
                new FordCarDiscount(
                        new CarValueOverOneHundredThousandDiscount(
                                new NoDiscount(null)
                        )
                )
        );

        return discount.applyDiscount(car);
    }
}
