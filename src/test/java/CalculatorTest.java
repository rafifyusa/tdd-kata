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
}
