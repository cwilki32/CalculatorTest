import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void create() {
        //Arrange
        Calculator testCalculator = new Calculator();
    }

    @Test
    void add() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        int result = testCalculator.add(1, 2, 3);

        //Assert
        assertEquals(result, 6);
    }
    @Test
    void subtract() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.subtract(5,3);

        //Assert
        assertEquals(result, 2);
    }
    @Test
    void multiply() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.multiply(5,3);

        //Assert
        assertEquals(result, 15);
    }
    @Test
    void divide() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.divide(9,3);

        //Assert
        assertEquals(result, 3);
    }
    @Test
    void squareRt() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.squareRt(25);

        //Assert
        assertEquals(result, 5);
    }
}


/*    @Test
    void calculatorAddition() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.calculator(5,'+',3);

        //Assert
        assertEquals(result, 8);

    }
    @Test
    void calculatorSubtraction() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.calculator(5,'-',3);

        //Assert
        assertEquals(result, 2);

    }
    @Test
    void calculatorMultiplication() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.calculator(5,'*',3);

        //Assert
        assertEquals(result, 15);

    }
    @Test
    void calculatorDivision() {
        //Arrange
        Calculator testCalculator = new Calculator();

        //Act
        double result = testCalculator.calculator(6,'/',3);

        //Assert
        assertEquals(result, 2);

    }
}*/