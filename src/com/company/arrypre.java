package com.company;
import java.util.Scanner;
public class arrypre {

    public static void main(String[] args) {

//        float []a={4.4f,3.3f,1.1f,5.5f};
//        float x=0;
        Scanner sc= new Scanner(System.in);
//        int [] a={1,2,3,4,5,67,33,21,33,90,54,20};
//        System.out.print("enter num :");
//        int b=sc.nextInt();
//
//        for (int i=0;i<a.length;i++){
//            if (b==a[i]){
//                System.out.println("its present at "+ (i+1) );
//                break;
//            }
//            else if (i==a.length-1){
//                System.out.println("its not present");
//            }
//        }

//        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
//        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
//        int [][]ans= new int[3][3];
//        System.out.println("this a "+a.length);
//        for(int i=0;i<a.length;i++) {
//            for (int j=0;j<a[i].length;j++){
//                ans[i][j]=a[i][j]+b[i][j];
//                System.out.print(" "+ ans[i][j] + " ");
//            }
//            System.out.println("");
//        }

        int []a={1,2,3,-33,-54,77,11,1003,4,-5,6,7,8,-1665,9,76};
        int c=0,d;
//        for(int i=0;i<a.length/2;i++){
//            c=a[i];
//            a[i]=a[a.length-1-i];
//            a[a.length-1-i]=c;
//        }
//        for(int x :a) {
//            System.out.println(x);
//        }
//        c=a[0];
//        d=a[0];
//        for (int i=0;i<a.length;i++){
//            if (a[i]<c){
//                c=a[i];
//            }
//            if (a[i]>d){
//                d=a[i];
//            }
//
//        }
//        System.out.println("small "+c);
//        System.out.println("big "+d);
//        int []aa={1,2,3,-33,-54,77,11,1003,4,-5,6,7,8,-1665,9,76};
        int []aa={1,2,3,4,5,6,7,9,11,10,25,55};
        int cc=aa[0];
        boolean dd=true;
        for (int i=0;i<aa.length;i++){
            if (cc>aa[i]){
                dd=false;
                System.out.println("false "+i+" A[1] "+aa[i] + "cc "  + cc);
                break;
            }
            cc=aa[i];
            dd=true;
        }
        if (dd==false){
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }

    }
}
