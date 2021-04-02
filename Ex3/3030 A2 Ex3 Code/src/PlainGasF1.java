public class PlainGasF1 extends OurFurnace{

    @Override
    public void turnOff() {
        this.active=false;
        System.out.print("PlainGasF1: Turning off. ");
    }

    @Override
    public void turnOn() {
        this.active= true;
        System.out.print("PlainGasF1: Up and Running ");
    }
}
