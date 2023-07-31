public class Demo6taskd {
    public static void main(String[] args) {
        String title = "\033[37;1m";
        String green = "\033[32m";
        String purple = "\033[35m";
        String yellow ="\033[33m";
        String blue = "\033[34m"; 
        String r = "\033[0m";
                
        String fruit1 = "Apple";
        String fruit2 = "Oranges";
        
        int quantity1 = 5;
        int quantity2 = 10;

        double price1 = 0.99;
        double price2 = 1.49;
      
        
        String formattedPrice1 = String.format(green + "$" +purple+"%.2f" + r, price1);
        String formattedPrice2 = String.format(green + "$" +purple+"%.2f" + r, price2);

    

        System.out.printf("%s+---------------+----------------+--------------+%n",yellow);
        System.out.printf("| %sITEM%s%s\t\t| %sQUANTITY%s%s\t | %sPRICE%s%s \t|%n",title,r,yellow,title,r,yellow,title,r,yellow);
        System.out.printf("+%s---------------%s+----------------+%s--------------%s+%n",green,yellow,green, yellow);
        System.out.printf("| %s%s\t\t%s|\t\t%s%s%s|%s %s\t%s|%n",r,fruit1,yellow,r,quantity1,yellow,r,formattedPrice1,yellow);
        System.out.printf("| %s%s\t%s|\t\t\b%s%s%s| %s%s\t%s|%n",r,fruit2,yellow,r,quantity2,yellow,r,formattedPrice2,yellow);
        System.out.printf("+%s---------------%s+----------------+%s--------------%s+%s%n",green,yellow,green, yellow,r);
       
        
    }
}
