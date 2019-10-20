package main

fun main(args: Array<String>) {

    // Javaでいう三項演算子(fuga? true : false)は使えないみたいですね

    // kotlinでは、inという範囲演算子(SQLのbetweenみたいな?)が使用できる
    val i = 10
    // 1~20の範囲
    if (i in 1..20) {
        println("iは1~20の範囲内です。")
    }
    // ArrayOf(...)を組み合わせて使うこともできる(SQLのinみたいな?)
    val j = 30
    // 15, 30, 45のいずれか
    if (j in arrayOf(15, 30, 45)) {
        println("jは15, 30, 45のどれかです。")
    }

    // ビット演算子(Javaでいう & や | など...)
    // &
    println(10 and 10)
    // |
    println(5 or 50)

}