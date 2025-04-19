package chapter3.Q22;

public class Sample {
    public static void main(String[] args) {

        // breakのないSwich文でdefaultからスタートした場合、それ以下は実行されるのかを確認
        int myAge = 29;
        switch (myAge) {
            case 22:
                System.out.println(22);

            case 23:
                System.out.println(23);

            default:
                System.out.println("それ以外");

            case 24:
                System.out.println(24);

        }
    }
}
