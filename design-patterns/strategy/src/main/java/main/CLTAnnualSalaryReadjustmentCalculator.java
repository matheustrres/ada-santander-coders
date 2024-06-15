package main;

import java.math.BigDecimal;

public class CLTAnnualSalaryReadjustmentCalculator implements AnnualSalaryReadjustmentCalculator {
    private static final BigDecimal CLTReadjustmentPercent = new BigDecimal("0.10");

    @Override
    public void calculateAnnualReadjustment(Employee employee) {
        BigDecimal employeeSalary = employee.getSalary();

        employee.setSalary(employeeSalary.add(employeeSalary.multiply(CLTReadjustmentPercent)));
    }
}
