public class Strings {

    public static void main(String[] args) {
        // concate
        String name1 = "Rahul";
        String name2 = "Sanchit";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        //Char at

        String name = "Rahul";
        System.out.println(name.charAt(4));
        
        // Replace

        String nav = "Rahul";
        String nav2 = name.replace("R", "U");
        System.out.println(nav2);

        //substring

        String bank = "ICICI and HDFC";
        System.out.println(bank.substring(0, 6));
    }
    
}
