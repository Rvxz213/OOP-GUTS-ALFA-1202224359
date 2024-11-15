public class PremiumComputer extends VIPComputer {
    private String display;

    public PremiumComputer(String name, String processor, int ram, String graphicsCard, String display) {
        super(name, processor, ram, graphicsCard);
        this.display = display;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("Display: " + display);
    }

    public void order(int quantity) {
        System.out.println("Ordering " + quantity + " " + name + "(s)");
    }

    public void addService(String service) {
        System.out.println("Adding service: " + service + " to " + name);
    }

    public void addService(String service, int months) {
        System.out.println("Adding service: " + service + " for " + months + " months to " + name);
    }
}