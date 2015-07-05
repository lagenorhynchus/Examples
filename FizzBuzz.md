Fizz Buzz
=========

#### ■ コンソールイメージ
```console
$ javac -encoding utf-8 FizzBuzzPP.java
$ java FizzBuzzPP
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
Fizz Buzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
Fizz Buzz
$
```

#### ■ PP (procedural programmming; 手続き型プログラミング)
```java
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
```

#### ■ OOP (object-oriented programmming; オブジェクト指向プログラミング)
```java
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
```

#### ■ FP (functional programmming; 関数型プログラミング)
```java
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
```
