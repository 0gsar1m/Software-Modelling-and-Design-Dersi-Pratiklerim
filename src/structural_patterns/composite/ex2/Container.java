package structural_patterns.composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class Container implements IShippable {
    private List<IShippable> container = new ArrayList<>();
    String containerName;

    public Container(String containerName) {
        this.containerName = containerName;
    }

    @Override
    public void showDetails() {
        for (IShippable c : container) {
            c.showDetails();
        }
    }

    public void addToContainer(IShippable cargo) {
        container.add(cargo);
    }

}
