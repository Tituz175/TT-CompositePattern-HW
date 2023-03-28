public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "breakfast menu");
        MenuComponent dinerMenu = new Menu("ObjectTown menu", "lunch menu");
        MenuComponent cafeMenu = new Menu("Cafe menu", "lunch menu");
        MenuComponent dessertMenu = new Menu("dessert menu", "enjoy dinner!!");

        MenuComponent allMenus = new Menu("all menus", "all menus");

        MenuComponent lunchMenus = new Menu("lunch menus", "lunch menus");

        cafeMenu.add(new MenuItem("VBLT","Beets, Lemon, Tots", true, 2.09));
        cafeMenu.add(new MenuItem("BLT","Bacon, Lettuce, Tomato", false, 3.09));

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("ET Pancakes", "Eggs, Toast, Pancakes",true, 2.09));
        pancakeHouseMenu.add(new MenuItem("Pancakes", "Pancakes",true, 2.09));
        pancakeHouseMenu.add(new MenuItem("ET", "Eggs & Toast",true, 2.09));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Lumpy Pancakes",false, 2.09));

        dinerMenu.add(new MenuItem("pasta", "pasta with bread",true,2.90));
        dinerMenu.add(new MenuItem("pasta meat", "pasta with meatballs",false,3.89));

        dinerMenu.add(dessertMenu);
        lunchMenus.add(dinerMenu);
        lunchMenus.add(cafeMenu);

        dessertMenu.add(new MenuItem("apple pie", "apple with",true, 1.59));


        WaiterBot waiterBotall = new WaiterBot(allMenus);
//        waiterBotall.print();

        WaiterBot waiterBotBreakfast = new WaiterBot(pancakeHouseMenu);
        waiterBotBreakfast.print();

        WaiterBot waiterBotLunch = new WaiterBot(lunchMenus);
        waiterBotLunch.print();

        WaiterBot waiterBotDesserts = new WaiterBot(dessertMenu);
        waiterBotDesserts.printVegetarianMenu();

        waiterBotall.printVegetarianMenu();

    }
}