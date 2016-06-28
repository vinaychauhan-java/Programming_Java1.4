package com.java.vinay.superCalling;

class Superclass {
    int x, y;
    public Superclass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

public class Subclass extends Superclass {
	int y;
    public Subclass(int x, int y) {
        super(x, y);            //call superclass constructor
    }

    public void printMethod() { //overrides printMethod in Superclass
        super.printMethod();
        System.out.println("Printed in Subclass");
        System.out.println("x value is "+x);
        System.out.println("y value is "+super.y);
        System.out.println("y value is "+this.y);
    }
    public static void main(String[] args) {
    	
        Subclass s = new Subclass(9, 8);
        s.printMethod();
    }

}