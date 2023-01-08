package Computer;

public class RAM {
 String name;
 int volume;
    public RAM(){
        this.name = "unknown";
        this.volume = 8;
    }
    public RAM(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    public void infoRAM(){
        System.out.println("RAM: " + name + " " + "\n" + "Volume: " + volume);
    }
}
