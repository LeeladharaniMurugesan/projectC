package com.chainsys.application.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.application.model.Employee;
import com.chainsys.application.model.EmployeeDao;

@RestController
public class Service {
	//@RequestMapping(value="/getEmp",method=RequestMethod.GET)
	@RequestMapping("/getEmp")
	public String getData(@RequestParam(name = "id") String id) {
		int empId = Integer.parseInt(id);
		Employee emp = EmployeeDao.getEmployeeById(empId);
		return emp.getFirst_name() + ", " + emp.getLast_name() + ", " + emp.getJob_id() + ", " + emp.getSalary() + ", "
				+ emp.getHire_date() + ", " + emp.getEmail();
	}
	// @RequestMapping(value="/getallemp",method=RequestMethod.GET)
	@RequestMapping("/getallemp")
	public String getallemp() {
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		String result = "";
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			result += "<div>" + emp.getEmp_id() + " : " + emp.getFirst_name() + " : " + emp.getLast_name() + " : "
					+ emp.getEmail() + " : " + emp.getHire_date() + " : " + emp.getJob_id() + " : " + emp.getSalary()
					+ "</div>";
		}
		return result;
}
	@RequestMapping(value="/newemployee",method=RequestMethod.POST)
	public int addNewEmployee() {
		return 0;
	}
	@RequestMapping(value="/updateemployee",method=RequestMethod.PUT)
	public int modifyEmployee() {
		return 1;
	}
	@RequestMapping(value="/removeemployee",method=RequestMethod.DELETE)
	public int deleteEmployee() {
		return 2;
	}
}
