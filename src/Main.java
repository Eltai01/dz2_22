public class Main {
    public static void main(String[] args) {
        createObject("Bmw");;
        createObject("Mercedes");
        createObject("Toyota");
    }

    private static void createObject(String Car) {
        switch (Car) {
            case "Bmw":
                Bmw bmw = new Bmw(" M5 ", 4.4,   2005, " Germany ");
                bmw.print();
            case "Mercedes":
                Mercedes mercedes = new Mercedes("E210",5.5,2002,"Germany");
                mercedes.print();
            case "Toyota":
                Toyota toyota = new Toyota("Supra",3.0,2000,"Japan");
                toyota.print();


        }

    }
}