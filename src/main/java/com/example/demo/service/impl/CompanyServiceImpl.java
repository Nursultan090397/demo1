package com.example.demo.service.impl;

import com.example.demo.model.Company;
import com.example.demo.reposirtory.CompanyRepository;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void addCompany(Company company) {
        companyRepository.save(company);

    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.getById(id);
    }

    @Override
    public void updateCompany(Company company) {
        companyRepository.save(company);

    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);

    }
}