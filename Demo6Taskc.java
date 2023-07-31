public class Demo6Taskc {
    public static void main(String[] args) {
        String title = "\033[37;1m";
        String green = "\033[32m";
        String purple = "\033[35m";
        String yellow ="\033[33m"; 
        String r = "\033[0m";
                
        String city1 = "Los Angeles";
        String city2 = String.format("%s%s%s %s", green, "New", r, "York");
        
        String state1 = "California";
        String state2 = city2;

        int population1 = 3966936;
        int population2 = 8336817;

        String formattedPopulation1 = String.format("%s%,d%s", purple, population1, r);
        String formattedPopulation2 = String.format("%s%,d%s", purple, population2, r);

        System.out.printf("%s+---------------+---------------+---------------+%n",yellow);
        System.out.printf("| %sCITY%s%s\t\t| %sSTATE%s%s\t\t| %sPOPULATION%s%s \t|%n",title,r,yellow,title,r,yellow,title,r,yellow);
        System.out.println("+---------------+---------------+---------------+");
        System.out.printf("| %s%s\t%s| %s%s\t%s|%s %s\t%s|%n",r,city1,yellow,r,state1,yellow,r,formattedPopulation1,yellow);
        System.out.printf("| %s%s\t%s| %s%s\t%s|%s %s\t%s|%n",r,city2,yellow,r,state2,yellow,r,formattedPopulation2,yellow);
        System.out.println("+---------------+---------------+---------------+");
       
        
        
    }
}
