package com.interview.company.company_branch_managment.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.interview.company.company_branch_managment.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

	@Query("SELECT c.name FROM Company c JOIN c.address a WHERE a.cityName = 'Delhi' GROUP BY c.name HAVING COUNT(a) >= 2")
    List<String> findCompaniesWithTwoOrMoreBranchesInDelhi();
	
}
