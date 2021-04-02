public class WiFi extends AddOnDecorator{

    public WiFi(OurFurnace f){
        super.furnace= f;  //or this.furnace=f  same thing
    }
    @Override
    public void turnOff() {
        furnace.turnOff();
        System.out.print(" Wifi: Terminated ");
    }

    @Override
    public void turnOn() {
        furnace.turnOn();
        System.out.print(" Wifi: Initialized ");
    }
}
