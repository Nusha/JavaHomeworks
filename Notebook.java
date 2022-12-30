public class Notebook {
    int id;
    String brand;
    String processor;
    int ram;
    int hdd;
    String os;
    String color;
    String country;

    public Notebook(int id, String brand, String processor, int ram, int hdd, String os, String color, String country) {
        this.id = id;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
