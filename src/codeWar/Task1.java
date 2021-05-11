package codeWar;

public class Task1 {
    public static String solution (String str){
        int i;
        String result;
        char[] arr;
        arr = str.toCharArray();
        int length = str.length();
        char[] resultArr = new char[length];
        for (i = 0; i < length; i++) {
            resultArr[i] = arr[length-i-1];
        }
        result = String.copyValueOf(resultArr);
        return result;
    }
}

    class DescendingOrderF {
    public static int sortDesc(final int num) {
        //Your code
        String result =num+"";
        return num;
    }
}
