package structural_patterns.facade;

public class SmartHouseFacade {
    public void partyMode(){
        DoorSystem doors = new DoorSystem();
        LightSystem lights = new LightSystem();

        doors.unlockDoors();
        lights.turnOnLights();
        //etc..
    }
    public void sleepMode(){
        //...
    }
    public void goingOutMode(){
        //...
    }
}
