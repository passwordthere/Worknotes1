package org.xvcheng;

class Dog {
    Dog() {
        System.out.println("god is dog");
    }
    Dog(String a) {
        System.out.println("String Constructor" + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog[] dog = new Dog[]{
                new Dog("god"),
                new Dog(),
                new Dog(),
        };
    }