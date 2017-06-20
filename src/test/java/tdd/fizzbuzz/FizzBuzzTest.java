package tdd.fizzbuzz;

import org.junit.Test;
import tdd.fizbuzz.FizzBuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnEmptyStringForZero() {
        //given
        int number = 0;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnEmptyStringForNegativeValue() {
        //given
        int number = -1;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnFizz() {
        //given
        int number = 3;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        assertEquals(FIZZ, result);
    }

    @Test
    public void shouldReturnBuzz() {
        //given
        int number = 5;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        assertEquals(BUZZ, result);
    }

    @Test
    public void shouldReturnFizzBuzz() {
        //given
        int number = 15;

        //when
        String result = fizzBuzz.fizzBuzz(number);

        //then
        assertEquals(FIZZ_BUZZ, result);
    }
}
