package com.tools.tax;

import java.util.*;


@SuppressWarnings("unchecked")
public abstract class TaxCalc {
    private static final double minTaxLine = 3500;

    private static final List<ArrayList<Double>> taxTable = new ArrayList<>();

    static {
            taxTable.add(new ArrayList(Arrays.asList(0D, 0D, 0D)));
            taxTable.add(new ArrayList(Arrays.asList(1500D, 0.03, 0D)));
            taxTable.add(new ArrayList(Arrays.asList(4500D, 0.10, 105D)));
            taxTable.add(new ArrayList(Arrays.asList(9000D, 0.20, 555D)));
            taxTable.add(new ArrayList(Arrays.asList(35000D, 0.25, 1005D)));
            taxTable.add(new ArrayList(Arrays.asList(55000D, 0.30, 2755D)));
            taxTable.add(new ArrayList(Arrays.asList(80000D, 0.35, 5505D)));
            taxTable.add(new ArrayList(Arrays.asList(Double.MAX_VALUE, 0.45, 13505D)));
    }

    // 员工 - 养老保险比例
    protected double employeePensionRate;

    // 员工 - 医疗保险比例
    protected double employeeMedicalInsuranceRate;

    // 员工 - 失业保险比例
    protected double employeeUnemploymentInsuranceRate;

    // 员工 - 住房公积金比例
    protected double employeeHouseFundRate;

    // 员工公积金缴存金额上限
    protected double maxEmployeeHouseFund;

    // salary items
    protected Map<SalaryItem, Double> salaryItems = new HashMap<>();

    public TaxCalc(
            double basicSalary,
            double bonus,
            double unpaidTaxableIncome
    ) {
        salaryItems.put(SalaryItem.BasicSalary, basicSalary);
        salaryItems.put(SalaryItem.Bonus, bonus);
        salaryItems.put(SalaryItem.UnpaidTaxableIncome, unpaidTaxableIncome);
        salaryItems.put(SalaryItem.EmployeeAdditionalHouseFund, 0D);
    }

    public TaxCalc(
            double basicSalary,
            double bonus,
            double unpaidTaxableIncome,
            double employeeAdditionalHouseFund
    ) {
        salaryItems.put(SalaryItem.BasicSalary, basicSalary);
        salaryItems.put(SalaryItem.Bonus, bonus);
        salaryItems.put(SalaryItem.UnpaidTaxableIncome, unpaidTaxableIncome);
        salaryItems.put(SalaryItem.EmployeeAdditionalHouseFund, employeeAdditionalHouseFund);
    }

    protected abstract void calcEmployeeSocialInsurance();

    protected abstract void calcEmployeeHouseFund();

    protected void calcIndividualIncomeTax() {
        double totalBeforeTax = salaryItems.get(SalaryItem.BasicSalary)
                + salaryItems.get(SalaryItem.Bonus)
                + salaryItems.get(SalaryItem.UnpaidTaxableIncome)
                - salaryItems.getOrDefault(SalaryItem.EmployeeSocialInsurance, 0D)
                - salaryItems.getOrDefault(SalaryItem.EmployeeHouseFund, 0D)
                - salaryItems.getOrDefault(SalaryItem.EmployeeAdditionalHouseFund, 0D)
                - salaryItems.getOrDefault(SalaryItem.IndividualIncomeTax, 0D)
                - minTaxLine;

        ArrayList<Double> taxRule = null ;

        for (ArrayList<Double> rule : taxTable) {
            if (totalBeforeTax < rule.get(0)) {
                taxRule = rule;
                break;
            }
        }

        assert taxRule != null;

        double individualIncomeTax = totalBeforeTax * taxRule.get(1)  - taxRule.get(2);
        salaryItems.put(SalaryItem.IndividualIncomeTax, Helper.getScaleDouble(individualIncomeTax, 2));
    }

    public void calcTax() {
        calcEmployeeSocialInsurance();
        calcEmployeeHouseFund();
        calcIndividualIncomeTax();

        double netPay = salaryItems.get(SalaryItem.BasicSalary)
                + salaryItems.get(SalaryItem.Bonus)
                - salaryItems.getOrDefault(SalaryItem.EmployeeSocialInsurance, 0D)
                - salaryItems.getOrDefault(SalaryItem.EmployeeHouseFund, 0D)
                - salaryItems.getOrDefault(SalaryItem.EmployeeAdditionalHouseFund, 0D)
                - salaryItems.getOrDefault(SalaryItem.IndividualIncomeTax, 0D);

        salaryItems.put(SalaryItem.NetPay, netPay);
    }
}