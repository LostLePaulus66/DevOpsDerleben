import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestoTest {
    @Test(groups="Test")
    public void FizzBuzzNormalNumbers() {

        Testo fb = new Testo();
        Assert.assertEquals("1", fb.convert(1));
        Assert.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {
        Testo fb = new Testo();
        Assert.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        Testo fb = new Testo();
        Assert.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        Testo fb = new Testo();
        Assert.assertEquals("Buzz", fb.convert(5));
    }
}