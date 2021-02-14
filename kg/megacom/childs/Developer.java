package kg.megacom.childs;

import kg.megacom.DeveloperGrades;
import kg.megacom.parent.Employee;

public class Developer extends Employee {
    private DeveloperGrades grades;

    public Developer(String fio, int age, int salary, DeveloperGrades grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer() {
    }

    @Override
    public void goToDayOff() {

    }

    public Developer(DeveloperGrades grades) {
        this.grades = grades;
    }

    public DeveloperGrades getGrades() {
        return grades;
    }

    public void setGrades(DeveloperGrades grades) {
        this.grades = grades;
    }

    static void writeCode(){
        System.out.println("Yo I'm writing my program");
    }


    }

