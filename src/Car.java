public class Car {
     String make = "Tesla";
     String model = " x";
     String color = " white" ;
     int doors = 2;
    boolean convertible = true;


    public void describeCar() {
        System.out.println(doors + "-Doors" +
                color + " " +
                make + " " +
                model + " " +
        (convertible ? "Convertible" : " "));
    }
}
