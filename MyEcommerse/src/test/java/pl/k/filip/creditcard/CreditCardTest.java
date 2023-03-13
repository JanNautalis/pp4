package pl.k.filip.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignCreditLimit() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //Act
        card.assignLimit(BigDecimal.valueOf(1000));
        //Assert
        assertEquals(BigDecimal.valueOf(1000),card.getBalance());
        assert card.getBalance().equals(BigDecimal.valueOf(1000));
    }
    @Test
    void itAllowsToAssignCreditLimits() {
        //Arrange
        CreditCard card1 = new CreditCard("1234-5678");
        CreditCard card2 = new CreditCard("1234-5678");
        //Act
        card1.assignLimit(BigDecimal.valueOf(1000));
        card2.assignLimit(BigDecimal.valueOf(1000));
        //Assert
        assert card1.getBalance().equals(BigDecimal.valueOf(1000));
        assert card2.getBalance().equals(BigDecimal.valueOf(1000));
    }

    @Test
    void itCanAssignLimitBelow100(){
        CreditCard card = new CreditCard("1234-5678");

        try{
            card.assignLimit(BigDecimal.valueOf(50));
        } catch (CreditBellowThresholdExeption e){
            assertTrue(true);
        }

        assertThrows(
                CreditBellowThresholdExeption.class,
                () -> card.assignLimit(BigDecimal.valueOf(10)));
        assertThrows(
                CreditBellowThresholdExeption.class,
                () -> card.assignLimit(BigDecimal.valueOf(99)));
    }

    @Test
    void testDoubleAndFloats(){
        /*double x1 = 0.03;
        double x2 = 0.01;
        double result = x1 - x2;

        System.out.println(result);*/
    }
}
