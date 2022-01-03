package BillsBurger;

//A simple comment
//Another simple comment
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic", "Beef", 10.5,  "White Bread");
        System.out.println("Price: " + hamburger.itemizeHamburger());
        hamburger.addHamburgerAddition1("Cheese", 0.1);
        System.out.println("Price: " + hamburger.itemizeHamburger());
        hamburger.addHamburgerAddition2("Onion", 0.2);
        hamburger.addHamburgerAddition3("Salad", 0.3);
        hamburger.addHamburgerAddition4("Sauce", 0.4);
        System.out.println("Price: " + hamburger.itemizeHamburger());
        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println(deluxe.itemizeHamburger());
        HealthyBurger healthy = new HealthyBurger("Chicken", 50.1);
        System.out.println(healthy.itemizeHamburger());
        healthy.addHealthyAddition1("Salad", 5.1);
        healthy.addHealthyAddition2("tomatoes", 3.2);
        System.out.println(healthy.itemizeHamburger());
    }
}
