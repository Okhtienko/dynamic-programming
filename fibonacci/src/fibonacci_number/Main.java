package fibonacci_number;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int number = scanner.nextInt();

    System.out.println(fibonacci(number));
  }

  public static int fibonacci(final int number) {
    if (number < 2) {
      return number;
    }

    int[] fibonacci = new int[number + 1];
    fibonacci[0] = 0;
    fibonacci[1] = 1;

    for (int i = 2; i <= number; i++) {
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    return fibonacci[number];
  }

}
