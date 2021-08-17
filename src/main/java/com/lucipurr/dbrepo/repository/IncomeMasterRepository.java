package com.lucipurr.dbrepo.repository;

import com.lucipurr.dbrepo.entity.IncomeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeMasterRepository extends JpaRepository<IncomeMaster, Number> {

    @Query(value = "SELECT I FROM IncomeMaster I WHERE I.employeeInfoMaster.empId = (?1)")
    IncomeMaster findByEmpId(String empId);

}
