package kg.megacom.childs;

public class CEO extends Manager {
    private boolean hasCompanyCar;

    public CEO(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO() {
    }

    public CEO(boolean hasStocks) {
        super(hasStocks);
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I have a wedding today");
    }
}
