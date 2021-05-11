package uniay;

import uniay.receipt.Logic;

import java.util.Scanner;

public class ReceiptMode {
    public void outDisplay() {
        Object[] finalResult = readReceiptData();
        System.out.println("\nScreen Display: " + finalResult[0]);
        System.out.println("Warning: " + finalResult[1]);
        System.out.println("Merchant Copy confirm: " + finalResult[2]);
    }


    private static Object[] readReceiptData() {
        Scanner scanner = new Scanner(System.in);
        //Зчитуємо receiptPolicy
        System.out.println("Receipt Policy:");
        String receiptPolicy = scanner.nextLine().toUpperCase();

        //Зчитуємо receiptMode
        System.out.println("receiptMode:");
        String receiptModeString = scanner.nextLine().toUpperCase();
        char receiptMode;
        if (receiptModeString.length() == 1) {
            receiptMode = receiptModeString.charAt(0);
        } else {
            receiptMode = 'Z';
        }
        //Зчитуємо printAbility - можливість друкувати
        System.out.println("Print ability:");
        String printAbilityString = scanner.nextLine();
        boolean printAbility = Boolean.parseBoolean(printAbilityString);

        // put all results in Array
        Logic receiptLogic = new Logic();
        Object[] finalResult = new Object[3];
        finalResult[0] = receiptLogic.resultScreen(receiptPolicy, receiptMode, printAbility);
        finalResult[1] = receiptLogic.resultWarning(receiptPolicy, receiptMode, printAbility);
        finalResult[2] = receiptLogic.resultMerchantCopy(receiptPolicy, receiptMode, printAbility);
        return finalResult;
    }

    public static void main(String[] args) {
                ReceiptMode receiptMode = new ReceiptMode();
                receiptMode.outDisplay();
    }
}
