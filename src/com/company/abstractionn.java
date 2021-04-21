package com.company;



abstract class base11{

    public void a(){
        System.out.println("A");
    }
    public abstract void greet();
}

class chils extends base11{
    @Override
    public void greet() {

        System.out.println("good morning");
    }
}
public class abstractionn {
    public static void main(String[] args) {
    chils c= new chils();
//    c.a();
//    c.greet();
        base11 b=new chils();
        b.a();
        b.greet();
    }
}
