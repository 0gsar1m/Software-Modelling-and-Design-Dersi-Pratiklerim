package structural_patterns.adapter;

public class OldRemoteAdapter implements IRemoteControl{
    private OldRemoteController oldRemoteController;

    public OldRemoteAdapter(OldRemoteController adaptee1){
        this.oldRemoteController = adaptee1;
    }


    @Override
    public void play() {
        oldRemoteController.playOld();
    }
}
