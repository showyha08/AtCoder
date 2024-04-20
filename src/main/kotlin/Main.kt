fun main() {
    val s = readln() // 3~10^5の文字列
    val t = readln().lowercase() // 3文字列

    // 3文字列の文字を含むかチェック
    var i = 0;
    for (c in s){
        // 見つかったらtを進める、含むかではなく先頭から見ないとNG
        if(t[i] == c){
            i++
            // 3文字全てあった場合
            if (i == 3){
                println("Yes")
                return
            }
        }
    }


    // 2文字とXの場合
    if (i ==2 && t[2] == 'x'){
        println("Yes")
        return
    }

    println("No")

}

