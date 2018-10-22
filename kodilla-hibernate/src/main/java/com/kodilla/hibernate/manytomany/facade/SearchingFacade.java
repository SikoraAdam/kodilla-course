package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompany (String field) throws SearchingException{
        if (!companyDao.retrieveCompaniesWithStringInside("%"+field+"%").isEmpty()) {
            return companyDao.retrieveCompaniesWithStringInside("%"+field+"%");
        }
        else {
            throw new SearchingException(SearchingException.ERR_NO_COMPANY);
        }


    }

    public List<Employee> findEmployee (String field) throws SearchingException {
        if (!employeeDao.retrieveEmployeesWithStringInside("%"+field+"%").isEmpty()) {
            return employeeDao.retrieveEmployeesWithStringInside("%"+field+"%");
        }
        else {
            throw new SearchingException((SearchingException.ERR_NO_EMPLOYEE));
        }
    }

}
