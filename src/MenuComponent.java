public interface MenuComponent {
    void add(MenuComponent component);
    void remove(MenuComponent component);
    MenuComponent getChild(int i);
    String getName();
    String getDescription();
    boolean isVegetarian();
    double getPrice();
    void print(boolean vegetarian);
    IIterator createIterator();
}
