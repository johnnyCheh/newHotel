package uniay.receipt;

import uniay.core.FindLetter;

public class Policy extends FindLetter{
    public static char noReceipt(String receiptPolicy) {
        return findLetter('N', receiptPolicy);
    }

    public static char terminal(String receiptPolicy) {
        return findLetter('T', receiptPolicy);
    }

    public static char gateway(String receiptPolicy) {
        return findLetter('G', receiptPolicy);
    }

    public static char pos(String receiptPolicy) {
        return findLetter('P', receiptPolicy);
    }
    public static char[] policyArray(String receiptPolicy) {
        char N = noReceipt(receiptPolicy);
        char T = terminal(receiptPolicy);
        char G = gateway(receiptPolicy);
        char P = pos(receiptPolicy);
        return new char[]{N, T, G, P};
    }
}
