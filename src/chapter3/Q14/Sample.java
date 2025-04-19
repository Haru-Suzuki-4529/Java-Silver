package chapter3.Q14;

public class Sample {
    public static void main(String[] args) {
        String str1 = "Sample";
        String str2 = new String("Sample");

        System.out.println(str1.intern() == str2.intern()); // true
        System.out.println(str1 == str2.intern()); // true
        System.out.println(str1.intern() == str2); // false
    }
}
