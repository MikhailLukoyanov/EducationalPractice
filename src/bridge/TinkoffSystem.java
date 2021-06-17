package bridge;

public class TinkoffSystem extends Program{

    protected TinkoffSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Система Тинькофф в разработке...");
        developer.writeCode();
    }
}
