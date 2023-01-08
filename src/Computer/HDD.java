package Computer;

public class HDD {
 String name;
 int volume;
 String type;
    public HDD() {
        this.name = "unknown";
        this.type = "internal";
        this.volume = 400;
    }
    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    public void infoHDD() {
        System.out.println("HDD: " + name + "\n" + "Volume: " + volume + "\n" + "Type: " + type);
        System.out.println();
    }
}