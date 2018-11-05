import com.mitrais.tdd.kata.Sequence;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SequesnceTest {

	@Test
	public void testEqualsValueOfSequence() {
		String input = "";

		Sequence sequence = new Sequence();
		int[] numbers= {6, 9, 15, -2, 92, 11};
		sequence.addElement(numbers);
		assertArrayEquals(new int[] {6, 9, 15, -2, 92, 11}, sequence.getElement());
	}

	@Test
	public void testMinimumValueOfSequence() {
		Sequence sequence = new Sequence();
		int[] numbers= {6, 9, 15, -2, 92, 11};
		sequence.addElement(numbers);
		assertEquals(-2, sequence.getMinimumValue());
	}

}
