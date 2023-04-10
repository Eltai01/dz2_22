public class Toyota extends Car {

    private int Age_release;
    private String country;


    public Toyota(String name, double volume_motor, int age_release, String country) {
        super(name, volume_motor);
        this.Age_release = age_release;
        this.country = country;
    }

    @Override
    public void print() {
        System.out.println("\nName " + getName() +
                "\nVolume motor " + getVolume_motor() +
                "\nAge release " + Age_release +
                "\nCountry " + country);
    }
}
