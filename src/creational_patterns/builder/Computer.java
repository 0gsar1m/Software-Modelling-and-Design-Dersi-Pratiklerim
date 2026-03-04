package creational_patterns.builder;

public class Computer {
    private String cpu;
    private int ram;

    private boolean hasGraphicsCard;
    private boolean hasSSD;

    private Computer(Builder builder){ //IT'S PERFECT! DAMN
        //The moment you call Computer build(),
        // It'll return a Computer obj that has hella parameters already setten by builder!
        System.out.println("builder params copied to Computer constructor");
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasSSD = builder.hasSSD;
    }

public static class Builder{
    private String cpu;
    private int ram;

    private boolean hasGraphicsCard;
    private boolean hasSSD;

    public Builder(String cpu, int ram){
        this.cpu = cpu;
        this.ram = ram;
    }

    public Builder setSSD(boolean hasSSD){
        this.hasSSD = hasSSD;
        System.out.println("hasSSD assigned on 'Builder' side");
        return this; // "this" is the key! if u say returnhasSSD etc,
        // It'll have true. When u chain at Main,
        // It'll go something like: this was hasSSD->"true".setSSD
        // but, we want to go like BuilderObj.setSSD (we want to set chained into Builder that on the scene.)
    }
    public Builder setGraphicsCard(boolean hasGraphicsCard){
        this.hasGraphicsCard = hasGraphicsCard;
        System.out.println("hasGraphicsCard assigned on 'Builder' side");
        return this; //When we use setGraphicsCard,
        // It'll be applied into a Builder that was setten by hasSSD before!
    }

    public Computer build(){
        System.out.println("Constructor triggered by return new Computer(Builder this)");
        return new Computer(this);
    }
}


}
