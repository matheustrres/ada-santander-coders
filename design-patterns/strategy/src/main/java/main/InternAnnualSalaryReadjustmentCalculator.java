package main;

import java.math.BigDecimal;

public class InternAnnualSalaryReadjustmentCalculator implements AnnualSalaryReadjustmentCalculator {
    private static final BigDecimal InternReadjustmentPercent = new BigDecimal("0.02");

    @Override
    public void calculateAnnualReadjustment(Employee employee) {
        BigDecimal employeeSalary = employee.getSalary();

        employee.setSalary(employeeSalary.add(employeeSalary.multiply(InternReadjustmentPercent)));
    }
}