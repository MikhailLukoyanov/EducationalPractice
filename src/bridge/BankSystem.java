package bridge;

public class BankSystem extends Program{
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Система банка в разработке...");
        developer.writeCode();
    }
}
