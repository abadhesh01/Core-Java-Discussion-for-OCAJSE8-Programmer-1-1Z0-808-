package AccessSpecifierDemo.mypkg2;

// Author: Abadhesh Mishra [Employee Id: 8117322]

import AccessSpecifierDemo.mypkg1.ClassDemoAccessSpecifier;

public class MyAccess3 extends ClassDemoAccessSpecifier {
    public static void main(String[] args) {
    
        // Compilation Error. // "private" members cannot be accessed outside their class as well as package.
        //System.out.println(ClassDemoAccessSpecifier.privateAccess);
        
        // Compilation Error. // "default" members cannot be accessed outside their package.
        //System.out.println(ClassDemoAccessSpecifier.defaultAccess);

        // Below statement is executed successfully.
        // "protected" members can be accessed outside their package only through inheritance.
        System.out.println(ClassDemoAccessSpecifier.protectedAccess);
        System.out.println(ClassDemoAccessSpecifier.publicAccess);
        
    }
}
