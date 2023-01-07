package Computer;

public class RAM {
    static String name;
    static int volume;
    public RAM(){
        this.name = "unknown";
        this.volume = 4;
    }
    public RAM(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    public static void infoRAM(){
        System.out.println("RAM: " + name + " " + "\n" + "Volume: " + volume);
    }
}
