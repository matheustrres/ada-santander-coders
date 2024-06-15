package main;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee CLT = new Employee();
        CLT.setName("Victor");
        CLT.setContractType(ContractType.CLT);
        CLT.setSalary(new BigDecimal(5_000));

        Employee PJ = new Employee();
        PJ.setName("Alex");
        PJ.setContractType(ContractType.PJ);
        PJ.setSalary(new BigDecimal(10_000));

        Employee intern = new Employee();
        intern.setName("Caio");
        intern.setContractType(ContractType.INTERN);
        intern.setSalary(new BigDecimal(2_000));

        System.out.println(CLT);
        System.out.println(PJ);
        System.out.println(intern);

        AnnualSalaryReadjustmentStrategy annualSalaryReadjustmentStrategy = new AnnualSalaryReadjustmentStrategy();

        annualSalaryReadjustmentStrategy.calculateAnnualReadjustment(CLT, new CLTAnnualSalaryReadjustmentCalculator());
        annualSalaryReadjustmentStrategy.calculateAnnualReadjustment(PJ, new PJAnnualSalaryReadjustmentCalculator());
        annualSalaryReadjustmentStrategy.calculateAnnualReadjustment(intern, new InternAnnualSalaryReadjustmentCalculator());

        System.out.println(CLT);
        System.out.println(PJ);
        System.out.println(intern);
    }
}