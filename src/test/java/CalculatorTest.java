import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mitrais.tdd.kata.Calculator;

public class CalculatorTest {

	@Before
	public void setUp() {
		Calculator calc = new Calculator();
	}
	
	@Test
	public void addNumber() {
		Calculator calc = new Calculator();
		
		Assert.assertEquals(0,calc.add(""));

	}

	@Test
	public void whenPassOneReturnOne() {
		Calculator c = new Calculator();

		Assert.assertEquals(1, c.add("1"));
	}
}
