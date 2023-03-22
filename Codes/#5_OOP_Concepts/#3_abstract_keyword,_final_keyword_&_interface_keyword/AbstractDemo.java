
// Author: Abadhesh Mishra [Employee Id: 8117322]

// Reference: "Core Java Discussion [Batch 41 and 47 (Team 6)]/Notes/#4_abstract_keyword,_final_keyword_&_interface_keyword.txt"

abstract class AbstractModel
{
    // "protected" and "static" field.
    protected static int modelCount;
    
    // "protected", "static" and "final" field.
    // "final" field(s) must be initialized manually.
    final protected static String name = "AbstractModel";

    // An "abstract" class can only contain "abstract" method(s). 
    abstract protected Number writeTextInConsole(String text);
    abstract protected Object writeTextInConsole(String text1, String text2);

    // An "abstract" class can contain "static" method(s) also.
    static String getModelCount()
    {
        return name + ": " + modelCount;
    }

    // An "abstract" class can contain "final" method(s) also.
    final String getName()
    {
        return name;
    }

    // An "abstract" class can contain default constructor but, cannot be instantiated.
    protected AbstractModel()
    {
        super();
        // "final" fields cannot be updated.
        //name = this.getClass().getName(); // Compilation Error.
        System.out.println(this.getClass().getName() + ": " + ++modelCount); 
    }

    // An "abstract" class can contain parameterized constructor but, cannot be instantiated.
    protected AbstractModel(String message)
    {
        super();
        System.out.println(message);
    }
}



/*  The class extending an "abstract" class should either implement all of it's "abstract" methods
    or should declare itself as an "abstract" class or both. */
abstract class MyModel extends AbstractModel
{
    // Redefining static method getModelCount().
    protected static String getModelCount()
    {
        return "MyModel" + ": " + modelCount;
    }

    // Default Constructor
    protected MyModel()
    {
      super();
    }

    // Parameterized CXonstructor
    protected MyModel(String message)
    {
      super(message);
    }

    // Overridden "abstract" method.
    @Override
    public Double writeTextInConsole(String text) {
      System.out.println(text);
      return 0d;  
    }
}



/*  The class extending an "abstract" class should either implement all of it's "abstract" methods
    or should declare itself as an "abstract" class or both. */
@SuppressWarnings("all")
public class AbstractDemo extends MyModel
{
  public static void main(String[] args) {

     // Code Block 1
     System.out.println("\n\n[Code Block 1]\ngetModelCount()=> " + getModelCount());   
     System.out.println("AbstractDemo.getModelCount()=> " + AbstractDemo.getModelCount());
     System.out.println("AbstractModel.getModelCount()=> " + AbstractModel.getModelCount());
     System.out.println("MyModel.getModelCount()=> " + MyModel.getModelCount() + "\n\n");

     AbstractModel aModel = new AbstractDemo();
     MyModel myModel = new AbstractDemo();
     AbstractDemo demo = new AbstractDemo();

     // Code Block 2
     System.out.println("\n\n[Code Block 2]\naModel.getModelCount()=> " + aModel.getModelCount());
     System.out.println("myModel.getModelCount()=> " + myModel.getModelCount());
     System.out.println("demo.getModelCount()=> " + demo.getModelCount() + "\n\n");

     // Code Block 3
     System.out.println("[Code Block 3]");
     System.out.println("aModel.writeTextInConsole(aModel.getClass().getName())=> " 
                       + aModel.writeTextInConsole(aModel.getClass().getName()));
     System.out.println("myModel.writeTextInConsole(myModel.getClass().getName())=> " 
                       + myModel.writeTextInConsole(myModel.getClass().getName()));
     System.out.println("demo.writeTextInConsole(demo.getClass().getName())=> " 
                       + demo.writeTextInConsole(demo.getClass().getName()) + "\n\n");                 
                       
     // Code Block 4
     System.out.println("[Code Block 4]"); 
     System.out.println("aModel.writeTextInConsole(aModel.toString(), Integer.toString(aModel.hashCode()))=> " 
                       + aModel.writeTextInConsole(aModel.toString(), Integer.toString(aModel.hashCode())));
     System.out.println("myModel.writeTextInConsole(myModel.toString(), Integer.toString(myModel.hashCode())))=> " 
                       + myModel.writeTextInConsole(myModel.toString(), Integer.toString(myModel.hashCode())));                                 
     System.out.println("demo.writeTextInConsole(demo.toString(), Integer.toString(demo.hashCode()))=> " 
                       + demo.writeTextInConsole(demo.toString(), Integer.toString(demo.hashCode())) + "\n\n");


     // Code Block 5
     System.out.println("[Code Block 5]");
     System.out.println("aModel.getName()=> " + aModel.getName());
     System.out.println("myModel.getName()=> " + myModel.getName());
     System.out.println("demo.getName()=> " + demo.getName() + "\n\n");  

     // Code Block 6
     /* 
        In Java, we cannot create the object(s) of "abstract" class and "interface".
        But, technically it's possible through "anonymous inner class".
     */
     // Annonymous Inner Class
     AbstractModel abstractModel = new AbstractModel() {

        @Override
        public Number writeTextInConsole(String text) {
            System.out.println("Anonymous Inner Class Behaviour \"A\"");
            return null;
        }

        @Override
        public Object writeTextInConsole(String text1, String text2) {
            System.out.println("Anonymous Inner Class Behaviour \"B\"");
            return null;
        }
        
        public static String getModelCount()
        {
            return "Not Allowed";
        }

        public void abstractMessage()
        {
            System.out.println(this.getClass().getModifiers() + " : " + this);
        }
     };

     System.out.println("\n\n[Code Block 6]");
     System.out.println("abstractModel.getName()=> " + abstractModel.getName());
     System.out.println("abstractModel.writeTextInConsole(null)=> " 
                       + abstractModel.writeTextInConsole(null));
     System.out.println("abstractModel.writeTextInConsole(null, null)=> " 
                       + abstractModel.writeTextInConsole(null, null));
     // abstractModel.abstractMessage(); // Compilation Error. Must be declared in "abstract" class also.
     System.out.println("abstractModel.getModelCount()=> " + abstractModel.getModelCount() + "\n\n");
    }

  // Redefining static method getModelCount().
  public static String getModelCount()
  {
      return "AbstractDemo" + ": " + modelCount;
  }

  // Overridden "abstract" method.
  @Override
  protected Number writeTextInConsole(String text1, String text2) {
    System.out.println("\n[1]: " + text1 + "\n[2]: " + text2 + "\n");   
    return 0;
  }

}