package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;

public class ReajustmentBonusService {

    public void grantReadjustment(Funcionario funcionario, Performance performance) {
        BigDecimal percent = performance.percentReajust();
        BigDecimal reajust = funcionario.getSalario().multiply(percent);
        funcionario.reajustSalary(reajust);
    }
}
