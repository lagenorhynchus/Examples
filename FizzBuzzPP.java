public class FizzBuzzPP {
  public static void fizzBuzz(int max) {
    for (int n = 1; n <= max; n++) {
      boolean isDivisibleBy3 = n % 3 == 0;
      boolean isDivisibleBy5 = n % 5 == 0;

      String result;
      if (isDivisibleBy3 && isDivisibleBy5) {
        result = "Fizz Buzz";
      } else if (isDivisibleBy3) {
        result = "Fizz";
      } else if (isDivisibleBy5) {
        result = "Buzz";
      } else {
        result = String.valueOf(n);
      }

      System.out.println(result);
    }
  }

  public static void main(String[] args) {
    fizzBuzz(30);
  }
}
