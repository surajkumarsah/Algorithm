package HackerRank;

public class TwoCharacter {

    public static void main(String[] args){
        String str = "beabeefeab";
        String str1 = str;
        String res = " ";
        StringBuilder dsb = new StringBuilder();

        String dstr = stringCheck(str, dsb);

        System.out.println(dstr);

    }

    private static String stringCheck(String str, StringBuilder dsb) {
        String dres = " ";
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                dsb.append(str.charAt(i));
                stringDelete(str.charAt(i), str);
            }
        }
        return dsb.toString();
    }

    private static void stringDelete(char dstr, String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            if(dstr == sb.toString().charAt(i)){
                sb.delete(i, i+1);
            }
        }
        stringCheck(str, sb);
    }
}
