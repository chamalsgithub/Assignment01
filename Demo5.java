public class Demo5 {
    public static void main(String[] args) {
        int block1 = 978;
        int block2 = 3;
        int block3 = 16;
        int block4 = 1484100;

        String c1 = "\033[31m";    
        String c2 = "\033[32m";    
        String c3 = "\033[33m";    
        String c4 = "\033[34m";    
        String r = "\033[0m";    

        System.out.printf("%s%03d%s-%s%d%s-%s%d%s-%s%d%s%n",
                c1, block1,r,c2, block2,r, c3, block3,r, c4, block4, r);
    }
}
