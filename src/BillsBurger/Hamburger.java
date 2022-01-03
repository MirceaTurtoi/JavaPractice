package BillsBurger;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name = "";
    private String addition2Name = "";
    private String addition3Name = "";
    private String addition4Name = "";
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
        public Hamburger(String name, String meat, double price, String breadRollType) {
            if (price < 0) {
                System.out.println("Can't have negative price.");
            } else {
                this.name = name;
                this.meat = meat;
                this.breadRollType = breadRollType;
                this.price = price;
            }
    }
    public void addHamburgerAddition1(String addition1Name, double price) {
        if (price < 0) {
            System.out.println("Addition of " + addition1Name + " can't have negative price.");
        } else{
            this.addition1Name = addition1Name;
            this.addition1Price = price;
            System.out.println("Added " + addition1Name + " for " + price);
        }
    }
    public void addHamburgerAddition2(String addition2Name, double price) {
        if (price < 0) {
            System.out.println("Addition of " + addition2Name + " can't have negative price.");
        } else{
            this.addition2Name = addition2Name;
            this.addition2Price = price;
            System.out.println("Added " + addition2Name + " for " + price);
        }
    }
    public void addHamburgerAddition3(String addition3Name, double price) {
        if (price < 0) {
            System.out.println("Addition of " + addition3Name + " can't have negative price.");
        } else{
            this.addition3Name = addition3Name;
            this.addition3Price = price;
            System.out.println("Added " + addition3Name + " for " + price);
        }
    }
    public void addHamburgerAddition4(String addition4Name, double price) {
        if (price < 0) {
            System.out.println("Addition of " + addition4Name + " can't have negative price.");
        } else{
            this.addition4Name = addition4Name;
            this.addition4Price = price;
            System.out.println("Added " + addition4Name + " for " + price);
        }
    }
    public double itemizeHamburger(){
        System.out.print(name + " hamburger on " + breadRollType + " with " + meat + ", price: ");
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
