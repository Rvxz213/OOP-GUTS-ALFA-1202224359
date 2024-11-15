public class VIPComputer extends Computer {
    private String graphicsCard;

    public VIPComputer(String name, String processor, int ram, String graphicsCard) {
        super(name, processor, ram);
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("Graphics Card: " + graphicsCard);
    }

    public void login(String username, String password) {
        System.out.println("Logging in with username: " + username);
    }

    public void playing(String game) {
        System.out.println("Playing " + game + " on " + name);
    }

    public void playing(String game, int hours) {
        System.out.println("Playing " + game + " on " + name + " for " + hours + " hours");
    }
}