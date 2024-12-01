package org.ruchira;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("In Laptop Constructor");
    }

    public void compile() {
        System.out.println("Compiling in laptop");
    }
}
