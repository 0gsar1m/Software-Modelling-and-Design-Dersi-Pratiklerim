package behavioural_patterns.command.MealAndWaiter;

public class SoupCookCommand implements ICommand{
    private Soup soup;

    public SoupCookCommand(Soup soup){
        this.soup = soup;
    }

    @Override
    public void execute() {
        soup.cook();
    }
}
