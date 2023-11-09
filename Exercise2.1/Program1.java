public class Program1 {
    public static void main(String[] args) {
        String inputString = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        System.out.println();
        System.out.println("charAt(0): " + inputString.charAt(0));
        System.out.println();
        
        System.out.println("compareTo: " + inputString.compareTo("Another string"));
        System.out.println();
        System.out.println("concat: " + inputString.concat(" - Additional content"));
        System.out.println();
        System.out.println("contains 'villages': " + inputString.contains("villages"));
        System.out.println();
        System.out.println("endsWith 'alternative': " + inputString.endsWith("alternative"));
        System.out.println();
        System.out.println("equals 'Another string': " + inputString.equals("Another string"));
        System.out.println();
        System.out.println("equalsIgnoreCase 'WE REALIZES...': " + inputString.equalsIgnoreCase("WE REALIZES..."));
        System.out.println();
        System.out.println("format: " + String.format("Formatted string: %s", inputString));
        System.out.println();
        System.out.println("getBytes: " + new String(inputString.getBytes()));
        System.out.println();
        char[] charArray = new char[10];
        inputString.getChars(0, 10, charArray, 0);
        System.out.println("getChars: " + new String(charArray));
        System.out.println();
        System.out.println("indexOf 'villages': " + inputString.indexOf("villages"));
        System.out.println();
        System.out.println("intern: " + inputString.intern());
        System.out.println();
        System.out.println("isEmpty: " + inputString.isEmpty());
        System.out.println();
        System.out.println("join: " + String.join("-", "A", "B", "C"));
        System.out.println();
        System.out.println("lastIndexOf 'the': " + inputString.lastIndexOf("the"));
        System.out.println();
        System.out.println("length: " + inputString.length());
        System.out.println();
        System.out.println("replace: " + inputString.replace("thriving", "flourishing"));
        System.out.println();
        System.out.println("replaceAll 'l': " + inputString.replaceAll("l", "L"));
        System.out.println();
        System.out.println("split: " + String.join(", ", inputString.split(" ")));
        System.out.println();
        System.out.println("startsWith 'We': " + inputString.startsWith("We"));
        System.out.println();
        System.out.println("substring(10, 20): " + inputString.substring(10, 20));
        System.out.println();
        System.out.println("toLowerCase: " + inputString.toLowerCase());
        System.out.println();
        System.out.println("toUpperCase: " + inputString.toUpperCase());
        System.out.println();
        System.out.println("trim: " + inputString.trim());
        System.out.println();
        System.out.println("valueOf: " + String.valueOf(12345));
        System.out.println();
    }
}
