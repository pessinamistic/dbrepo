package com.lucipurr.dbrepo.repository;

import com.lucipurr.dbrepo.entity.DeductionsMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeductionsMasterRepository extends JpaRepository<DeductionsMaster, Number> {

    @Query(value = "SELECT D FROM DeductionsMaster D WHERE D.employeeInfoMaster.empId = (?1)")
    DeductionsMaster findByEmpId(String empId);

}
