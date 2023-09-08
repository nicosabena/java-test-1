package src;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  final double DELTA = 0.00001;

  @Test
  public void parsesSimpleNumber() {
    Calculator calc = new Calculator();
    double result = calc.calculate("23");
    assertEquals(23d, result, DELTA);
  }

  @Test
  public void parsesAddition() {
    Calculator calc = new Calculator();
    double result = calc.calculate("23+15");
    assertEquals(38d, result, DELTA);
  }

  @Test
  public void sumaDosNumerosConEspacios() {
    Calculator calc = new Calculator();
    double result = calc.calculate(" 23 +   15  ");
    assertEquals(38d, result, DELTA);
  }

  @Test
  public void sumaMasDeDosNumeros() {
    Calculator calc = new Calculator();
    double result = calc.calculate(" 23 +15+18  ");
    assertEquals(56d, result, DELTA);
  }
}
