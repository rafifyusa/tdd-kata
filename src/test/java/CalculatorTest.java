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
	
	@Test
	public void sumOfTwoNumbers() {
		Calculator c = new Calculator();

		Assert.assertEquals(3, c.add("1,2"));
	}
	
	@Test
	public void differentSumOfTwoNumbers() {
		Calculator c = new Calculator();

		Assert.assertEquals(7, c.add("3,4"));
	}

	@Test
	public void unknownAmountOfNumbers() {
		Calculator c = new Calculator();

		Assert.assertEquals(19, c.add("3,4,5,7"));
	}

	@Test
	public void newLineBetweenNumber() {
		Calculator c = new Calculator();

		Assert.assertEquals(6, c.add("1\n2,3"));
	}
}
