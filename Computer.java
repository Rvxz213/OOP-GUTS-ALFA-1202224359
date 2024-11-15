public class Computer {
    protected String name;
    protected String processor;
    protected int ram;

    public Computer(String name, String processor, int ram) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
    }

    public void information() {
        System.out.println("Computer Information:");
        System.out.println("Name: " + name);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
    }
}