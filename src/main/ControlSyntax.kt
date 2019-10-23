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


    // 多岐にわたる分岐はwhenを使う
    // Javaのswitch...caseに似ているが、breakが要らないなど色々違う
    val point = 200
    when (point) {
        2 -> {
            println("pointは2")
        }
        20 -> {
            println("pointは20")
        }
        200 -> {
            println("pointは200")
        }
        // どれにも当てはまらないはelseを書く
        else -> {
            println("pointは2, 20, 200以外")
        }
    }

    // ifと同様に、代入時に書くこともできる
    val point2 = when (point) {
        20 -> {
            "pointは20"
        }
        else -> {
            "pointは20ではない"
        }
    }


    //  複数の値や範囲を指定することもできる
    val testPoint = 95
    var result = if (testPoint in 80..100) {
        "80~100"
    } else {
        "79以下"
    }

    // whenも同じような感じ
    result = when (testPoint) {
        // 複数を条件にできる
        99, 100 -> {
            "99, 100"
        }

        in 70..98 -> {
            "70~98"
        }

        in 50..69 -> {
            "50~69"
        }
        // 否定も使える
        !in 50..100 -> {
            "50~100ではない"
        }
        else -> {
            "不明"
        }
    }


    // 型による分岐も書くことができる(JavaでいうinstanseOf的な)
    val obj: Any = "ほげほげ"
    when (obj) {
        // 型判定後は、それぞれの型に応じたメンバー/演算子を呼び出せる
        // (スマートキャスト)

        is String -> {
            println(obj[0])
        }
        is Int -> {
            println(obj)
        }
        else -> {
            "?"
        }
    }  // 表示:ほ


    // 引数を取らないwhenも書くことができる
    val xx = 10
    val yy = 15

    when {
        xx >= 10 -> println("xxは10以上")
        xx <= 5 && yy >= 15 -> println("xxは5未満, yyは15以上")
        else -> println("その他")
    }
}