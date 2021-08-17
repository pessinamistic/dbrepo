package com.lucipurr.dbrepo.repository;

import com.lucipurr.dbrepo.entity.EmployeeInfoMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeInfoMasterRepository extends JpaRepository<EmployeeInfoMaster, Number> {

    @Query(value = "SELECT U FROM EmployeeInfoMaster U WHERE UPPER(U.empId) = UPPER(?1)")
    EmployeeInfoMaster findByEmpId(String empId);

}