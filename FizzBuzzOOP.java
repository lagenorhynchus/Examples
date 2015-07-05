public class FizzBuzzOOP {
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

  public static void main(final String[] args) {
    final FizzBuzzer fb = new FizzBuzzer(1);
    fb.say(30);
  }
}

class FizzBuzzer {
  private int n;

  public FizzBuzzer(final int n) {
    this.n = n;
  }

  public void say(final int t) {
    for (int i = 0; i < t; i++) {
      System.out.println(FizzBuzzOOP.fizzBuzz(n));
      n++;
    }
  }
}
