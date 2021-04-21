package com.company;


import java.util.Scanner;

class liabry{
    String[] books= new String[100];
    int[] totalbooks= new int[100];
    int i=4;
    Scanner sc= new Scanner(System.in);

    public void add(){
        System.out.println("Enter book name");
        books[i]=sc.next();
        System.out.println("Enter Total book ");
        totalbooks[i]=sc.nextInt();
        i++;
        System.out.println("add book sucseess fully");
    }
    public void issuuBook(){
        show();
        int ans;
        System.out.println("wich no book do you want to issu");
        ans=sc.nextInt();
        ans=ans-1;
        if (totalbooks[ans]>0){
            System.out.println("you book \""+books[ans]+"\" is issue succsess full");
            totalbooks[ans]=(totalbooks[ans]-1);
        }
        else if (totalbooks[ans]==0){
            System.out.println("opps!!  \""+books[ans]+"\" is not awailable");
        }
    }
    public void returnBook(){
        show();
        int ans;
        System.out.println("wich no book do you want to returnn");
        ans=sc.nextInt();
        ans=ans-1;
        System.out.println("\""+books[ans]+"\" this book is return succsess full");
        totalbooks[ans]=(totalbooks[ans]+1);

    }
    public void show(){
        if (i!=0) {
            System.out.println("Book List");
            System.out.println("------------------------------");
            System.out.println("SR No\tBook Name\tTotal Book");
            for (int j = 0; j < i; j++) {
                System.out.println((j + 1) +"\t\t "+ books[j] + "\t \t \t" + totalbooks[j]);
            }
            System.out.println("------------------------------");
        }
        else {
            System.out.println("Library is Empty");
        }
    }

}
public class laibrabyyy {
    public static void main(String[] args) {
        liabry a=new liabry();
        Scanner sc=new Scanner(System.in);
        int op=0;
        a.books[0]="Java";
        a.totalbooks[0]=2;
        a.totalbooks[1]=3;
        a.totalbooks[2]=5;
        a.totalbooks[3]=4;
        a.books[1]="Cpp";
        a.books[2]="Android";
        a.books[3]="Python";

        while (op!=5) {
            System.out.println("What do you want ??\n\t ------------------------------- \n\t Press 1 for Add book\n\t Press 2 for Showbooks \n\t Press 3 for Issubook \n\t Press 4 for Return book \n\t Press 5 for Exit \n\t -------------------------------");
            op= sc.nextByte();
            if (op==5){
                System.out.println("You are exiting........");
            }
            switch (op) {
                case 1:
                    a.add();
                    break;
                case 2:
                    a.show();
                    break;
                case 3:
                    a.issuuBook();
                    break;
                case 4:
                    a.returnBook();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter Right Choice");
            }
        }
    }
}
