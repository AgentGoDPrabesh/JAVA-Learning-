import java.util.Arrays;

public class Datatype{

  public static void main (String []args){
    // Varaiables -> variables are like conatainers where value can store 
    // Datatypes -> The type of data that variable can hold
    // java -> java is statically typed language, which means every variable must have specific datatype before use.
    // Tpyes of Datatype:
      // 1. primitive datatype: It specifies the type and kind of value it can hold. The difference types are:
           // a.byte: (size: 1 byte, Range: -127 to 128) 
           byte byteexample = 100;
           System.out.println(byteexample);
           // b.short: (size: 2bytes, Range: -32, 768 to 32,767)
           short shortexample =10000;
           System.out.println(shortexample);
           // c.Int: (size: 4bytes, Range: -2^31 to 2^31-1)
           int intexample = 1000000000;
           System.out.println(intexample);
           // d.long: (size: 8bytes)
           long longexample = 100000000000000L;
           System.out.println(longexample);
           //  e.float size=4 byte
           //  Minimum value (negative): -3.4028235E38 (approx. -2^128)
           // Maximum value (positive): 3.4028235E38 (approx. 2^128)
           float floatexample = 1233.34f;
           System.out.println(floatexample);
           // f.double size=8 byte
           // Minimum value (negative): -4.9E-324 (approx. -2^
           double doubleexample = 123.34;
           System.out.println(doubleexample);
           //  g.boolean(true or false)
           // size=1byte
           boolean booleanexample = true;
           System.out.println(booleanexample);
           // h.char (store the character)
           // size=1byte
           char charexample = 'A';
           System.out.println(charexample);


    //2.Non primitve datatype: These datatype refers to object or array
          // a.String: sequence of character of characters
          String collegeName = "Nepathya college";
          System.out.println(collegeName);
          // b. Array: Collection of elements with same datatype
          int[] arrayOfNumbers = {1,2,43,677};
          System.out.println(Arrays.toString(arrayOfNumbers));
          //c. class: Blueprint of an object 
          //d. Enum: Constants values in object (eg;dropdown in gender field (male, famale))
          // e.Constants: const are the keywords whose values cannot be reassigned;  
           float VALUE_OF_PI = 3.14f;
           System.out.println(VALUE_OF_PI);
          // f. Indentifier

          // g. Literals: 
          int firstNumber = 40; //integer literal
          boolean isActive = false; //


  


  }
}