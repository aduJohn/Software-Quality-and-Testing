package TH_Composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Leaf implements Component {
    @Override
    public void operation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println("Component on level "+level);
    }

    @Override
    public void addChild(Component c) {
        throw new NotImplementedException();
    }

    @Override
    public void removeChild(Component c) {
        throw new NotImplementedException();
    }

    @Override
    public Component getChild(int i) {
        throw new NotImplementedException();
    }
}
