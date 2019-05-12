package Command;

/**
 * 10th pattern
 */
public class Main {
    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new ResetCommand(comp));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
