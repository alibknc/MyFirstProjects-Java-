package moneyexchange;

import java.util.Scanner;

/**
 *
 * @author alibknc
 */
public class MoneyExchange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount, banknote;

        System.out.println("-------------------");
        System.out.println("Please enter an amount: ");
        amount = sc.nextInt();

        banknote = amount / 200;
        amount = amount % 200;
        banknote = banknote + (amount / 100);
        amount = amount % 100;
        banknote = banknote + (amount / 50);
        amount = amount % 50;
        banknote = banknote + (amount / 20);
        amount = amount % 20;
        banknote = banknote + (amount / 10);
        amount = amount % 10;
        banknote = banknote + (amount / 5);
        amount = amount % 5;
        System.out.println(banknote + " banknote " + amount + " coin");

    }

}
