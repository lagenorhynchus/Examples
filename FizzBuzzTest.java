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
    assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
    assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    assertThat(FizzBuzz.fizzBuzz(9), is("Fizz"));
  }

  @Test
  public void 数が5の倍数のときBuzz() {
    assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
    assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    assertThat(FizzBuzz.fizzBuzz(20), is("Buzz"));
  }

  @Test
  public void 数が15の倍数のときFizzBuzz() {
    assertThat(FizzBuzz.fizzBuzz(15), is("Fizz Buzz"));
    assertThat(FizzBuzz.fizzBuzz(30), is("Fizz Buzz"));
    assertThat(FizzBuzz.fizzBuzz(45), is("Fizz Buzz"));
  }

  @Test
  public void その他の数のときその数字() {
    assertThat(FizzBuzz.fizzBuzz(1), is("1"));
    assertThat(FizzBuzz.fizzBuzz(2), is("2"));
    assertThat(FizzBuzz.fizzBuzz(4), is("4"));
    assertThat(FizzBuzz.fizzBuzz(7), is("7"));
    assertThat(FizzBuzz.fizzBuzz(14), is("14"));
    assertThat(FizzBuzz.fizzBuzz(16), is("16"));
  }

  @Test
  public void 数が1未満のときIllegalArgumentException() {
    expectedException.expect(IllegalArgumentException.class);
    expectedException.expectMessage("n cannot be less than 1");
    FizzBuzz.fizzBuzz(0);
  }
}
