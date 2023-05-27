package house_robber;

public class Main {
  public static void main(String[] args) {
    final int[] number = new int[]{2, 7, 9, 3, 1};
    System.out.println(getMaximumAmountOfMoney(number));
  }

  public static int getMaximumAmountOfMoney(final int[] number) {
    int[] amountOfMoney = new int[number.length + 2];

    for (int i = 0; i < number.length; i++) {
      int maximum = Math.max(number[i] + amountOfMoney[i], amountOfMoney[i + 1]);
      amountOfMoney[i + 2] = maximum;
    }

    return amountOfMoney[amountOfMoney.length - 1];

  }

}
