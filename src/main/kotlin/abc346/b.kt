package abc346

// https://atcoder.jp/contests/abc346/tasks/abc346_b
fun main() {
    val s = "wbwbwwbwbwbw"
    val (w, b) = readln().split(" ").map { it.toInt() }

    for (i in 0 until s.length)
    {
        var wc = 0
        var wb = 0

        for (j in 0..w+b)
        {
            // あまり？
            if(s[(i+j) %s.length] == 'w')
            {wc++}
            else{ wb++}
        }

    }


}