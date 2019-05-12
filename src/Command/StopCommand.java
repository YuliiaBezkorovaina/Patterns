package Command;

public class StopCommand implements Command{
    private Comp computer;
    @Override
    public void execute() {
        computer.stop();
    }

    public StopCommand(Comp computer) {
        this.computer = computer;
    }
}
