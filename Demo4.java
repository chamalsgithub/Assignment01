public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String c1 = "\033[31m";    
        String c2=  "\033[32m";  
        String c3 = "\033[33m";   
        String c4 = "\033[34m";   
        String c5 = "\033[35m"; 
        String c6 = "\033[36m"; 
        
        System.out.printf("%s%02d%s / %s%02d%s / %s%04d%s %s%02d%s : %s%02d %s:%s%02d%s%n",
                c1, month,c1, 
                c2, day, c2, 
                c3, year,c3,

                c4, hour, c4,
                c5, minute, c5,
                c6, second,c6);
    }
}
