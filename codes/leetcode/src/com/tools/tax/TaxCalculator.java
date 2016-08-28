package com.tools.tax;


public class TaxCalculator {
    public static void main(String[] args) {
        TaxCalc calc = new ShanghaiTaxCalc(29580, 0, 0);
        calc.calcTax();

        System.out.println(Helper.formatSalaryResult(calc.salaryItems));
    }
}
