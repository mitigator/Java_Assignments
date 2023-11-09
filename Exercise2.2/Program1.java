import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");

        String str=sc.next();
        
        StringBuffer stringBuffer = new StringBuffer(str);

        stringBuffer.append("Hello World");
        System.out.println();
        System.out.println("1. append(): " + stringBuffer);
        System.out.println();

        stringBuffer.insert(7, "Java ");
        System.out.println("2. insert(): " + stringBuffer);
        System.out.println();

        stringBuffer.replace(7, 11, "Programming");
        System.out.println("3. replace(): " + stringBuffer);
        System.out.println();
        stringBuffer.delete(7, 18);
        System.out.println("4. delete(): " + stringBuffer);
        System.out.println();
        char charAtIndex = stringBuffer.charAt(0);
        System.out.println("5. charAt(0): " + charAtIndex);
        System.out.println();
        stringBuffer.setCharAt(0, 'J');
        System.out.println("6. setCharAt(0): " + stringBuffer);
        System.out.println();
        int length = stringBuffer.length();
        System.out.println("7. length(): " + length);
        System.out.println();
        int capacity = stringBuffer.capacity();
        System.out.println("8. capacity(): " + capacity);
        System.out.println();
        stringBuffer.ensureCapacity(20);
        System.out.println("9. ensureCapacity(20): " + stringBuffer);
        System.out.println();
        String str1 = stringBuffer.toString();
        System.out.println("10. toString(): " + str1);
        System.out.println();
        String substring1 = stringBuffer.substring(2);
        System.out.println("11. substring(2): " + substring1);
        System.out.println();
        String substring2 = stringBuffer.substring(2, 6);
        System.out.println("12. substring(2, 6): " + substring2);
    }
}
