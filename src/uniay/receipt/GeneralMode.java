package uniay.receipt;

public class GeneralMode extends Policy {

    public  String generalResult(String receiptPolicy, boolean printAbility){
        char[] policyArray = policyArray(receiptPolicy);
        String result="";
        if ((policyArray[1]=='T' && printAbility) || policyArray[2]=='G'){
            if (policyArray[1]=='T' && printAbility) {
                result= "        :Print\n";
            }
            if (policyArray[2]=='G') {
                result= result +"        :Email";
            }
            return "\nHow would you like your receipt\n" +
                    "        :No Receipt\n" + result;
        }
        return "W";
    }
}
