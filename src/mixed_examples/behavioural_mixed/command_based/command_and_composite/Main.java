package mixed_examples.behavioural_mixed.command_based.command_and_composite;

public class Main {
    static void main() {
        Light livingRoomLight = new Light();
        Door frontDoor = new Door();

        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lockDoor = new LockDoorCommand(frontDoor);

        // Tekil komut çalıştırma
        // lightOn.execute();

        // Makro Komut (Routine) Oluşturma
        Routine leavingHomeRoutine = new Routine();
        leavingHomeRoutine.addCommand(lockDoor);

        // Diyelim ki ışık kapatma komutunu da ekledik
        // leavingHomeRoutine.addCommand(lightOff);

        Routine nightRoutine = new Routine();
        nightRoutine.addCommand(lightOn);
        nightRoutine.addCommand(leavingHomeRoutine); // Routine içine Routine ekledik! (Ağaç yapısı)

        // Tek bir tuşla devasa ağacı çalıştır!
        nightRoutine.execute();
    }
}
