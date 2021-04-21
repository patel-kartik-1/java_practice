package com.company;
import java.util.Scanner;
import java.util.Random;
class rec{
    int a,b;

    public rec(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class game{
    int comp,user,i=0;
    Scanner sc =new Scanner(System.in);
    public game(int a){
        comp=a;
    }

    public void input(int i){
        i += 1;
        System.out.println("enter a number");
        user=sc.nextInt();
        chack(user,i);
    }
    public boolean chack(int us,int i){
        if (i>10){
            System.out.println("opps!! you lose the game");
            return false;
        }
        else if (comp==us){
            System.out.println("you beat this game in " + i +" attempt");
            return true;
        }
        else if (us<comp && i<=10){
            if (!(us<comp-5)){
                System.out.println("you are near the number incress the number");
                input(i);
            }
            else if (!(us<comp-20)){
                System.out.println("you are far the number incress the number");
                input(i);
            }
            else if (us<comp){
                System.out.println("you are so far the number incress the number ");
                input(i);
            }
        }
        else if (us>comp && i<=10){
            if (!(us-5>comp)){
                System.out.println("you are near the number decress the number");
                input(i);
            }
            else if (!(us-20>comp)){
                System.out.println("you are far the number decress the number");
                input(i);
            }
            else if (us>comp){
                System.out.println("you are so far the number decress the number ");
                input(i);
            }

        }
       return false;
    }

}

public class ex3 {
    public static void main(String[] args) {


        int com;
        Random a = new Random();
        com = a.nextInt(100);
//        System.out.println("computer "+ com);
        game kar=new game(com);
        kar.input(0);

    }
}
