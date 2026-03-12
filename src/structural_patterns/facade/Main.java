package structural_patterns.facade;

public class Main {
    static void main() {
        SmartHouseFacade houseFacade = new SmartHouseFacade();
        houseFacade.partyMode(); //output: unlocking door\n Turning lights on
        houseFacade.sleepMode();
        houseFacade.goingOutMode();

        //etc...
    }
}
