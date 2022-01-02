public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe", "Deluxe Meat", 19.10,  "Deluxe Bread");
        super.addHamburgerAddition1("Fixing", 0);
        super.addHamburgerAddition2("Chips", 0);
        super.addHamburgerAddition3("Drink", 0);
    }
    @Override
    public void addHamburgerAddition1(String addition1Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
}
