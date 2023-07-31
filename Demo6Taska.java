public class Demo6Taska {
    public static void main(String[] args) {
        String fc1 = "\033[41m"; 
        String fc2 = "\033[42m";
        String r = "\033[0m"; 

        System.out.printf("%s[    5 %s0%%   ]%s%n",fc1,fc2,r);
    }
}
