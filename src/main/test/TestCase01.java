import com.mitrais.tdd.kata.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCase01 {

    @Test
    public void testBlank() {
        String input = "";
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.Add(input));
    }

}
