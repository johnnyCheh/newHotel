package uniay;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {


        private static void resultDisplay() {
            String curr = readCurrency();
            String language = readLanguage();
            Double amount = readAmount();
            String COUNTRY1 = "null";
            Locale locale = new Locale(language, COUNTRY1);
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            Currency currency = Currency.getInstance(curr);
            numberFormat.setCurrency(currency);
            System.out.print("Result Format:");
            System.out.println(numberFormat.format(amount));
        }

    private static String readCurrency() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Currency
        System.out.println("Enter Currency:");
        return scanner.nextLine().toUpperCase();
    }

    private static String readCountry() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Country
        System.out.println("Enter Country:");
        return scanner.nextLine().toUpperCase();
    }

    private static String readLanguage() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Language
        System.out.println("Enter Language:");
        return scanner.nextLine().toLowerCase();
    }

    private static Double readAmount() {
//        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Amount
        System.out.println("Enter Amount:");
        return Double.valueOf("999999999.00");
    }

/*
    public static void main(String[] args) {
        Locale list[] = NumberFormat.getAvailableLocales();
        for (Locale aLocale : list) {
            System.out.println(aLocale.toString() + " " + aLocale.getDisplayName());
        }
        System.out.println();
        CurrencyFormat.resultDisplay();
    }
*/

    private static void displayCurrencyFormat () {
        Double amount = 213123123123123.00;
        String currency = "EUR";
        String result;
        switch (currency) {
            case  ("USD"):
                result = MessageFormat.format("${0,number,#,##0.00}",amount);
                break;
            case ("EUR"):
                result = MessageFormat.format("{0,number,#,##0.00} €",amount);
                break;
            case ("NOK"):
                result = MessageFormat.format("kr {0,number,#,##0.00}",amount);
                break;
            default:
                result = MessageFormat.format("{0,number,#,##0.00} {1}",amount,currency);
                break;
        }
        System.out.println(result);
    }
public static void main(String[] args) {
    Locale locale = new Locale("de", "SE");
        Locale.setDefault(locale);
    System.out.println(Locale.getDefault().getCountry());
//    while (true) {
        displayCurrencyFormat();
//    }

}

}
