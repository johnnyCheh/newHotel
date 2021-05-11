package uniay.receipt;

public class ManagedMode {

    public char managedPrintingResult(char modeValue, boolean printAbility){
        if (!(modeValue =='T')) {
            return modeValue;
        }
        if (printAbility) {
            return 'T';
        }
            return 'W';
    }
}
