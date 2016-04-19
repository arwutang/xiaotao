package com.tools.tax;


public class TaxCalculator {
    public static void main(String[] args) {
        TaxCalc calc = new BeijingTaxCalc(100000, 10000, 10000);
        calc.calcTax();

        System.out.println(Helper.formatSalaryResult(calc.salaryItems));
    }
}
