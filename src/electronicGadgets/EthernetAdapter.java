package electronicGadgets;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac){
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
    public EthernetAdapter(){}

    public int getSpeed() {
        return speed;
    }
    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " + "manufacturer ='" + getManufacturer() + '\'' + ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber() +", speed=" + this.speed + ", mac=" + this.mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}