package com.lucipurr.dbrepo.repository;

import com.lucipurr.dbrepo.entity.DeductionsMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeductionsMasterRepository extends JpaRepository<DeductionsMaster, Number> {

    DeductionsMaster findByEmpId(String empId);

}
