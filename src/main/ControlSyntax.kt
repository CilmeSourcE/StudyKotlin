package main

fun main(args: Array<String>) {

    // if
    val num = 108
    if (num == 0) {

        println("numは0")
    } else if (num == 100) {

        println("numは100")
    } else {

        println("numは0でも100でもない")
    }

    // ifは、変数へ代入するときにも書ける
    // その場合はelse文を必ず書かないとエラー
    val x = 100
    val y = if (x == 0) {
        "xは0"
    } else if (x == 100) {
        "xは100"
    } else {
        "xは0以外"
    }
    // 一文で書ける場合は、ブロックを省略できる
    val z = if (x == 0) "xは0" else if (x == 100) "xは100" else "xは0か100以外"



}