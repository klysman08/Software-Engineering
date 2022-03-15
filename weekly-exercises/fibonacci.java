class Fibonacci {
  private int first_number;
  private int second_number;

  public Fibonacci (int first_number, int second_number) {
    this.first_number = first_number;
    this.second_number = second_number;
  }


  public int next(){
    int next = this.first_number + this.second_number;
    return next;
  }

  public static void main(String[] args) {
    int a1 = 1;
    int a2 = 2;

    Fibonacci fibonacci = new Fibonacci(a1, a2);
    System.out.println(fibonacci.next());
  }
}
