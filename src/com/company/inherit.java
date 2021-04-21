package com.company;


class animal{
    int leg;
    int eye;

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getLeg() {
        return leg;
    }

    public int getEye() {
        return eye;
    }
}
        class dog extends animal{
            String speak="bau bau...";


            public String getSpeak() {
                return speak;
            }
        }
public class inherit {
    public static void main(String[] args) {
        dog ob1= new dog();
        ob1.eye=2;
        ob1.leg=2;
        System.out.println(ob1.getEye());
        System.out.println(ob1.getLeg());
        System.out.println(ob1.getSpeak());

    }
}
