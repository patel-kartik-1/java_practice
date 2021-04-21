package com.company;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class mile {

    public static void main(String[] args) {
        float a=0.621371f,c;
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number in km");
//        float b=sc.nextFloat();
//        c=a*b;
//        System.out.println(" "+b+"km = "+c+" mile");

//        int z;
//        System.out.println("enter number ");
//        z= sc.nextInt();
//       boolean x= sc.hasNextInt();
//        System.out.println(x);

//        String kk=sc.next();
//        System.out.println(kk);
//        String ss=sc.next(); gain without space
//        String ss=sc.nextLine(); gain with space


//        System.out.println(ss);

        String name="Kkarktik";
//
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.length());
//        System.out.println(name.substring(1,4));
//        System.out.println(name.equals("kartik"));
//        System.out.println(name.equalsIgnoreCase("kartik"));
//        System.out.println(name.endsWith("ik"));
//        System.out.println(name.startsWith("ik"));
//        System.out.println(name.charAt(3));
//        System.out.println(name.indexOf("k"));
//        System.out.println(name.indexOf("k",3));
//

//        String n="Dear <name>,\n \t \t \t  Thank A Lot to join with us";
//        System.out.println(n.replace("<name>","jinal"));

//        System.out.println("enter sub 1 marks");
//        int s=sc.nextInt();
//        System.out.println("enter sub 2 marks");
//                int p=sc.nextInt();
//        System.out.println("enter sub 3 marks");
//                int m=sc.nextInt();
//        int to=s+p+m;
//        if (to/3>=40 && s>=33 && p>=33 && m>=33){
//            System.out.println("pass");
//        }
//        else {
//            System.out.println("oppps!!! , fail ");
//        }


        Random rand=new Random();
        String res="y",ans;

////        0-stone
//          1-paper
//          2-sesoor
        while ((res.equalsIgnoreCase("y")))
        {
            int k = rand.nextInt(3);

            System.out.println("Enter Your Choice for \n \t Stone enter St  \n \t paper enter P \n \t sessor S");
            ans= sc.next();
            if (ans.equalsIgnoreCase("st")){
                if (k==0){
                    System.out.println(" Both have same choice Stone !!!");
                }
                else if (k==1){
                    System.out.println("Oppps you losee computer genrate paper and you stone");

                }
                else if (k==2){
                    System.out.println("yupp you will computer genrate sessor and you stone ");

                }
            }
            else if (ans.equalsIgnoreCase("p")){
                if (k==0){
                    System.out.println("yupp you will computer genrate stone and you Paper ");

                }
                else if (k==1){
                    System.out.println(" Both have same choice paper !!!");

                }
                else if (k==2){
                    System.out.println("Oppps you losee computer genrate sesor and you Paper");

                }
            }
            else if (ans.equalsIgnoreCase("s")){
                if (k==0){
                    System.out.println("Oppps you losee computer genrate stone and you sesor");

                }
                else if (k==1){
                    System.out.println("yupp you will computer Paper stone and you Sessor ");

                }
                else if (k==2){
                    System.out.println(" Both have same choice sessor !!!");

                }

            }
            else {
                System.out.println("Enter Right choice");
            }

            System.out.println("do you  want to play again yes(y) no then(n) ? ");
            res=sc.next();
        }


    }
}
