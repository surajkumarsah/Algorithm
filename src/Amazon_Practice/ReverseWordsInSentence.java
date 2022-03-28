package Amazon_Practice;

//Reverse the words in the sentenses.

//Done

public class ReverseWordsInSentence {

    public static void reverseWordsInSent(String sentence){
        String[] strSplit = sentence.split(" ");
        StringBuilder outputStr = new StringBuilder();

        for(String stringIte: strSplit){
                StringBuilder str = new StringBuilder(stringIte);
                str.reverse();
                outputStr.append(str + " ");
        }

        System.out.println(outputStr);
    }

    public static void main(String[] args) {
        String sent = "Hi there , How is it going ?";

        reverseWordsInSent(sent);
    }
}
