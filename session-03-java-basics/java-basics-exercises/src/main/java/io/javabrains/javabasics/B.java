package io.javabrains.javabasics;

class B {
    public void accessVars(){
        A a =  new A();
//        System.out.println("a.privateVar = " + a.privateVar); // can't perform this since it is private var
        System.out.println("a.var = " + a.var);
        System.out.println("a.protectedVar = " + a.protectedVar);
        System.out.println("a.publicVar = " + a.publicVar);
    }
    public static void main(String[] args) {
        B b = new B();
        b.accessVars();
    }
}


