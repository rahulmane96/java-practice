class Pen {   // by default class name start with captical letters

    String colour;
    String type;



    public void write() {

        System.out.println("write somthing");

    }

    public void printcolour() {

        System.out.println(this.colour);
    }


    public static void main(String[] args) {
        
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "black";
        pen2.type = "ballpoint";

        pen1.printcolour();
        pen2.printcolour();


    }


}

// functions which we define in class called as methods
    

    
 
    

