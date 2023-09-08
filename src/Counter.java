package src;

public class Counter {
  private int currentValue;
  Counter() {
    this.currentValue = 0;
  }
  Counter(int initialValue) {
    this.currentValue = initialValue;
  }

  void AddOne() {
    this.currentValue++;
  }

  int getCurrentCounter() {
    return this.currentValue;
  }
}
