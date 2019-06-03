import java.util.ArrayList;

public class DecryptHexMessage {
    public static void main(String[] args){
        String aw = "uyzrr0x5206abc0xBBD288tthhgj0xa8ad4poqwqr";
        int stringlength = aw.length();
        String ja = "";
        int o = 0;
        String arran = "";
        String arrans = "";
        String arranse = "";
        int[] nmrs = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0 ; i < stringlength; i++){
            char s = aw.charAt(i);
            String f = Character.toString(s);
            switch (Character.toString(s)) {
                case "0": case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "x": case "a": case "b": case "c": case "d": case "e": case "f": case "A": case "B": case "C": case "D": case "E": case "F":
            ja += s;
            break;
            }
        }
        ArrayList<String> ar = new ArrayList<String>();
        String[] arrSplit = ja.split("0x");
        for (int x=1; x < arrSplit.length; x++)
        {
            ar.add("0x" +arrSplit[x]);
        }
        String[] arrSplits = ar.toString().split(",");
        arrSplits = arrSplits.toString().split("]");
        




    }
}
