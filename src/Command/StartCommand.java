package Command;

public class StartCommand implements Command {
    private Comp computer;
    @Override
    public void execute() {
        computer.start();
    }

    public StartCommand(Comp computer) {
        this.computer = computer;
    }
}
