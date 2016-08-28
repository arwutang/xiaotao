package com.tools.tax;


public class ShanghaiTaxCalc extends TaxCalc {
    private static final double monthlyEmployeeIncomeAvg = 5939;

    public ShanghaiTaxCalc(double basicSalary, double bonus, double unpaidTaxableIncome) {
        super(basicSalary, bonus, unpaidTaxableIncome);

        // social insurance
        this.employeePensionRate = 0.08;
        this.employeeMedicalInsuranceRate = 0.02;
        this.employeeUnemploymentInsuranceRate = 0.005;
        // house fund
        this.employeeHouseFundRate = 0.07;

        this.maxEmployeeHouseFund = (double) 2494 / 2;
    }

    @Override
    protected void calcEmployeeSocialInsurance() {
        double basicSalary = salaryItems.get(SalaryItem.BasicSalary);

        double baseSocialInsurance = salaryItems.get(SalaryItem.BasicSalary);

        if (basicSalary < 3563) {
            baseSocialInsurance = 3563;
        }

        if (basicSalary > 17817) {
            baseSocialInsurance = 17817;
        }

        salaryItems.put(SalaryItem.EmployeePension, Helper.getScaleDouble(baseSocialInsurance * employeePensionRate, 2));
        salaryItems.put(SalaryItem.EmployeeMedicalInsurance, Helper.getScaleDouble(baseSocialInsurance * employeeMedicalInsuranceRate, 2));
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
