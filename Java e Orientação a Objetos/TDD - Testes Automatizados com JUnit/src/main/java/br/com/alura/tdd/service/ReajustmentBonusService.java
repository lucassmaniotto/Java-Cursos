package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Employee;
import br.com.alura.tdd.modelo.Performance;

public class ReajustmentBonusService {

    public void grantReadjustment(Employee employee, Performance performance) {
        BigDecimal percent = performance.percentReajust();
        BigDecimal reajust = employee.getSalario().multiply(percent);
        employee.reajustSalary(reajust);
    }
}
