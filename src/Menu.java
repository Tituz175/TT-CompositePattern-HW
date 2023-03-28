import java.util.ArrayList;

public class Menu implements MenuComponent {

    private ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void print(boolean vegetarian) {
        System.out.println("Menu Name: " + getName() + ", Menu Description: "+ getDescription() + ".");
        for (Object mc : menuComponents) {
            ((MenuComponent) mc).print(vegetarian);
        }
    }

    @Override
    public IIterator createIterator() {
        return new CompositeIterator(menuComponents);
    }
}
