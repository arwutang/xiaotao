package com.tools.tax;

import java.math.BigDecimal;
import java.util.Map;

public class Helper {
    protected static double getScaleDouble(double number, int scale) {
        return new BigDecimal(number).setScale(scale,  BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static String formatSalaryResult(Map<SalaryItem, Double> salaryItems) {
        String newLine = "\n";
        String spiltLine = "=========================================" + newLine;
        String itemFormat = " %-20s %,.2f %s";

        String sb = spiltLine +
                String.format(itemFormat, "基本工资收入", salaryItems.get(SalaryItem.BasicSalary), newLine) +
                String.format(itemFormat, "补贴/奖金收入", salaryItems.get(SalaryItem.Bonus), newLine) +
                newLine +
                String.format(itemFormat, "计税但不发薪", salaryItems.get(SalaryItem.UnpaidTaxableIncome), newLine) +
                spiltLine +
                String.format(itemFormat, "个人 - 养老保险", salaryItems.get(SalaryItem.EmployeePension), newLine) +
                String.format(itemFormat, "个人 - 医疗保险", salaryItems.get(SalaryItem.EmployeeMedicalInsurance), newLine) +
                String.format(itemFormat, "个人 - 失业保险", salaryItems.get(SalaryItem.EmployeeUnemploymentInsurance), newLine) +
                newLine +
                String.format(itemFormat, "个人 - 社会保险", salaryItems.get(SalaryItem.EmployeeSocialInsurance), newLine) +
                spiltLine +
                String.format(itemFormat, "个人 - 住房公积金", salaryItems.get(SalaryItem.EmployeeHouseFund), newLine) +
                String.format(itemFormat, "个人 - 补充公积金", salaryItems.get(SalaryItem.EmployeeAdditionalHouseFund), newLine) +
                spiltLine +
                String.format(itemFormat, "应纳个人所得税", salaryItems.get(SalaryItem.IndividualIncomeTax), newLine) +
                spiltLine +
                String.format(itemFormat, "个人税后收入", salaryItems.get(SalaryItem.NetPay), newLine) +
                spiltLine;

        return sb;
    }
}
