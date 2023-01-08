package Computer;

import java.sql.SQLOutput;

public class Computer {
 int value;
 String model;
 RAM ram;
 HDD hdd;

public Computer(int value, String model){
    this.value = value;
    this.model = model;
}
public Computer(int value,String model, RAM ram, HDD hdd){
    this.value = value;
    this.model = model;
    this.ram = ram;
    this.hdd = hdd;
}
public void info(){
    System.out.println("Информация о компьютере " + model);
    System.out.println("Стоимость " + value);
}
}
