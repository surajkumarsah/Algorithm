package HackerRank;

public class TimeConversion {

    public static String timeConversion(String s) {
//        int time = 0;
//        String[] arr = s.split(":", 3);
//        String[] a = arr[2].split("P",2);
//
//        // if(s.contains("PM")){
//        //     System.out.println("true");
//        // }
//
//        if(Integer.parseInt(arr[0]) >= 1 && Integer.parseInt(arr[0])<24){
//            time = 12 + Integer.parseInt(arr[0]);
//        }else if(Integer.parseInt(arr[0]) == 12 && s.contains("AM")){
//            return 00+":"+arr[1]+":"+a[0];
//        }else if(Integer.parseInt(arr[0]) == 12 && s.contains("PM")){
//            return 12+":"+arr[1]+":"+a[0];
//        }else{
//            return 00+":"+arr[1]+":"+a[0];
//        }
//
//        return time+":"+arr[1]+":"+a[0];

        StringBuilder sb = new StringBuilder(s);
        if (sb.toString().contains("PM")){
            String[] arr = sb.toString().split(":", 3);
            String[] a = arr[2].split("P",2);

            int time = Integer.parseInt(arr[0]);
            if(time == 12){
                return "12"+":"+arr[1]+":"+a[0];
            }
            if (time < 12){
                int t = 12+time;
                return t+":"+arr[1]+":"+a[0];
            }
        }else{
            String[] arr = sb.toString().split(":", 3);
            String[] a = arr[2].split("A",2);
            int time = Integer.parseInt(arr[0]);

            if(time == 12){
                return "00"+":"+arr[1]+":"+a[0];
            }
            return arr[0]+":"+arr[1]+":"+a[0];

        }
        return "bad Unknwn";
    }

    public static void main(String[] args){
        String str = "12:45:54PM";
        System.out.println(timeConversion(str));
    }

}
