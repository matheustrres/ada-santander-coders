package main;

import java.math.BigDecimal;

public class PJAnnualSalaryReadjustmentCalculator implements AnnualSalaryReadjustmentCalculator {
    private static final BigDecimal PJReadjustmentPercent = new BigDecimal("0.05");

    @Override
    public void calculateAnnualReadjustment(Employee employee) {
        BigDecimal employeeSalary = employee.getSalary();

        employee.setSalary(employeeSalary.add(employeeSalary.multiply(PJReadjustmentPercent)));
    }
}
