package kg.megacom;

import kg.megacom.childs.CEO;
import kg.megacom.childs.Developer;
import kg.megacom.childs.Manager;
import kg.megacom.childs.Specialist;
import kg.megacom.parent.Employee;

public class Main {
    public static void main(String[] args) {

        Specialist Andrew = new Specialist("Adrew Wiggins", 34, 3000, 2);
        Specialist Steph = new Specialist("Steph Curry", 32, 3000, 3);
        Specialist Kelly = new Specialist("Kelly Oubre", 30, 5000, 4);

        Developer Lebron = new Developer("Lebron James", 34, 2500, DeveloperGrades.JUNIOR);
        Developer Anthony = new Developer("Anthony Davis", 30, 3000, DeveloperGrades.SENIOR);
        Developer Montrazl = new Developer("Montrazl Harris", 21, 3000, DeveloperGrades.TEAMLEAD);
        Developer Shrodder = new Developer("Dennis Shrodder", 28, 1500, DeveloperGrades.MIDDLE);

        Manager Michael = new Manager("Michael Jordan", 45, 30000, false);
        Manager Magic = new Manager("Magic Johnson", 46, 60000, true);

        CEO Larry = new CEO("Larry Bird", 50, 75000, true, true);
            printDeveloperGrade(Lebron);
            printDeveloperGrade(Anthony);
            printDeveloperGrade(Montrazl);
            printDeveloperGrade(Shrodder);
    }
    private static void  printDeveloperGrade(Developer o) {
            switch (o.getGrades()){
                case JUNIOR:
                    System.out.println("I'm junior developer");
                   break;
                case MIDDLE:
                    System.out.println("I'm middle level developer");
                    break;
                case SENIOR:
                    System.out.println("I'm senior developer");
                    break;
                case TEAMLEAD:
                    System.out.println("I'm teamlead developer");

            }
    }
}
