import com.mitrais.tdd.kata.Calculator;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jchacana on 10/8/18.
 */
public class CalculatorTest {

    @Test
    public void testEmptyString(){
        String input = "";

        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(input));
    }
    
    @Test
    public void testOneString() {
    	Calculator calculator = new Calculator();
    	assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testOneNumber2(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.add("2"));
    }
    
    @Test
    public void testTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add("1,2"));
    }
    
    @Test
    public void testUnknownNumbers() {
    	Calculator calc = new Calculator();
    	assertEquals(4, calc.add("1,1,1,1"));
    }
    
    @Test
    public void testUnknownNumbers2() {
    	Calculator calc = new Calculator();
    	assertEquals(1700, calc.add("200,200,300,500,500"));
    }
    
    @Test
    public void testNewLine () {
    	Calculator calc = new Calculator();
    	assertEquals(6, calc.add("1\n2,3"));
    	
    }
    
    @Test
    public void testNewLine2 () {
    	Calculator calc = new Calculator();
    	assertEquals(6, calc.add("1,2\n3"));
    	
    }
    
    @Test
    public void testDelimiter() {
    	Calculator calc = new Calculator();
    	assertEquals(3, calc.add("//;\n1;2"));
    }
    
}
