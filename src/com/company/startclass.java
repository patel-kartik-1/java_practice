package com.company;

class Emp{
    int id;
    String name;
    int salary;
    public void getd(){
        System.out.println("id is " +id);
        System.out.println("name is " +name);
        System.out.println("sallary is " +salary);
    }
}

 class ee{
    int sallary;
    String name;

     public int gets(){
         return sallary;
     }
     public void setn(String name){
         this.name=name;
     }
     public String getn(){
         return name;
     }

}
public class startclass {
    public static void main(String[] args) {
        Emp kar=new Emp();
        kar.id=1;
        kar.name="kartik";
        kar.salary=100;
        Emp jin=new Emp();
        jin.id=1;
        jin.name="kartik";
        jin.salary=100;
//        kar.getd();
//        jin.getd();


        ee jina=new ee();
        jina.setn("jinal");
        jina.sallary=100;
        System.out.println(jina.getn());
        System.out.println(jina.gets());
    }
}
