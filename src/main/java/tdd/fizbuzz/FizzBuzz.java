package tdd.fizbuzz;

public class FizzBuzz {
    public String fizzBuzz(int number) {

        StringBuilder sb = new StringBuilder();

        if (number == 0) {
            return sb.toString();
        }

        if (number%3 == 0) {
            sb.append("Fizz");
        }

        if (number%5 == 0) {
            sb.append("Buzz");
        }

        return sb.toString();
    }
}