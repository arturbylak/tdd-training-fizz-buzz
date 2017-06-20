package tdd.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import tdd.fizbuzz.FizzBuzz;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnEmptyStringForZero() {
        //given
        int number = 0;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnEmptyStringForNegativeValue() {
        //given
        int number = -1;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnFizz() {
        //given
        int number = 3;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        String expectedResult = "Fizz";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnBuzz() {
        //given
        int number = 5;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        String expectedResult = "Buzz";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnFizzBuzz() {
        //given
        int number = 15;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        String expectedResult = "FizzBuzz";
        Assert.assertEquals(expectedResult, result);
    }
}
