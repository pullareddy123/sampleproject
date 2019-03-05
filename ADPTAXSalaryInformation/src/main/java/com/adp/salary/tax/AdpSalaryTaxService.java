package com.adp.salary.tax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdpSalaryTaxService {

	@Autowired
	private Environment envi;
	@GetMapping(path="/adpsalary/{eno}/{salary}")
	public AdpSalaryTaxDetails getSalaryDetails(@PathVariable("eno") Integer eno,

			@PathVariable("salary") Double salary
			) 
	{

		Double taxAmount = (salary * 20) / 100;
		Double salaryAfterTax = salary - taxAmount;

		AdpSalaryTaxDetails taxDetails = new AdpSalaryTaxDetails();
		taxDetails.setEno(eno);
		taxDetails.setTaxAmount(taxAmount);
		taxDetails.setSalaryAfterTax(salaryAfterTax);
		taxDetails.setPortNumber(Integer.parseInt(envi.getProperty("local.server.port")));
		return taxDetails;
	}

}
