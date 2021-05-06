package org.example;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Code compiled in Desktop");
    }
}
