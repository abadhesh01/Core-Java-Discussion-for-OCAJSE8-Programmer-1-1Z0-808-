package AccessSpecifierDemo.mypkg2;

// Author: Abadhesh Mishra [Employee Id: 8117322]

import AccessSpecifierDemo.mypkg1.ClassDemoAccessSpecifier;

public class MyAccess {
    public static void main(String[] args) {
    
        // Compilation Error. // "private" members cannot be accessed outside their class as well as package.
        //System.out.println(ClassDemoAccessSpecifier.privateAccess);
        
        // Compilation Error. // "default" members cannot be accessed outside their package.
        //System.out.println(ClassDemoAccessSpecifier.defaultAccess);

        // Compilation Error. // "protected" members cannot be accessed outside their package.
        //System.out.println(ClassDemoAccessSpecifier.protectedAccess);

        // Below statement is executed successfully.
        System.out.println(ClassDemoAccessSpecifier.publicAccess);
 
    }
}
