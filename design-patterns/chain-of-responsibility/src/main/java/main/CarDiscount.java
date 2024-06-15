package main;

import java.math.BigDecimal;

public abstract class CarDiscount {
    protected CarDiscount nextDiscount;

    public CarDiscount(CarDiscount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public abstract BigDecimal applyDiscount(Car car);
}
