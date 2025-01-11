package com.interview.company.company_branch_managment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.interview.company.company_branch_managment.entity.Company;
import com.interview.company.company_branch_managment.repository.CompanyRepository;

@Service
public class CompanyService {
	
	private final CompanyRepository companyRepository;
	
	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}
	
	public List<Company> getCompaniesWithTwoOrMoreBranchesInDelhi() {
		return companyRepository.findCompaniesWithTwoOrMoreBranchesInDelhi();
	}
}