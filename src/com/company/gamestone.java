package com.company;

import java.util.Scanner;
import java.util.Random;
public class gamestone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String chack="y";

        while (chack.equalsIgnoreCase("y")) {
            int com = rand.nextInt(3);
            String comp,user;
            int ans=0;
            System.out.println("enter your choice \n \t s for stone \n\t p for paper \n\t se for sessor ");
            user=sc.next();
            System.out.println(user);
                if (com == 0) {
                    comp = "stone";
                } else if (com == 1) {
                    comp = "paper";
                } else {
                    comp = "sessor";
                }
            if (user.equalsIgnoreCase("s"))
            {
                user="stone";
                if (comp=="stone"){
                    ans=2;
                }
                if (comp=="paper")
                {
                    ans=0;
                }
                if (comp=="sessor"){
                    ans=1;
                }
            }
            else if (user.equalsIgnoreCase("p"))
            {
                user="Paper";
                if (comp=="stone"){
                    ans=1;
                }
                if (comp=="paper")
                {
                    ans=2;

                }
                if (comp=="sessor"){
                    ans=0;

                }
            }
            else if (user.equalsIgnoreCase("se"))
            {
                user="sessor";
                if (comp=="stone"){
                    ans=0;
                }
                if (comp=="paper")
                {
                    ans=1;

                }
                if (comp=="sessor"){
                    ans=2;
                }
            }
            else {
                System.out.println("Please eneter valid input");
            }
//its if condition
                if (ans==1){
                    System.out.println("YUPP !! you win you enter, "+user+" and computre value is "+comp);
                }
                else if (ans==0){
                    System.out.println("opps !! you loss you enter, "+user+" and computre value is "+comp);
                }
                else if (ans==2){
                    System.out.println("ohh!! it's drow you enter, "+user+" and computre value is "+comp);
                }
//play now or not??
            System.out.println("do you want to play y/n");
            chack=sc.next();
            if (!chack.equalsIgnoreCase("y") && !chack.equalsIgnoreCase("n"))
            {
                System.out.println("enter right choice do you want to play y/n");
                chack=sc.next();
            }
        }

    }
}
