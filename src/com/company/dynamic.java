package com.company;


class  phone {
     phone() {
        System.out.println("phone cunstructure");
    }

    public void on() {
        System.out.println("phone on ");
    }
    public void omg(){
        System.out.println("phone omg");
    }
}

    class  smartphone extends phone{
        smartphone(){
            System.out.println("smartphone cunstructure");
        }
        public void on(){
            System.out.println("smartphone on ");
        }
        public void off(){
            System.out.println("smart phone off");
        }
}

public class dynamic {
    public static void main(String[] args) {
        phone p=new smartphone();
//        phone pp=new phone();
//        p.on();
//        p.off();
        p.omg();


    }
}
