import entities.Account;
import entities.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.setName("personal");
        System.out.println(account.getName());
        System.out.println(account.getBalance());

        var dollarPrice = 3.10;
        var dollarsWillBeBought = 200;

        System.out.println("Amount to be paid " + CurrencyConverter.calculateTotalInReal(dollarsWillBeBought, dollarPrice));
    }
}
