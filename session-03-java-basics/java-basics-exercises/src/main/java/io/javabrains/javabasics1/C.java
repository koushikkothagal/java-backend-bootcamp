package io.javabrains.javabasics1;

import io.javabrains.javabasics.A;

class C {
    public void accessVars(){
        A a =  new A();
//        System.out.println("a.privateVar = " + a.privateVar); // can't perform this since it is private var
//        System.out.println("a.var = " + a.var); // can access in different package;
//        System.out.println("a.protectedVar = " + a.protectedVar); // can't access in different package
        System.out.println("a.publicVar = " + a.publicVar);
    }
    public static void main(String[] args) {
        C b = new C();
        b.accessVars();
    }
}