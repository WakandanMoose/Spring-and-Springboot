package com.ruchira.myApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// @Primary - prioritizes this class above other in instance of multiple bean streams or is of same type (the superclass is considered as a type)
public class Laptop implements Computer{


    public void compile() {
        System.out.println("Compiling with 404 bugs");
    }
}
// qualifier is like passing the abj ref to the class?>