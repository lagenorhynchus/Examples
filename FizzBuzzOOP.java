class FizzBuzzer {
  private int n;

  public FizzBuzzer(int n) {
    this.n = n;
  }

  public void say(int t) {
    for (int i = 0; i < t; i++) {
      System.out.println(fizzBuzz());
      n++;
    }
  }

  private String fizzBuzz() {
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
}

public class FizzBuzzOOP {
  public static void main(String[] args) {
    FizzBuzzer fb = new FizzBuzzer(1);
    fb.say(30);
  }
}
