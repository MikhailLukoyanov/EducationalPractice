package bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new TinkoffSystem(new JavaDeveloper()),
                new BankSystem(new CppDeveloper())
        };
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
