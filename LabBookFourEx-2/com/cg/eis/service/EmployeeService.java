/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.eis.service;

import com.cg.eis.bean.Employee;
/**
 *
 * @author LENOVO
 */
public interface EmployeeService {
        public abstract void getEmployeeDetails(Employee emp);
	public abstract String findInsuranceScheme(Employee emp);
	public abstract void showEmployeeDetails(Employee emp);
}
