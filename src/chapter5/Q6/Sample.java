package chapter5.Q6;

public class Sample {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String str = null;

        // println(String x)の中でnullチェックを行い、
        // nullなら"null"を表示するという処理が記載されているため、ぬるぽが起こらない
        System.out.println(str);

        // strがnullの状態でtoString()を呼んでいるため、ぬるぽが発生する
        System.out.println(str.toString());
    }
}
