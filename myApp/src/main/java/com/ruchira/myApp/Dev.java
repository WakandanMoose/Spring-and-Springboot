package com.ruchira.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // Spring creates the object for Dev Class to be used
public class Dev {

    // Field Injection

    // Auto wiring looks for the class type (Computer)
    @Autowired // Connects the Dev class with the Laptop class
    private Computer comp;  // hence here even though comp is an interface the laptop is also a type of comp

    // Field injection wth Qualifier
//    @Autowired
//    @Qualifier("laptop")  // the object creation will be doe for laptop class
//    // @Qualifier - used to avoid injection of multiple beans that satisfy the condition by selecting a bean that will be used
//    // this will override the @Primary annotation
//    // The bean name will be the same as the name of the class but the first character will be lowercase
//    private Computer comp;  // hence here even though comp is an interface the laptop is also a type of comp

//    // Constructor Injection - is automatic and doesn't require the @Autowired
//    public Dev (Laptop laptop) {
//        this.laptop = laptop;
//    }


    // Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    // Setter injection with Qualifier
//    @Autowired
//    @Qualifier("laptop")
//    public void setComputer(Computer comp) {
//        this.comp = comp;
//    }


//    // Constructor injection with Qualifier
//    public Dev(@Qualifier("laptop") Computer comp) {
//        this.comp = comp;
//    }

    public void build() {
        comp.compile();
        System.out.println("Working on Awesome Project");
    }
}
