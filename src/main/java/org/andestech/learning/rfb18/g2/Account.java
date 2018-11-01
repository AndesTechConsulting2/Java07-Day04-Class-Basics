package org.andestech.learning.rfb18.g2;

public class Account {


    public Account(int id, double ballance) {
        this.id = id;
        this.ballance = ballance;
    }

    private int id;

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    private double ballance;

    public String getAccountString(){
        return  "Account id: " +id + ", Ballance:" +
                ballance;


    }

}
