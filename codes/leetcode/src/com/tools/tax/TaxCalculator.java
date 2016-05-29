package com.tools.tax;


public class TaxCalculator {
    public static void main(String[] args) {
        TaxCalc calc = new BeijingTaxCalc(30700, 10300, 169.69);
        calc.calcTax();

        System.out.println(Helper.formatSalaryResult(calc.salaryItems));
    }
}
