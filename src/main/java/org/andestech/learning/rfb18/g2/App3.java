package org.andestech.learning.rfb18.g2;

interface IMovable
{
    public void moveForward(int vel);
    public void moveBackward(int vel);
    //....
    //....
}

interface ITransmission
{
    public void sw(int i);
}



abstract class BasicCar
{
    double mass, power, vel;

    public abstract void ignit();
    public  void safeOut(){
        System.out.println("++ safe ok!");
    }
    //


}

class Car extends BasicCar implements IMovable{
    @Override
    public void ignit() {
        //...
        //...
        System.out.println("Car ignition...");
    }

    @Override
    public void moveForward(int vel) {
       this.vel = vel;
        System.out.println("Car moves forward with " + vel + "km/h.");
    }

    @Override
    public void moveBackward(int vel) {
        this.vel = vel;
        System.out.println("Car moves backward with " + vel + "km/h.");
    }
}

class Truck extends BasicCar{

    @Override
    public void ignit() {
        //...
        //...
        System.out.println("Truck ignition...");

    }
}


public class App3 {


    private static void testCarMove(IMovable mv)
    {
        System.out.println("start test....");
        mv.moveForward(3);
        mv.moveForward(50);
        mv.moveForward(3);
        //...
        mv.moveBackward(3);
    }

    public static void main(String[] args)
    {

        Car car = new Car();
        car.ignit();
        car.moveForward(20);
        car.moveBackward(20);

        testCarMove(car);

        Object o = car;

        ((Car)o).ignit();
       // ((Truck)o).ignit();

        Object o1 = new Object();

        Car c2 = (Car)o1;





    }
}
