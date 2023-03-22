package AccessSpecifierDemo.mypkg1;

// Author: Abadhesh Mishra [Employee Id: 8117322]

public class MyAccess {
    public static void main(String[] args) {
    
        // Compilation Error. // "private" members cannot be accessed outside their class.
        //System.out.println(ClassDemoAccessSpecifier.privateAccess);
        
        // Below statements are executed successfully.
        System.out.println(ClassDemoAccessSpecifier.defaultAccess);
        System.out.println(ClassDemoAccessSpecifier.protectedAccess);
        System.out.println(ClassDemoAccessSpecifier.publicAccess);
 
    }
}
