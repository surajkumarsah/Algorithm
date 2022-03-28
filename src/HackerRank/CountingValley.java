package HackerRank;

public class CountingValley {

    public static void main(String[] args){

        String path = "DDUUDDUDUUUD";
        int sum = 0, hd=0, hu=0, lhd=0, lhu=0;


        if(path.charAt(0) == 'U'){
            hu++;
        }else{
            hd++;
        }

        for(int i=0; i<path.length(); i++){

            if(path.charAt(i) == 'U'){
                lhd =0;;
                lhu++;
            }else{
                lhu = 0;;
                lhd++;

            }

            if(lhu > hu){
                hu = lhu;
            }
            else if(lhd > hd){
                hd = lhd;
            }
        }
        int key = hu-hd;
        if(key>0)
            System.out.println(key);
        else
            System.out.println(-1*key);


    }
}
