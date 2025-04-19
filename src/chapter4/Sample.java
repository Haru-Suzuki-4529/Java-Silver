package chapter4;

public class Sample {
    public static void main(String[] args) {

        // Objectクラスはすべてのクラス(今回は一例)の親クラスであることを確認
        String[][] array = { { "A", "B", "C" } };
        for (String[] object : array) {
            System.out.println(object);
        }
        for (Object object : array) {
            System.out.println(object);
        }
    }
}
