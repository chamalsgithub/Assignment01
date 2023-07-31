public class Demo3 {
    public static void main(String[] args) {
        int part1 = 123;
        int part2 = 456;
        int part3 = 7890;

        String c = "\u001B[31m"; 
        String r = "\u001B[0m";   

        System.out.printf("%s(%d)%s %d-%d%n", c, part1, r, part2, part3);
    }

}
