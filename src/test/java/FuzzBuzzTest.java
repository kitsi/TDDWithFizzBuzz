import org.junit.Assert;
import org.junit.Test;

public class FuzzBuzzTest {
    @Test
    public void whenNumbersAreDivisibleBy3(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Fizz", fizzBuzz.fizz(3));
        Assert.assertNotEquals("Fizz", fizzBuzz.fizz(2));
    }

    @Test
    public void whenNumbersAreDivisibleBy5(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Buzz", fizzBuzz.buzz(5));
        Assert.assertNotEquals("Buzz", fizzBuzz.buzz(2));
    }

    @Test
    public void whenNumbersAreDivisibleBy3and5(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        Assert.assertNotEquals("FizzBuzz", fizzBuzz.fizzBuzz(2));
    }
}
