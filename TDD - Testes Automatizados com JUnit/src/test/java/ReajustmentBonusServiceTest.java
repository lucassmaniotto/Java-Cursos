import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;
import br.com.alura.tdd.service.ReajustmentBonusService;

public class ReajustmentBonusServiceTest {

    private ReajustmentBonusService service;
    private Funcionario funcionario;

    @BeforeAll
    public static void beforeStart() {
        System.out.println("Before all tests start");
    }

    @BeforeEach
    public void start(){
        System.out.println("Test started");
        this.service = new ReajustmentBonusService();
        this.funcionario = new Funcionario("Tyler Joseph", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void end() {
        System.out.println("Test finished");
    }

    @AfterAll
    public static void beforeEnd() {
        System.out.println("After all tests ended");
    }

    @Test
    public void reajustmentShouldBe3PercentWhenPerformanceIsToBeDesired(){
        service.grantReadjustment(funcionario, Performance.TO_BE_DESIRED);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajustmentShouldBe15PercentWhenPerformanceIsGood(){
        service.grantReadjustment(funcionario, Performance.GOOD);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajustmentShouldBe20PercentWhenPerformanceIsGreat(){
        service.grantReadjustment(funcionario, Performance.GREAT);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

    @Test
    public void reajustmentShouldBe40PercentWhenPerformanceIsEspectacular(){
        service.grantReadjustment(funcionario, Performance.ESPECTACULAR);

        assertEquals(new BigDecimal("1400.00"), funcionario.getSalario());
    }
}