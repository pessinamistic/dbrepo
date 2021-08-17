package com.lucipurr.dbrepo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeMaster {
    private com.lucipurr.tax.database.model.EmployeeInfoMaster employeeInfoMaster;
    private com.lucipurr.tax.database.model.IncomeMaster incomeMaster;
    private DeductionsMaster deductionsMaster;
}
