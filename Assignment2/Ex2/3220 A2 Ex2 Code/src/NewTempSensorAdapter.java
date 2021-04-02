import newtemp.NewTempSensor.NewTempSensorDriver;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.Observer;
import newtemp.NewTempSensor.Subject;


public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, TemperatureSensor, Observer{

    protected ControllerInterface c;
    protected String ID;
    protected boolean enabled;
    protected int temperature = 23;
    private NewTempSensorDriver subject; //Didn't choose Subject abstract type because them I would need to cast NewTempSensorDriver type later when calling specific methods


    public NewTempSensorAdapter(){

        subject= new NewTempSensorDriver();  //new
        subject.registerObserver(this);

    }

    @Override
    public NewTempSensorDriver getAdatptee() {

        return this.subject;  //new
    }

    @Override
    public void newTemperature(int i) {
        subject.newTemperature(i); //Implements newTemperature of NewTempSensorDriver which notifies all observers and calls update method on each observer
    }

    @Override
    public void update(int i) {
        this.temperature = i;
        System.out.println("Sensor (" + ID +  ") receiving new temperature: " + i);
    }

    @Override
    public ControllerInterface getController() {
        return this.c;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {
        this.c = controllerInterface;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String s) {
        this.ID = s;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public boolean enabled() {
        return this.enabled;
    }

    @Override
    public int getReading() {
        return this.temperature;
    }

}
