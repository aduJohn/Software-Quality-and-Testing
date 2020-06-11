package TH_Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    @Override
    public void operation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println("Component on level "+level);
        for (Component c:components) {
            c.operation(level+1);
        }
    }

    @Override
    public void addChild(Component c) {
        components.add(c);
    }

    @Override
    public void removeChild(Component c) {
        components.add(c);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }
}
