public class Demo6Taskb {
    public static void main(String[] args) {
        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        
        String title = "\033[34;1m";
        String yellow = "\033[33m";
        String pink = "\033[35m";
        String r = "\033[0;0m";
        
        System.out.printf("%s+---------------+------+%n", yellow);
        System.out.printf("| %sNAME\t\t%s|  %sAGE%s |%n", title,yellow,title,yellow);
        System.out.println("+---------------+------+");
        System.out.printf("| %s%s\t\t%s|  %s%s%s%s  |%n", r,name1, yellow,pink,age1,r,yellow);
        System.out.printf("| %s%s\t\t%s|  %s%s%s%s  |%n", r,name2, yellow,pink,age2,r,yellow);
        System.out.println("+---------------+------+");
    }
}