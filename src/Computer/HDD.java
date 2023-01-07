package Computer;

public class HDD {
    static String name;
    static int volume;
    static String type;

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

    public static void infoHDD() {
        System.out.println("HDD: " + name + "\n" + "Volume: " + volume + "\n" + "Type: " + type);
    }
}