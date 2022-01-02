public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Healthy Bread");
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        if (healthyExtra1Price < 0) {
            System.out.println("Addition of " + healthyExtra1Name + " can't have negative price.");
        } else{
            this.healthyExtra1Name = healthyExtra1Name;
            this.healthyExtra1Price = healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for " + healthyExtra1Price);
        }
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        if (healthyExtra2Price < 0) {
            System.out.println("Addition of " + healthyExtra2Name + " can't have negative price.");
        } else{
            this.healthyExtra2Name = healthyExtra2Name;
            this.healthyExtra2Price = healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for " + healthyExtra2Price);
        }
    }
    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
