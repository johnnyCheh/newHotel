package uniay.receipt;


public class OperationMode extends Policy {
    public static String receiptOperationMode (String receiptPolicy,char receiptMode) {
        boolean equalModePolicy=false;
        for (char value : policyArray(receiptPolicy)) {
            if (value == receiptMode) {
                equalModePolicy = true;
                break;
            }
        }
        if (equalModePolicy) {
            return "Managed";
        }else {
            return "General";
        }

    }





}
