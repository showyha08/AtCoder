package abc351

// AC
// https://atcoder.jp/contests/abc351/tasks/abc351_b
fun main() {
    val n = readln().toInt()
    val a = mutableListOf<String>()
    repeat(n){
        a.add(readln())
    }
    val b = mutableListOf<String>()
    repeat(n){
        b.add(readln())
    }

    for (i in 0 until n){
        if(a[i] != b[i]){
            val aArr = a[i].toCharArray()
            val bArr = b[i].toCharArray()
            for (j in 0 until aArr.size){
                if (aArr[j] != bArr[j])
                {
                    print("${i+1} ${j+1}")
                    return
                }
            }
        }
    }
}