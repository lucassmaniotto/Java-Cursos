import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Employee;
import br.com.alura.tdd.modelo.Performance;
import br.com.alura.tdd.service.ReajustmentBonusService;

public class ReajustmentBonusServiceTest {

    private ReajustmentBonusService service;
    private Employee employee;

    @BeforeAll
    public static void beforeStart() {
        System.out.println("Before all tests start");
    }

    @BeforeEach
    public void start(){
        System.out.println("Test started");
        this.service = new ReajustmentBonusService();
        this.employee = new Employee("Tyler Joseph", LocalDate.now(), new BigDecimal("1000"));
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
        service.grantReadjustment(employee, Performance.TO_BE_DESIRED);

        assertEquals(new BigDecimal("1030.00"), employee.getSalario());
    }

    @Test
    public void reajustmentShouldBe15PercentWhenPerformanceIsGood(){
        service.grantReadjustment(employee, Performance.GOOD);

        assertEquals(new BigDecimal("1150.00"), employee.getSalario());
    }

    @Test
    public void reajustmentShouldBe20PercentWhenPerformanceIsGreat(){
        service.grantReadjustment(employee, Performance.GREAT);

        assertEquals(new BigDecimal("1200.00"), employee.getSalario());
    }

    @Test
    public void reajustmentShouldBe40PercentWhenPerformanceIsEspectacular(){
        service.grantReadjustment(employee, Performance.ESPECTACULAR);

        assertEquals(new BigDecimal("1400.00"), employee.getSalario());
    }
}