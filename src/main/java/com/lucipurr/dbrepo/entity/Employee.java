package com.lucipurr.dbrepo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private EmployeeInfo emp;
    private Income income;
    private Deductions deductions;
}
