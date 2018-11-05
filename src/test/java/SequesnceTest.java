import com.mitrais.tdd.kata.Sequence;
import org.junit.Test;

import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SequesnceTest {

	@Test
	public void testEmptyString() {
		String input = "";

		Sequence sequence = new Sequence();
		int[] numbers= {6, 9, 15, -2, 92, 11};
		sequence.addElement(numbers);
		assertEquals({6, 9, 15, -2, 92, 11},sequence.getElement());
	}

}
