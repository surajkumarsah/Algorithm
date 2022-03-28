package Amazon_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class RecorderDataInLogs {
    public static void main(String[] args){
        String[] logs = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        logs = recorderLogFiles(logs);

        for(String str: logs)
            System.out.println(str);
    }

    private static final Comparator<String> COMP = (a, b) -> {
        int idA = a.indexOf(" ");
        int idB = b.indexOf(" ");
        int comp = a.substring(idA + 1).compareTo(b.substring(idB + 1));

        if(comp == 0){
            comp = a.substring(0, idA).compareTo(b.substring(0, idB));
        }
        return comp;
    };

    private static String[] recorderLogFiles(String[] logs) {
        int pivot = partition(logs, logs.length);

        if (pivot >= 0){
            Arrays.sort(logs, 0, pivot+1, COMP);
        }

        return logs;
    }

    private static int partition(String[] logs, int n) {
        int pivot = n - 1;

        for(int i=n-1; i>=0; i--){
            if(isDigit(logs[i])) {
                String tmp = logs[pivot];
                logs[pivot] = logs[i];
                logs[i] = tmp;
                pivot--;
            }
        }
        return pivot;
    }

    private static boolean isDigit(String log) {
        int i=0;
        while(log.charAt(i) != ' '){
            i++;
        }

        i++;
        return Character.isDigit(log.charAt(i));
    }
}
