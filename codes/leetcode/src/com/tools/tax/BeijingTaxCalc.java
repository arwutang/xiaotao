package com.tools.tax;


public class BeijingTaxCalc extends TaxCalc {
    private static final double monthlyEmployeeIncomeAvg = 6463;

    public BeijingTaxCalc(double basicSalary, double bonus, double unpaidTaxableIncome) {
        super(basicSalary, bonus, unpaidTaxableIncome);

        // social insurance
        this.employeePensionRate = 0.08;
        this.employeeMedicalInsuranceRate = 0.02;
        this.employeeUnemploymentInsuranceRate = 0.002;
        // house fund
        this.employeeHouseFundRate = 0.12;

        this.maxEmployeeHouseFund = (double) 5102 / 2;
    }

    @Override
    protected void calcEmployeeSocialInsurance() {
        double basicSalary = salaryItems.get(SalaryItem.BasicSalary);

        double baseSocialInsurance;

        if (basicSalary < monthlyEmployeeIncomeAvg * 0.4) {
            baseSocialInsurance = 2834;
        } else if (basicSalary < monthlyEmployeeIncomeAvg * 0.6) {
            baseSocialInsurance = 4252;
        } else if (basicSalary < monthlyEmployeeIncomeAvg * 0.7) {
            baseSocialInsurance = 4960;
        } else if (basicSalary < monthlyEmployeeIncomeAvg * 3) {
            baseSocialInsurance = 7086;
        } else {
            baseSocialInsurance = 21258;
        }

        salaryItems.put(SalaryItem.EmployeePension, Helper.getScaleDouble(baseSocialInsurance * employeePensionRate, 2));
        salaryItems.put(SalaryItem.EmployeeMedicalInsurance, Helper.getScaleDouble(baseSocialInsurance * employeeMedicalInsuranceRate + 3, 2));
        salaryItems.put(SalaryItem.EmployeeUnemploymentInsurance, Helper.getScaleDouble(baseSocialInsurance * employeeUnemploymentInsuranceRate, 2));

        double employeeSocialInsurance = salaryItems.get(SalaryItem.EmployeePension)
                                       + salaryItems.get(SalaryItem.EmployeeMedicalInsurance)
                                       + salaryItems.get(SalaryItem.EmployeeUnemploymentInsurance);
        salaryItems.put(SalaryItem.EmployeeSocialInsuranceAll, Helper.getScaleDouble(employeeSocialInsurance, 2));
    }

    @Override
    protected void calcEmployeeHouseFund() {
        double employeeHouseFund = Helper.getScaleDouble(salaryItems.get(SalaryItem.BasicSalary) * employeeHouseFundRate, 2);

        salaryItems.put(SalaryItem.EmployeeHouseFund, Helper.getScaleDouble(Math.min(maxEmployeeHouseFund, employeeHouseFund), 2));

        double employeeHouseFundAll = salaryItems.get(SalaryItem.EmployeeHouseFund) + salaryItems.get(SalaryItem.EmployeeAdditionalHouseFund);
        salaryItems.put(SalaryItem.EmployeeHouseFundAll, Helper.getScaleDouble(employeeHouseFundAll, 2));
    }
}
