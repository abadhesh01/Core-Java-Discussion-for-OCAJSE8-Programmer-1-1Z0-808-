package AccessSpecifierDemo.mypkg1;

// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Access Specifiers:
     ------------------
     ------------------

     There are 4 access specifiers in java:

     Sl.No.           Access Specifier Name          Visibility Limit
     ------           ---------------------          -----------------
       1              private                        Within the class (Lowest Visisbilty Limit).
       2              default / no access            Within the package.
       3              protected                      Within the package and outside the package through inheritance.
       4              public                         Can be accessed anywhere (Highest Visibility Limit).
*/

public class ClassDemoAccessSpecifier {
   
   // private variable 
   private static String privateAccess = "Private Text"; 
   
   // default variable
   static String defaultAccess = "Default Text";
   
   // protected variable
   protected static String protectedAccess = "Protected Text";

   // public variable
   // As the order of the modifiers does not matter, we can write "static public" instead of "public static".
   static public String  publicAccess = "Public Text"; 

   public static void main(String[] args) {
    
       System.out.println(privateAccess);
       System.out.println(defaultAccess);
       System.out.println(protectedAccess);
       System.out.println(publicAccess);

   }
}
