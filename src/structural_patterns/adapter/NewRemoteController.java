package structural_patterns.adapter;

public class NewRemoteController implements IRemoteControl{
    @Override
    public void play() {
        System.out.println("New something playing..");
    }
}
