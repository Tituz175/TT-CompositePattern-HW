import java.util.ArrayList;

public class CompositeIterator implements IIterator{

    ArrayList menuItems;
    int position = 0;

    public CompositeIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size())
        {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
