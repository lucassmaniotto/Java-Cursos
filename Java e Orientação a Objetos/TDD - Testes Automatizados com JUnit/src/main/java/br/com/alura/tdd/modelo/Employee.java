package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate admissionDate;
	private BigDecimal salary;

	public Employee(String name, LocalDate admissionDate, BigDecimal salary) {
		this.name = name;
		this.admissionDate = admissionDate;
		this.salary = salary;
	}

	public String getNome() {
		return name;
	}

	public LocalDate getDataAdmissao() {
		return admissionDate;
	}

	public BigDecimal getSalario() {
		return salary;
	}

    public void reajustSalary(BigDecimal reajust) {
		this.salary = this.salary.add(reajust);
    }

	// se um método é privado, ele não precisa ser testado porque já está sendo usado internamente na classe por outros métodos. 
}
