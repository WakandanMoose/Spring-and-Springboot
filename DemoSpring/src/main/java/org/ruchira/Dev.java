package org.ruchira;

public class Dev {
    private Computer comp;
//    private int age;

    public Dev () {
        System.out.println("In Dev Constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//        System.out.println("In Parametrized Dec Constructor");
//    }

//    public Dev(Computer comp) {
//        this.comp = comp;
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        System.out.println("Working on Awesome Project");
        comp.compile();
    }
}
