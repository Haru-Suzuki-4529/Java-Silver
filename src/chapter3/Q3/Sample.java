package chapter3.Q3;

public class Sample {
    public static void main(String[] args) {
        byte a = 127;
        // byte b = 128; はコンパイルエラー
        // byte b = (byte) 128はコンパイルと実行はできるがオーバーフロー;suzu
        int b = 10;
        System.out.println(b++ + ++b * ++b);
        System.out.println(10 + 12 * 13);
    }
}
