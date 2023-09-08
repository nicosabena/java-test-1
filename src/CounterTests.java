package src;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CounterTests {

  @Test
  public void startingCounterIsZero() {
    Counter counter = new Counter();
    assertEquals(0, counter.getCurrentCounter());
  }

  @Test
  public void providedInitialValueSetsCounter() {
    final int initialValue = 13;
    Counter counter = new Counter(initialValue);
    assertEquals(initialValue, counter.getCurrentCounter());
  }

  @Test
  public void addOneIncrementsCounter() {
    final int initialValue = 13;
    Counter counter = new Counter(initialValue);
    counter.AddOne();
    assertEquals(initialValue + 1, counter.getCurrentCounter());
  }
}
