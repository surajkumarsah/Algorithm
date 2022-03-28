package HackerRank;

public class StrongPassword {

    public static void main(String[] args){

        int n = 4; String password = "9876";

        String specialChar = "!@#$%^&*()-+";
        String digit = "0123456789";
        String lc = "abcdefghijklmnopqrstuvwxyz";
        String uc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int l = 6, reqdigit = 0, lcl=0, ucl=0, scl=0, dl=0;

//        if(l>n){
//            reqdigit = l-n;
//        }

        StringBuilder sb = new StringBuilder(password);

        for(int i=1; i<password.length()+1; i++){
            if(lc.contains(password.subSequence(i-1, i))){
                lcl++;
            }
            if(uc.contains(password.subSequence(i-1, i))){
                ucl++;
            }
            if(specialChar.contains(password.subSequence(i-1, i))){
                scl++;
            }
            if(digit.contains(password.subSequence(i-1, i))){
                dl++;
            }
        }

        if((lcl==0 || ucl ==0 || scl ==0 || dl ==0)) {
            if (lcl < 1) {
                reqdigit++;
            }
            if (ucl < 1) {
                reqdigit++;
            }
            if (scl < 1) {
                reqdigit++;
            }
            if (dl < 1) {
                reqdigit++;
            }
        }

        if(reqdigit<(l-n)){
            reqdigit = l-n;
        }else{
            System.out.println(reqdigit);
        }

        System.out.println(reqdigit);
    }
}
