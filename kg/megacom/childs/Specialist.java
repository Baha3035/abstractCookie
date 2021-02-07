package kg.megacom.childs;

import kg.megacom.parent.Employee;

public class Specialist extends Employee {
    private int levels;

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public Specialist() {
    }

    public Specialist(int levels) {
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    static void workWithClients(){
        System.out.println("How can I help you?");
    }

    public void goToDayOff(){
        System.out.println("I've broken my fingers");
    }
}
