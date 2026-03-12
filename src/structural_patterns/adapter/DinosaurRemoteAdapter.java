package structural_patterns.adapter;

public class DinosaurRemoteAdapter implements IRemoteControl{
    private DinosaurRemoteController dinosaurRemoteController;
    public DinosaurRemoteAdapter(DinosaurRemoteController adaptee2){
        this.dinosaurRemoteController = adaptee2;
    }

    @Override
    public void play() {
        dinosaurRemoteController.dinosaurPlay();
    }
}
