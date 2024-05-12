package abc353

fun main() {
    val (groupCnt, maxPeople) = readln().split(" ").map { it.toInt() }.toMutableList()
    val groups = readln().split(" ").map { it.toInt() }.toMutableList()
    var counter = 0;
    var norimono = 0;

    for (g in groups){
        if (norimono + g <= maxPeople){
            norimono += g
        } else {
            norimono = 0
            norimono += g
            counter++
        }
    }
    if (norimono > 0){
        counter++
    }
    print(counter)
}