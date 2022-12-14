package com.dipu;

import java.sql.SQLException;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.dipu.extensions.EmployeeDaoParameterResolver;
import com.dipu.extensions.EmployeeDatabaseSetupExtension;
import com.dipu.extensions.EnvironmentExtension;
import com.dipu.extensions.IgnoreFileNotFoundExceptionExtension;
import com.dipu.extensions.LoggingExtension;
import com.dipu.helpers.Employee;
import com.dipu.helpers.EmployeeJdbcDao;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({ EnvironmentExtension.class, EmployeeDatabaseSetupExtension.class, EmployeeDaoParameterResolver.class })
@ExtendWith(LoggingExtension.class)
@ExtendWith(IgnoreFileNotFoundExceptionExtension.class)
public class EmployeesUnitTest {

    private EmployeeJdbcDao employeeDao;

    private Logger logger;

    public EmployeesUnitTest(EmployeeJdbcDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Test
    public void whenAddEmployee_thenGetEmployee() throws SQLException {
        Employee emp = new Employee(1, "john");
        employeeDao.add(emp);
        assertEquals(1, employeeDao.findAll()
            .size());
    }

    @Test
    public void whenGetEmployees_thenEmptyList() throws SQLException {
        assertEquals(0, employeeDao.findAll()
            .size());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
