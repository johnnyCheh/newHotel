package uniay;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

import java.util.Scanner;

public class PhoneNumber {
    private static String phoneNumberFormated (String mobile, String locale, String format) throws NumberParseException {
        PhoneNumberUtil.PhoneNumberFormat numberFormat;
        switch (format) {
            case "full":
                numberFormat = PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;
                break;
            case "short":
                numberFormat = PhoneNumberUtil.PhoneNumberFormat.NATIONAL;
                break;
            case "E164":
                numberFormat = PhoneNumberUtil.PhoneNumberFormat.E164;
                break;
            default:
                numberFormat = PhoneNumberUtil.PhoneNumberFormat.RFC3966;
                break;
        }
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        Phonenumber.PhoneNumber phoneProto = phoneUtil.parse(mobile, locale);

        return phoneUtil.format(phoneProto,numberFormat) ;
    }

    private static String readPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Country
        System.out.println("Enter Phone Number:");
        return scanner.nextLine();
    }

    private static String readLocale() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Country
        System.out.println("Enter Locale (US/CA/NO/....):");
        return scanner.nextLine().toUpperCase();
    }

    private static String readformat() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо Country
        System.out.println("Enter format (full/short):");
        return scanner.nextLine().toLowerCase();
    }

    public static void formatPhoneNumber () throws NumberParseException {
        String mobile = readPhoneNumber();
        while (true) {
            String locale = readLocale();
            System.out.println("International:" + phoneNumberFormated(mobile, locale, "full"));
            System.out.println("National:" +phoneNumberFormated(mobile, locale, "short"));
            System.out.println("E164:" +phoneNumberFormated(mobile, locale, "E164"));
            System.out.println("RFC3966:" +phoneNumberFormated(mobile, locale, "RFC3966"));
            System.out.println();
        }
    }

    public static void main(String[] args) throws NumberParseException {
        formatPhoneNumber();
    }

}
