public  class Car implements Printable{
    private String name;
    private double volume_motor;


    public String getName() {
        return name;
    }

    public double getVolume_motor() {
        return volume_motor;
    }



    public Car(String name, double volume_motor) {
        this.name = name;
        this.volume_motor = volume_motor;

    }

    @Override
    public void print() {

    }
}
