package InterfaceExample;

public class Car implements  Vehicle {

    private String type;
    private String speed;
    private String color;

    public Car(String type, String speed, String color){
        super();
        this.type = type;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public String getSpeed(){
        return this.speed;
    }

    @Override
    public String getColor(){
        return this.color;
    }
}
