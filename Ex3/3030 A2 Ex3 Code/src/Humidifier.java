public class Humidifier extends AddOnDecorator{

    public Humidifier(OurFurnace f){
        super.furnace= f;  //or this.furnace=f  same thing
    }
    @Override
    public void turnOff() {
        furnace.turnOff();
        System.out.print(" Humidifier: Off ");
    }

    @Override
    public void turnOn() {
        furnace.turnOn();
        System.out.print(" Humidifier: On ");
    }
}
