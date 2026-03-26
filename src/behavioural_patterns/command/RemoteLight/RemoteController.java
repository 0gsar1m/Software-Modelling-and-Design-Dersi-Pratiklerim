package behavioural_patterns.command.RemoteLight;

public class RemoteController {

    private ICommand command;

    public void pressButon(){
        System.out.println("Pressed remote button, checking inside of ICommand command of RemoteController class");
        if(command != null) {
            command.execute();
        }else {
            System.out.println("No command set for RemoteController class");
        }
    }

    public void setCommand(ICommand command){
        this.command = command;
    }

}
