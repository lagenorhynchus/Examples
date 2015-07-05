public class FizzBuzzPP {
  public static String fizzBuzz(int n) {
    boolean isDivisibleBy3 = n % 3 == 0;
    boolean isDivisibleBy5 = n % 5 == 0;
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
    for (int n = 1; n <= 30; n++) {
      System.out.println(fizzBuzz(n));
    }
  }
}
