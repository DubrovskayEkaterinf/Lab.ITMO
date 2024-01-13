package Laboratornya6.Task3;

public class Truck extends Auto {
    public int numberWheels;
    public int maxWeight;
    public Truck (int w, String m, char c, float s, int numberWheels, int maxWeight){
        super(w, m, c, s);
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;

    }
    public Truck(int numberWheels, int maxWeight){
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;
    }

private void setNewWheels (int newWheels){
    this.numberWheels = newWheels;
    System.out.println("У грузовика " + newWheels + " колес.");

}

}
