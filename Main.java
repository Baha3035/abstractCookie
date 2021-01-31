public class Main {
    public static void main(String[] args) {

        Specialist Andrew = new Specialist("Adrew Wiggins", 34, 3000, 2);
        Specialist Steph = new Specialist("Steph Curry", 32, 3000, 3);
        Specialist Kelly = new Specialist("Kelly Oubre", 30, 5000, 4);

        Developer Lebron = new Developer("Lebron James", 34, 2500, "Upper");
        Developer Anthony = new Developer("Anthony Davis", 30, 3000, "Upper");
        Developer Montrazl = new Developer("Montrazl Harris", 21, 3000, "Upper");
        Developer Shrodder = new Developer("Dennis Shrodder", 28, 1500, "Beginner");

        Manager Michael = new Manager("Michael Jordan", 45, 30000, false);
        Manager Magic = new Manager("Magic Johnson", 46, 60000, true);

        CEO Larry = new CEO("Larry Bird", 50, 75000, true, true);

        Employee[] employee = new Employee[10];
        employee[0] = Andrew;
        employee[1] = Steph;
        employee[2] = Kelly;
        employee[3] = Lebron;
        employee[4] = Anthony;
        employee[5] = Montrazl;
        employee[6] = Shrodder;
        employee[7] = Michael;
        employee[8]= Magic;
        employee[9] = Larry;

        for (int i = 0; i < 10; i++){
            employee[i].goToDayOff();
        }
    }
}
