package com.company;

public class fibonaki {
    public static void fibi(int a){
        int ans=0,b=0,c=1,d=0;
        for (d=0;a>d;d++)
         {
            ans = b + c;
            b = c;
            c = ans;
            System.out.println(ans);
         }
    }
    static void f(int ...x){
        int sum=0;
        for (int e:x){
            sum=sum+e;
        }
        System.out.println(sum/x.length);
    }
    public static void main(String[] args) {
//        fibi(10);
        f(1,2,3,4,5);
    }

}


