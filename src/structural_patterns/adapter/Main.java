package structural_patterns.adapter;

public class Main {
    static void main() {
        //New remote play, easy
        IRemoteControl newController = new NewRemoteController();
        newController.play();

        //for adapted, we need object to inject inside adapter
        OldRemoteController oldRemoteController = new OldRemoteController();
        DinosaurRemoteController dinoRemoteController = new DinosaurRemoteController();

        IRemoteControl oldController = new OldRemoteAdapter(oldRemoteController);
        oldController.play();

        IRemoteControl dinoRemote = new DinosaurRemoteAdapter(dinoRemoteController);
        dinoRemote.play();

        //easy! a bit "amele işi" but Its good practice I believe.
    }
}
