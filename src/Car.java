public class Car {
    private String make = "Tesla";
    private  String model = " x";
    private  String color = " white" ;
    private int doors = 2;
    private  boolean convertible = true;

    public String getMake() {
        return make;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors" +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : " "));
    }
}
