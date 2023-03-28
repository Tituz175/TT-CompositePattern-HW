public class MenuItem implements MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;


    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void add(MenuComponent component) {

    }

    @Override
    public void remove(MenuComponent component) {

    }

    @Override
    public MenuComponent getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print(boolean vegetarian) {
        String veg = "";
        if (isVegetarian()) {
            veg = "(v)";
        }
        if ((vegetarian && isVegetarian() || !vegetarian)){
            System.out.println(getName() + veg + "......" + getPrice());
        }
    }

    @Override
    public IIterator createIterator() {
        return new NullIterator();
    }
}
