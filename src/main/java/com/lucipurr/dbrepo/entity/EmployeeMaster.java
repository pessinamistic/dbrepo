package com.lucipurr.dbrepo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeMaster {
    private EmployeeInfoMaster employeeInfoMaster;
    private IncomeMaster incomeMaster;
    private DeductionsMaster deductionsMaster;
}
