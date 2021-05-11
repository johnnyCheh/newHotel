package uniay.receipt;

public class Logic extends OperationMode {

    public String resultScreen(String receiptPolicy, char receiptMode, Boolean printAbility) {
        String receiptOperationMode = receiptOperationMode(receiptPolicy, receiptMode);
        if (receiptOperationMode.equals("Managed")) {
            ManagedMode modeManaged = new ManagedMode();
            char res = modeManaged.managedPrintingResult(receiptMode, printAbility);
            if (!(res == 'W')) {
                return "no screen (result=" + res + ")";
            } else {
                receiptOperationMode = "General";
            }
        }
        if (receiptOperationMode.equals("General")) {
            GeneralMode generalMode = new GeneralMode();
            String res = generalMode.generalResult(receiptPolicy, printAbility);
            if (res.equals("W")) {
                return "no screen";
            }
            return res;
        }
        return "Exception";
    }

    public Boolean resultWarning(String receiptPolicy, char receiptMode, Boolean printAbility) {
        String receiptOperationMode = receiptOperationMode(receiptPolicy, receiptMode);
        if (receiptOperationMode.equals("Managed")) {
            ManagedMode modeManaged = new ManagedMode();
            char result = modeManaged.managedPrintingResult(receiptMode, printAbility);
            if (result == 'W') {
                return true;
            }
            if (result == 'T') {
                return false;
            }
        }
        if (receiptOperationMode.equals("General")) {
            GeneralMode generalMode = new GeneralMode();
            String result = generalMode.generalResult(receiptPolicy, printAbility);
            return result.equals("W");
        }
        return false;
    }
    public Boolean resultMerchantCopy(String receiptPolicy, char receiptMode, Boolean printAbility) {
        return (terminal(receiptPolicy) == 'T' && printAbility && !(receiptMode == 'P'));
    }
}
