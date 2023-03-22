
// Author: Rishabh Geete [Employee Id: 8115808]

class Monitor {

    // Attributes
    String brand;
    String model;
    double length;
    double breadth;
    boolean hdmiEnabled;
    boolean vgaEnabled;
    static String warningMessage;

    // Constructors
    Monitor() {
        System.out.println("\nMonitor default constructor: " + this);
    }
    
    Monitor(String monitorBrand, String monitorModel) {
        System.out.println("\nMonitor paramatrized constructor: " + this);
        brand = monitorBrand;
        model = monitorModel;
    }

    Monitor(String brand, String model, double length, double breadth, boolean hdmiEnabled, boolean vgaEnabled) {
        this(brand, model); // 'this()' should be the first statement if you are writing.
        System.out.println("\nMonitor paramatrized constructor: " + this);
        //this.brand = brand;
        //this.model = model;
        this.length = length;
        this.breadth = breadth;
        this.hdmiEnabled = hdmiEnabled;
        this.vgaEnabled = vgaEnabled;
    }

    // Methods and method overloading.
    void display() {
        System.out.println("display(): Nothing to display!");
    }

    void display(String message) {
        System.out.println("display(): " + message);
    }

    void display(String message, int number) {
        System.out.println("display(): [Message: " + message + ", Number: " + number + "]"); 
    }

    void display(int number, String message) {
        System.out.println("display(): [Message: " + message + ", Number: " + number + "]"); 
    }

    void showSpecs() {
        System.out.println("showSpecs(): " + this);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("HdmiEnabled: " + hdmiEnabled);
        System.out.println("VgaEnabled: " + vgaEnabled);
    }

    static String getWarningMessage() {
        return "getWarningMessage(): " + warningMessage;
    }

}

@SuppressWarnings("all")
public class ClassDemo {
    public static void main(String[] args) {
        
        //Default constructor calling.
        Monitor sampleMonitor = new Monitor();
        sampleMonitor.showSpecs();
        System.out.println(sampleMonitor);

        //Paramatrized constructor calling.
        Monitor dellLTP01 = new Monitor("Dell", "LTP01");
        dellLTP01.showSpecs();
        System.out.println(dellLTP01);

        Monitor lenevoM409 = new Monitor("Lenevo", "M409", 14.0, 10.0, true, false);
        lenevoM409.showSpecs();
        System.out.println(lenevoM409);

        System.out.println("\n\n");

        lenevoM409.display();
        lenevoM409.display("This is a sample message");

        System.out.println("\n\n"); 

        //Static variables can be called either through class name or through objects.
        System.out.println(Monitor.warningMessage); 
        System.out.println(sampleMonitor.warningMessage);
        System.out.println(dellLTP01.warningMessage);
        System.out.println(lenevoM409.warningMessage);

        System.out.println("\n\n");
        Monitor.warningMessage = "Repair through authorized service centre only."; 
        System.out.println(Monitor.warningMessage); 
        System.out.println(sampleMonitor.warningMessage);
        System.out.println(dellLTP01.warningMessage);
        System.out.println(lenevoM409.warningMessage);

        System.out.println("\n\n");

        //Static method calling.
        System.out.println(Monitor.getWarningMessage());
        System.out.println(sampleMonitor.getWarningMessage());
        System.out.println(dellLTP01.getWarningMessage());
        System.out.println(lenevoM409.getWarningMessage());

    }
    
}
