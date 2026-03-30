package structural_patterns.bridge.ex2;

public class Main {
    static void main() {
        //first construct a TV
        IDevice tv = new Tv();

        System.out.println();
        //then an advanced remote cont.
        AdvancedRemoteController advRemote = new AdvancedRemoteController(tv); //we gave TV inside
        advRemote.togglePower();
        advRemote.openYouTube();
        advRemote.openTabii();
        System.out.println("-------------------------");
        //then construct Radio
        IDevice radio = new Radio();

        //then standard remote
        StandardRemoteController stdRem = new StandardRemoteController(radio);
        stdRem.togglePower();
        stdRem.mute();
    }
}
