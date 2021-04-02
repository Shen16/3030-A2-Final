import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Furnace;

public abstract class OurFurnace implements Furnace {

    protected ControllerInterface c;
    protected String ID;
    protected boolean status;
    protected boolean active;

    @Override
    public ControllerInterface getController() {
        return this.c;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {
        this.c= controllerInterface;

    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String s) {
        this.ID= s;
    }

    @Override
    public void enable() {
        status= true;

    }

    @Override
    public void disable() {
        status=false;

    }

    @Override
    public boolean enabled() {
        return this.status;
    }

    @Override
    public abstract void turnOff();

    @Override
    public abstract void turnOn();

    @Override
    public boolean isOn() {
        return active;
    }
}
