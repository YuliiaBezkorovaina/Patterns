package Command;

public class ResetCommand implements Command {
    private Comp computer;
    @Override
    public void execute() {
        computer.reset();
    }

    public ResetCommand(Comp computer) {
        this.computer = computer;
    }
}
