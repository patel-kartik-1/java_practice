package com.company;

class base{
    int x;
    base(){
        System.out.println("hello base cunstructor");
    }
    base(int a){
        x=a;
        System.out.println("hello base cunstructor with valu of x is "+x);
    }
}
class derive extends base{
    int y;
    derive(){
        System.out.println("hello derive cunstructor");
    }
    derive(int a,int b){
        super(a);
        y=b;
        System.out.println("hello derive cunstructor with valu of y is "+y);
    }
}

class derive2 extends derive{
    int z;
    derive2(){
        System.out.println("hello derive2 cunstructor");
    }

    derive2(int a,int b,int c){
        super(a,b);
        z=c;
        System.out.println("hello derive2 cunstructor with valu of z is "+z);
    }
    derive2(int a,int b){
        super(a,b);

        System.out.println("hello derive2 cunstructor without z ");
    }

}



public class inheritsuper {
    public static void main(String[] args) {
derive2 a=new derive2(1,2,3);
derive2 b=new derive2(1,2);

    }
}
