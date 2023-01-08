package Computer;

public class TestingComputer {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2500,"HP", new RAM(), new HDD());
        RAM ram1 = new RAM();
        HDD hdd1 = new HDD();
        comp1.info();
        ram1.infoRAM();
        hdd1.infoHDD();
        Computer comp2 = new Computer(5000,"Lenovo", new RAM(), new HDD());
        RAM ram2 = new RAM("HyperX", 8);
        HDD hdd2 = new HDD("Seagate", 1000,"external");
        comp2.info();
        ram2.infoRAM();
        hdd2.infoHDD();
    }
}
