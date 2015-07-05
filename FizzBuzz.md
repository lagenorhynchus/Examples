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
// Java

public class FizzBuzzPP {
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
    for (int n = 1; n <= 30; n++) {
      System.out.println(fizzBuzz(n));
    }
  }
}
```

#### ■ OOP (object-oriented programmming; オブジェクト指向プログラミング)
```java
// Java

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
```

#### ■ FP (functional programmming; 関数型プログラミング)
```java
// Java

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

  public static void main(final String[] args) {
    IntStream.rangeClosed(1, 30)
      .mapToObj(FizzBuzzFP::fizzBuzz)
      .forEach(System.out::println);
  }
}
```

```scala
// Scala

object FizzBuzzFP {
  def main(args: Array[String]): Unit = {
    (1 to 30).map(fizzBuzz).foreach(println)
  }

  def fizzBuzz(n: Int): String = {
    val isDivisibleBy3 = n % 3 == 0
    val isDivisibleBy5 = n % 5 == 0
    if (isDivisibleBy3 && isDivisibleBy5) {
      "Fizz Buzz"
    } else if (isDivisibleBy3) {
      "Fizz"
    } else if (isDivisibleBy5) {
      "Buzz"
    } else {
      n.toString
    }
  }
}
```

```clojure
;; Clojure

(defn fizzBuzz [n]
  (let [divisible-by-3 (zero? (mod n 3))
        divisible-by-5 (zero? (mod n 5))]
    (cond
      (and divisible-by-3
           divisible-by-5) "Fizz Buzz"
      divisible-by-3       "Fizz"
      divisible-by-5       "Buzz"
      :else                (str n))))

;; pattern 1
(doall (map (comp println fizzBuzz) (range 1 (inc 30))))

;; pattern 2
(->> (range 1 (inc 30))
     (map (comp println fizzBuzz))
     doall)
```

```haskell
-- Haskell

fizzBuzz :: Int -> String
fizzBuzz n
  | isDivisibleBy3 && isDivisibleBy5 = "Fizz Buzz"
  | isDivisibleBy3                   = "Fizz"
  | isDivisibleBy5                   = "Buzz"
  | otherwise                        = show n
  where
    isDivisibleBy3 = n `mod` 3 == 0
    isDivisibleBy5 = n `mod` 5 == 0

main :: IO ()
main = mapM_ (print . fizzBuzz) [1..30]
```
