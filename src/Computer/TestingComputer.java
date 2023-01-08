package Computer;

public class TestingComputer {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2500,"HP", new RAM(), new HDD());
        comp1.info();
        Computer comp2 = new Computer(5000,"Lenovo", new RAM("HyperX", 8),
                new HDD("Seagate", 1000,"external"));
        comp2.info();
    }
}
