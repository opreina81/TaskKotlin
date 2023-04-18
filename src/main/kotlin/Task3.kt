import kotlin.math.roundToInt

fun main() {
    try {
        val numbers: List<Double?> = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
        print(sumOfCollection(numbers))
    } catch (e: Exception) {
        println(e.message)
    }
}

fun sumOfCollection(numbers: List<Double?>): Double {
    var sum = 0.0
    val parityCheck = numbers.filter { it!!.toInt() % 2 == 0 }.map { it!! * it!! }
    val checkingForOdd = numbers.filter { it!!.toInt() % 2 != 0 }.map { it!! / 2 }
    val newList = parityCheck.plus(checkingForOdd)
    newList
        .asSequence()
        .filter { it!! < 25 }
        .filterNotNull()
        .sortedDescending()
        .take(10)
        .toList()
        .forEach { sum += it }

    return (sum * 100.0).roundToInt() / 100.0

}
