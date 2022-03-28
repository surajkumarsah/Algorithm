package HackerRank;

public class SuperReducedString {

    public static void main(String[] args){

        String s = "baab ";
        StringBuilder sb = new StringBuilder(s);

        for(int i=1; i<sb.length(); i++){
            if(sb.charAt(i-1) == sb.charAt(i)){
                sb.delete(i-1, i+1);
                i=0;
            }
        }


        if(sb.length() == ' '){
            System.out.println("Empty String");
        }else{
            System.out.println(sb);
        }

    }
}
