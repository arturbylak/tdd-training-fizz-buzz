package tdd.fizzbuzz;

public class FizzBuzz {

    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";

    public String fizzBuzz(int number) {

        StringBuilder sb = new StringBuilder();

        if (number == 0) {
            return sb.toString();
        }

        if (number %3 == 0) {
            sb.append(FIZZ);
        }

        if (number %5 == 0) {
            sb.append(BUZZ);
        }

        return sb.toString();
    }
}