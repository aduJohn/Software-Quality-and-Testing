package TH_Composite;

public interface Component {
    void operation(int level);
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
}
