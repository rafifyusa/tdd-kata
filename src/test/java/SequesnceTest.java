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
		sequence.addElement(1);
		assertEquals(1, sequence.getElement()));
	}

}
