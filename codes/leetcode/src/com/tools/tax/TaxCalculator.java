package com.tools.tax;


public class TaxCalculator {
    public static void main(String[] args) {
        //14583.33333333333334
        TaxCalc shanghaiTaxCalc1 = new ShanghaiTaxCalc(350000 / (double)12 + 1247.00 + 1870.79, 0, 0);
        shanghaiTaxCalc1.calcTax();

//        TaxCalc shanghaiTaxCalc2 = new ShanghaiTaxCalc(3500, 30000 - 3500, 0);
//        shanghaiTaxCalc2.calcTax();

        System.out.println(Helper.formatSalaryResult(shanghaiTaxCalc1.salaryItems));
        //System.out.println(Helper.formatSalaryResult(shanghaiTaxCalc2.salaryItems));
    }
}
