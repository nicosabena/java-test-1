package src;

class Calculator {
  public double calculate(String input) {
    if (this.esUnNumeroSolo(input)) {
      return Double.parseDouble(input);
    }

    String[] parts = input.split("\\+",2);
    String operando1_string= parts[0];
    String operando2_string= parts[1]; 

    return calculate(operando1_string) + calculate(operando2_string);

  }
  public boolean esUnNumeroSolo(String s) {
    // Brute force: try parsing
    try {
      Double.parseDouble(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    } 
  }
}


//calculate("2+3+7+8");
//-> calculate("2") + calculate("3+7+8")
//-> 2 + calculate("3+7+8")


