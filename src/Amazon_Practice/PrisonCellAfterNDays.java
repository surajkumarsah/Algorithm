package Amazon_Practice;

//active and inactive cell after n-days...

public class PrisonCellAfterNDays {

    public static void main(String[] args) {
        boolean[] cell = {false, true, false, true, false, true, false, true};
        int k = 3;
        int l = cell.length;

        explorecells(cell, k, l);
    }

    private static void explorecells(boolean[] cell, int k, int l) {

        boolean[] temp = new boolean[l];
        for (int i = 0; i < l; i++) {
            temp[i] = cell[i];
        }

        int active = 0, inactive = 0;

        while (k-- > 0) {
            temp[0] = false ^ cell[1];
            temp[l - 1] = false ^ cell[l - 2];

            for (int i = 1; i <= l - 2; i++) {
                temp[i] = cell[i - 1] ^ cell[i + 1];
            }

            for (int i = 0; i < l; i++) {
                cell[i] = temp[i];
            }

        }

        for(int i=0; i<l; i++)
            if(cell[i] == true)
                active++;
            else
                inactive++;

        System.out.println("Active cells: "+active + ", Inactive cells: "+inactive);


    }
}