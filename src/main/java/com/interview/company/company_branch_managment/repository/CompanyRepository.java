package com.interview.company.company_branch_managment.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.interview.company.company_branch_managment.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	@Query("SELECT c FROM Company c JOIN c.addresses a WHERE a.cityName = 'Delhi' GROUP BY c.companyId HAVING COUNT(a) >=2")
	List<Company> findCompaniesWithTwoOrMoreBranchesInDelhi();
}
