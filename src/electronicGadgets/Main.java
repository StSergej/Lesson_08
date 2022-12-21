package electronicGadgets;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Device deviceOne = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(deviceOne);
        Monitor monitorOne = new Monitor("Samsung", 120, "AB1234567CD", 1280,1024);
        System.out.println(monitorOne);
        System.out.println();

        Device deviceTwo = new Device("Xiaomi", 180, "DE9876543KL");
        System.out.println(deviceTwo);
        Monitor monitorTwo = new Monitor
                ("Xiaomi", 180, "DE9876543KL", 2560,1440);
        System.out.println(monitorTwo);
        System.out.println();

        EthernetAdapter adapterOne = new EthernetAdapter
                ("TP-Link", 15, "12345AC",1000, "CO-A1-F8-34-CF-C6");
        System.out.println(adapterOne);
        EthernetAdapter adapterTwo = new EthernetAdapter
                ("ASUS", 30, "NN5432K",860, "CB-D2-E5-56-KL-F8");
        System.out.println(adapterTwo);
        System.out.println();

        System.out.println("Monitor equals________________________");
        System.out.println("Should true - monitorOne.equals(monitorOne): " + monitorOne.equals(monitorOne));
        System.out.println("Should false - monitorOne.equals(monitorTwo): " + monitorOne.equals(monitorTwo) );

        System.out.println("Monitor hashCode______________________");
        System.out.println("Should true - monitorOne.hashCode() == monitorOne.hashCode(): "
                + (monitorOne.hashCode() == monitorOne.hashCode()));
        System.out.println("Should false - monitorOne.hashCode() == monitorTwo.hashCode(): "
                + (monitorOne.hashCode()==monitorTwo.hashCode()));

        System.out.println("EthernetAdapter equals________________________");
        System.out.println("Should true - adapterOne.equals(adapterOne): " + adapterOne.equals(adapterOne));
        System.out.println("Should false - adapterOne.equals(adapterTwo): " + adapterOne.equals(adapterTwo));
        System.out.println("EthernetAdapter hashcode______________________");

        System.out.println("Should true - adapterOne.hashCode() == adapterOne.hashCode() : "
                + (adapterOne.hashCode()==adapterOne.hashCode()));
        System.out.println("Should false - adapterOne.hashCode() == adapterTwo.hashCode(): "
                + (adapterOne.hashCode()==adapterTwo.hashCode()));
    }
}