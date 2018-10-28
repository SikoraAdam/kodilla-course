package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeSuit {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchingFacade searchingFacade;

    @Test
    public void testSearchingCompanyFacade() throws SearchingException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMatters = new Company("Data Matters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMatters);
        companyDao.save(greyMatter);

        //When
        List<Company> companyList1 = searchingFacade.findCompany("Matt");

        //Then
        Assert.assertEquals(2, companyList1.size());

        //CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSearchingEmployeeFacade() throws SearchingException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee johnKovalsky = new Employee("John", "Kovalsky");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(johnKovalsky);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> employeeList1 = searchingFacade.findEmployee("ohn");

        //Then
        Assert.assertEquals(2, employeeList1.size());

        //CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
