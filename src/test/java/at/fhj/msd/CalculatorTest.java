package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void calcTestAdd() {
        Assertions.assertEquals(20.0, Calculator.add(15,5));
    }

    @Test
    public void calcTestAdd2() {
        Assertions.assertEquals(15.0+0, Calculator.add(15,0));
    }

    @Test
    public void calcTestMinus(){
        Assertions.assertEquals(10.0, Calculator.minus(15,5));
    }

    @Test
    public void calcTestMinus2(){
        Assertions.assertEquals(0.0-15.0, Calculator.minus(0,15));
    }

    @Test
    public void calcTestDivide(){
        Assertions.assertEquals(15.0/5, Calculator.divide(15,5));
    }

    @Test
    public void calcTestDivide2(){
        Assertions.assertEquals(15.0, Calculator.divide(15,1));
    }

    @Test
    public void calcTestMultiply() {
        Assertions.assertEquals(5.0*5, Calculator.multiply(5,5));
    }

    @Test
    public void calcTestMultiply2() {
        Assertions.assertEquals(2.5, Calculator.multiply(5,0.5));
    }
}
