public class HandlingString_Example {
  public static void main(String[] args) {

    // 1. Concatenation
    String firstName = "Prabesh";
    String lastName = "Khadka";
    String fullName = firstName + " " + lastName;
    System.out.println("Concatenation example = " + fullName);

    // 2. Conversion: int to String
    int number = 123;
    String stringNumber = String.valueOf(number);
    System.out.println("Converted number to string = " + stringNumber);
    System.out.println("Class type of converted string = " + stringNumber.getClass().getName());

    // 3. Extracting Character 
    String name = "praaa";
    char firstChar = name.charAt(0);
    char lastChar = name.charAt(name.length() - 1); // Safe last character access
    System.out.println("First character of the string = " + firstChar);
    System.out.println("Last character of the string = " + lastChar);

    // 4. String comparison
    String s1 = "java";
    String s2 = "java";
    String s3 = new String("java");
    String s4 = "JAVA";

    // Using '=='
    System.out.println("s1 == s2: " + (s1 == s2));   // true (same reference)
    System.out.println("s1 == s3: " + (s1 == s3));   // false (different object)

    // Using 'equals' and 'equalsIgnoreCase'
    System.out.println("s1.equals(s3): " + s1.equals(s3));               // true
    System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true

    // 5. Searching in a string
    String text = "java is a programming language";
    boolean containsJava = text.contains("java");
    System.out.println("Text contains 'java': " + containsJava);

    // 6. Modifying string
    String originalString = "    java programming  ";

    // Trim whitespace
    String trimmedString = originalString.trim();
    System.out.println("Trimmed string: " + trimmedString);

    // Replace text
    String replacedString = originalString.replace("java", "python");
    System.out.println("Replaced string: " + replacedString);

    //conact 
    String newString = replacedString.concat("is used for Artifical intelligence ");
    System.out.println("Concatenated string: " + newString);
    // Python programming is used for artifical intelligence 

    //string buffer
    StringBuffer stringBuffer = new StringBuffer("hello");
    stringBuffer.append(" world");
    StringBuffer.insert(offset:5,str:"java");
    System.out.println("Modified string buffer:" + stringBuffer);
  }
}
