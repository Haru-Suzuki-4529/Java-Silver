package chapter2.Q6;

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {

        // varについて
        // varを使った変数宣言
        var a = 6;

        // ラムダ式からは型を推論できない(コンパイルエラー)
        // var b = () -> {}

        // 配列の初期化子は型宣言から型を推論しているので{}のみで型推論できない(コンパイルエラー)
        // var c = {1,2,3}

        // <>ジェネリクスは何もしてされない場合は<Object>となる。
        var d = new ArrayList<>();
        System.out.println(d.getClass().getSimpleName());

        // varはローカル変数の宣言時のみ使用可能
        // コンパイル字に型推論が行われる。

    }
}
