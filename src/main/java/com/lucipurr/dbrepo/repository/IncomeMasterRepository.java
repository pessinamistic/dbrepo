package com.lucipurr.dbrepo.repository;

import com.lucipurr.dbrepo.entity.IncomeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeMasterRepository extends JpaRepository<IncomeMaster, Number> {

    IncomeMaster findByEmpId(String empId);

}
