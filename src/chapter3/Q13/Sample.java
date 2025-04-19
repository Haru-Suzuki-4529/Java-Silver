package chapter3.Q13;

public class Sample {
    public static void main(String[] args) {
        String str1 = "Sample";
        String str2 = "Sample";
        String str3 = new String("Sample");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
