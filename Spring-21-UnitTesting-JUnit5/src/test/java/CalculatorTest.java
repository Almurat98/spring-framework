import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUpEach(){
        System.out.println("before executing");
    }
    @Test
    void testCase1(){
        fail("Not Implemented yest");
    }
    @Test
    void testCase12(){
        assertTrue(Calculator.operator.equals("add"));
    }
    @Test
    void testCase123(){
        assertArrayEquals(new int[]{1,2,3},new int[]{2,1,3});
    }
    @Test
    void testCase1234(){
        assertThrows(IllegalArgumentException.class, () -> Calculator.add(5,2));
    }
    @Test
    void testCase12345(){}

    @Test
    void  add(){
        int actual = Calculator.add(2,4);
        assertEquals(6,actual,"Result dont match");
    }

}