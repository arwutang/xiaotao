package com.tools.tax;


public enum  SalaryItem {
    // 基本工资收入
    BasicSalary,
    // 补贴奖金收入
    Bonus,
    // 计税不发薪
    UnpaidTaxableIncome,

    // 养老金 - 员工
    EmployeePension,
    // 医疗保险 - 员工
    EmployeeMedicalInsurance,
    // 失业保险 - 员工
    EmployeeUnemploymentInsurance,
    // 社会保险 - 员工
    EmployeeSocialInsuranceAll,

    // 住房公积金 - 员工
    EmployeeHouseFund,
    // 补充住房公积金 - 员工
    EmployeeAdditionalHouseFund,
    // 公积金 - 员工
    EmployeeHouseFundAll,

    // 纳税金额
    IndividualIncomeTax,
    // 税后收入
    NetPay
}