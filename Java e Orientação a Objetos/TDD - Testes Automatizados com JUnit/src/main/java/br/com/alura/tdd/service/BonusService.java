package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Employee;

public class BonusService {

	public BigDecimal calculateBonus(Employee employee) {
		BigDecimal value = employee.getSalario().multiply(new BigDecimal("0.1"));
		if (value.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Employee with salary more then $10000.00 can't have any bonus!");
		}
		return value;
	}

}
