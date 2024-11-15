public class Main {
    public static void main(String[] args) {
        // Create a new object from the Computer class
        Computer computer = new Computer("Basic PC", "Intel i3", 8);
        
        // Call the information method from the Computer class
        computer.information();
        
        System.out.println();
        
        // Create a new object from the VIPComputer class
        VIPComputer vipComputer = new VIPComputer("Gaming PC", "AMD Ryzen 7", 16, "RTX 3070");
        
        // Call the Information methods from the VIPComputer class
        vipComputer.information();

        // Call the Login methods
        vipComputer.login("user123", "password123");

        // Call the Playing method 2x to be able to do polymorphism overloading
        vipComputer.playing("Fortnite");
        vipComputer.playing("Cyberpunk 2077", 4);
        
        System.out.println();
        
        // Create a new object from the PremiumComputer class
        PremiumComputer premiumComputer = new PremiumComputer("Workstation", "Intel Xeon", 64, "Quadro RTX 6000", "4K Ultra HD");
        
        // Call the Information methods from the PremiumComputer class
        premiumComputer.information();

        // Call the Order methods
        premiumComputer.order(2);

        // Call the AddService method 2x to be able to do polymorphism overloading
        premiumComputer.addService("Fried Noodles");
        premiumComputer.addService("Fried Noodles and an iced tea");
    }
}