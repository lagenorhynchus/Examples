import java.util.stream.IntStream;

public class FizzBuzzFP {
  public static String fizzBuzz(final int n) {
    final boolean isDivisibleBy3 = n % 3 == 0;
    final boolean isDivisibleBy5 = n % 5 == 0;
    if (isDivisibleBy3 && isDivisibleBy5) {
      return "Fizz Buzz";
    } else if (isDivisibleBy3) {
      return "Fizz";
    } else if (isDivisibleBy5) {
      return "Buzz";
    } else {
      return String.valueOf(n);
    }
  }

  public static void main(String[] args) {
    IntStream.rangeClosed(1, 30)
      .mapToObj(FizzBuzzFP::fizzBuzz)
      .forEach(System.out::println);
  }
}
