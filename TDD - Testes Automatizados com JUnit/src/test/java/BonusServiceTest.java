import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Employee;
import br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {
    
    @Test
    void bonusShouldBeZeroForEmployeeWithSalaryMoreThan10000Dollars(){
        BonusService service = new BonusService();
        
        //assertThrows(IllegalArgumentException.class,
        //    () -> service.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("25000"))));

        try {
            service.calculateBonus(new Employee("Lucas", LocalDate.now(), new BigDecimal("25000")));
            fail("Failed exception!");
        } catch (Exception e) {
            assertEquals("Employee with salary more then $10000.00 can't have any bonus!", e.getMessage());
        }
    }

    @Test
    void bonusShouldBe10PercentOfSalaryLowerThan10000Dollars(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calculateBonus(new Employee("Roberto", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.0"), bonus);
    }

    @Test
    void bonusShouldBe10PercentOfSalaryOfExacly10000Dollars(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calculateBonus(new Employee("Ingrid", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}
