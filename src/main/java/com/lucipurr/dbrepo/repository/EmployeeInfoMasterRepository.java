package com.lucipurr.dbrepo.repository;

import com.lucipurr.dbrepo.entity.EmployeeInfoMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeInfoMasterRepository extends JpaRepository<EmployeeInfoMaster, Number> {

    EmployeeInfoMaster findByEmpId(String empId);

}