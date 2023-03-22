
// Author: Abadhesh Mishra [Employee Id: 8117322]

package Basic;

@SuppressWarnings("all")
public class BasicObservation6 {
   public static void main(String[] args) {

      System.out.println("\n\n");
    
      byte byteArray[] = {(byte)130, (byte)-130};

      System.out.println("byteArray[].length = " + byteArray.length);
      /*
          'byte' data range: -128[min] to 127[max]
           
          byteArray[0]:
          -------------
          Converting  130 to 'byte' (Overflow condition):
          As 130 > 127[max]; Let x = (130 - 127) = 3 
          Hence, result = -128[min] + x - 1
                        = -128 + 3 - 1
                        = -128 + 2
                        = -126 (Answer)

          byteArray[1]:
          -------------
          Converting  -130 to 'byte' (Underflow condition):
          As -130 < -128[min]; Let x = -128 - (-130) = -128 + 130 = 2
          Hence, result = 127[max] - x + 1
                        = 127 - 2 + 1 
                        = 127 -1
                        = 126 (Answer)
      */
      System.out.println("byteArray[0] = " + byteArray[0]); // OUTPUT: -126
      System.out.println("byteArray[1] = " + byteArray[1]); // OUTPUT: 126

      int $;
      //int _; // Compilation Error
      int $_;
      int _$;
      int _1;
      int $1;

      System.out.println("\n\n");
   } 
}
