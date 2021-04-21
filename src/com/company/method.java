package com.company;

public class method {
    public int lo(int x , int y){
        int c;
        c=x+y;
        return c;

    }
    static int log(int x , int y) {
        int c;
        c = x + y;
        return c;
    }

        public static void main(String[] args) {

        int a=3,b=4,c;
        method o=new method();
        c=o.lo(a,b);
        System.out.println(c);

       int  cc=log(a,b);
            System.out.println(cc);
    }
}
