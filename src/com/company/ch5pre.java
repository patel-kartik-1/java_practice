package com.company;

public class ch5pre {
    public static void main(String[] args) {
        int i,j;

//        for (i=5;i!=0;i--){
//
//            for (j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//
//         int n=5,ans=0;
//        while (n!=0){
//            ans=ans+n;
//            n--;
//        }
//
//        System.out.println(ans);
//        j=4;
//        for (i=10;i!=0;i--){
//            System.out.println(j+" x "+ i+ " = "+j*i);
//        }

//        j=5;
//        int ans=1;
//        for (j=5;j!=0;j--){
//            ans=ans*j;
//        }
//        System.out.println(ans);


        j=8;
        int an=0;
        for (i=10;i!=0;i--){

            if (i==1){
                System.out.print("  "+ j*i +" = ");
                an=an+j*i;
                break;

            }
            System.out.print("  "+ j*i +" +");
            an=an+j*i;
        }
        System.out.println(an);
        }
    }

