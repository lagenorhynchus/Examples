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
  public static class FizzBuzz {
    public static String fizzBuzz(final int n) {
      if (n < 1) {
        throw new IllegalArgumentException("n cannot be less than 1");
      }

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
  }

  public static void main(final String[] args) {
    for (int n = 1; n <= 30; n++) {
      System.out.println(FizzBuzz.fizzBuzz(n));
    }
  }
}
```

#### ■ OOP (object-oriented programmming; オブジェクト指向プログラミング)
```java
// Java

public class FizzBuzzOOP {
  public static class FizzBuzz {
    public static String fizzBuzz(final int n) {
      if (n < 1) {
        throw new IllegalArgumentException("n cannot be less than 1");
      }

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
      System.out.println(FizzBuzz.fizzBuzz(n));
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
  public static class FizzBuzz {
    public static String fizzBuzz(final int n) {
      if (n < 1) {
        throw new IllegalArgumentException("n cannot be less than 1");
      }

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
  }

  public static void main(final String[] args) {
    IntStream.rangeClosed(1, 30)
      .mapToObj(FizzBuzz::fizzBuzz)
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
    if (n < 1) {
      throw new IllegalArgumentException("n cannot be less than 1")
    }

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

(ns fizz-buzz-fp)

(defn fizz-buzz [n]
  (let [divisible-by-3 (zero? (mod n 3))
        divisible-by-5 (zero? (mod n 5))]
    (cond
      (< n 1)              (throw (IllegalArgumentException. "n cannot be less than 1"))
      (and divisible-by-3
           divisible-by-5) "Fizz Buzz"
      divisible-by-3       "Fizz"
      divisible-by-5       "Buzz"
      :else                (str n))))

;; pattern 1
(doall (map (comp println fizz-buzz) (range 1 (inc 30))))

;; pattern 2
(->> (range 1 (inc 30))
     (map (comp println fizz-buzz))
     doall)
```

```haskell
-- Haskell

module FizzBuzzFP where

fizzBuzz :: Int -> String
fizzBuzz n
  | n < 1                            = error "n cannot be less than 1"
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

#### ■ TDD (test-driven development; テスト駆動開発)
```java
// JUnit (Java)

package com.github.lagenorhynchus.javatest;

import static com.github.lagenorhynchus.javatest.FizzBuzz.fizzBuzz;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {
  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 数が3の倍数のときFizz() {
    assertThat(fizzBuzz(3), is("Fizz"));
    assertThat(fizzBuzz(6), is("Fizz"));
    assertThat(fizzBuzz(9), is("Fizz"));
  }

  @Test
  public void 数が5の倍数のときBuzz() {
    assertThat(fizzBuzz(5), is("Buzz"));
    assertThat(fizzBuzz(10), is("Buzz"));
    assertThat(fizzBuzz(20), is("Buzz"));
  }

  @Test
  public void 数が3の倍数かつ5の倍数のときFizzBuzz() {
    assertThat(fizzBuzz(15), is("Fizz Buzz"));
    assertThat(fizzBuzz(30), is("Fizz Buzz"));
    assertThat(fizzBuzz(45), is("Fizz Buzz"));
  }

  @Test
  public void その他の数のときその数字() {
    assertThat(fizzBuzz(1), is("1"));
    assertThat(fizzBuzz(2), is("2"));
    assertThat(fizzBuzz(4), is("4"));
    assertThat(fizzBuzz(7), is("7"));
    assertThat(fizzBuzz(14), is("14"));
    assertThat(fizzBuzz(16), is("16"));
  }

  @Test
  public void 数が1未満のときIllegalArgumentException() {
    expectedException.expect(IllegalArgumentException.class);
    expectedException.expectMessage("n cannot be less than 1");
    fizzBuzz(0);
  }
}
```

#### ■ BDD (behavior-driven development; 振る舞い駆動開発)
```groovy
// Spock (Groovy)

package com.github.lagenorhynchus.javatest

import static com.github.lagenorhynchus.javatest.FizzBuzz.fizzBuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzSpec extends Specification {
  @Unroll
  def "1以上の数に対してFizz Buzzの正しい答えが得られる"() {
    expect:
      fizzBuzz(n) == answer
    where:
      n  | answer
       1 | "1"
       2 | "2"
       3 | "Fizz"
       4 | "4"
       5 | "Buzz"
       6 | "Fizz"
       7 | "7"
       8 | "8"
       9 | "Fizz"
      10 | "Buzz"
      14 | "14"
      15 | "Fizz Buzz"
      16 | "16"
      20 | "Buzz"
      30 | "Fizz Buzz"
      45 | "Fizz Buzz"
  }

  @Unroll
  def "1未満の数に対して例外(IllegalArgumentException)が発生する"() {
    when:
      fizzBuzz(0)
    then:
      def ex = thrown(IllegalArgumentException)
      ex.getMessage() == "n cannot be less than 1"
  }
}
```
