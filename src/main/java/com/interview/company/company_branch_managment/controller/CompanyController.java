package com.interview.company.company_branch_managment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.company.company_branch_managment.entity.Company;
import com.interview.company.company_branch_managment.service.CompanyService;

@RestController

public class CompanyController {
	
	private final CompanyService companyService;
	
	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}
	
	@GetMapping("/companies/delhi")
	public List<Company> getCompaniesWithTwoOrMoreBranchesInDelhi() {
		return companyService.getCompaniesWithTwoOrMoreBranchesInDelhi();
		
	}
}