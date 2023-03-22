
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class Observation11 {

    private final String text = "Private Text";

    @SuppressWarnings("all")
    public static void main(String[] args) {

        System.out.println("\n");

        Observation11 parentReference = new Observation11Child();
        Observation11Child childReference = (Observation11Child) parentReference; 
        System.out.println("[" + parentReference + " ] Text: " + parentReference.text);
        // Compilation Error
        //System.out.println("[" + childReference + " ] Text: " + childReference.text);

        System.out.println("\n");
    }    
}

class Observation11Child extends Observation11 {}
