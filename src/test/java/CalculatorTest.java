import org.junit.Assert;
import org.junit.Before;

import com.mitrais.tdd.kata.Calculator;

public class CalculatorTest {

	@Before
	public void setUp() {
		Calculator calc = new Calculator();
	}
	
	@Test
	public void addNumber() {
		Calculator calc = new Calculator();
		
		Assert.assertEquals("Zero Value",calc.setNum(""));
	}
}
