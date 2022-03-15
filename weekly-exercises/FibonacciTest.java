import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;


@Test
class FibonacciTest {
  public void testNext() throws Exception {
    Fibonacci fibonacci = new Fibonacci(0,1);
    int result = fibonacci.next();
    int expected = 1;

    assertTrue(expected.equals(result));
  }
}
