package Dynamic_Programming;

public class Longest_Increasing_SubSequence {

    void LIS(int elements[]){
        int size = elements.length;//Array size
        int length[] = new int[size];
        int subSeq[] = new int[size];

        for (int i=0; i<size; i++){
            length[i]=1;
        }

//        System.out.println(size+ "\n");

        //Print Array
//        for (int i=0; i<size; i++){
//            System.out.println(element[i]);
//        }

        for (int i=1; i<size; i++){
            for (int j=0; j<i; j++){
                if(elements[j] < elements[i]){
                    if (length[i] < length[j]+1){
                        length[i] = length[j]+1;
                        subSeq[i] = j;
                    }
                }
            }
        }

        printLIS(elements, length, subSeq, size);
    }

    private void printLIS(int[] elements, int[] length, int[] subSeq, int size) {

        System.out.println("Elements : ");
        for(int i=0; i<size; i++){
            System.out.print(elements[i] +"\t");
        }

        System.out.println("\nLength : ");
        for(int i=0; i<size; i++){
            System.out.print(length[i] +"\t");
        }

        System.out.println("\nSubSeq : ");
        for(int i=0; i<size; i++){
            System.out.print(subSeq[i] +"\t");
        }
    }

    public static void main(String []args){
        Longest_Increasing_SubSequence lis = new Longest_Increasing_SubSequence();

        int element[] = new int[]{
                0,4,12,2,10,6,9,13,3,11,7,15
        };
        lis.LIS(element);

    }
}
