package kg.megacom;
import kg.megacom.childs.Developer;

public enum DeveloperGrades {
    JUNIOR("I'm junior developer"),
    MIDDLE("I'm middle level"),
    SENIOR("I'm senior developer"),
    TEAMLEAD("I'm teamleader");

     private String phrase;
     static Developer developer;

    DeveloperGrades(String phrase) {
        this.phrase = phrase;
    }

    DeveloperGrades() {
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public static void printPhrase(Developer developer){
        System.out.println(developer.getGrades().phrase);
    }
}