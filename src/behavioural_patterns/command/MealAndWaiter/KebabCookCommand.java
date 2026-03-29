package behavioural_patterns.command.MealAndWaiter;

public class KebabCookCommand implements ICommand {
    private Kebab kebab;

    public KebabCookCommand(Kebab kebab) {
        this.kebab = kebab;
    }

    @Override
    public void execute() {
        kebab.cook();
    }
}
