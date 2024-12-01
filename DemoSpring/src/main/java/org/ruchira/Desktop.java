package org.ruchira;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("In Desktop Constructor");
    }

    public void compile() {
        System.out.println("Compiling in desktop");
    }
}
