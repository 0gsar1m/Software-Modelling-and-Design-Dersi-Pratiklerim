package structural_patterns.adapter;

public class OldRemoteController { //we can't say implements IRemoteController due to case {
    //adapted class generally comes read-only, u can't change it. Or It's just dinosaur code lol idk
    // U gotta adaptee it w Adapter Pattern
    public void playOld() {
        System.out.println("Old something playing..");
    }
}
