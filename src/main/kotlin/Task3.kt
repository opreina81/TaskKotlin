import kotlin.math.roundToInt

fun main() {
    try {
        val numbers: List<Double?> = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
        print(numbersRoundToInt(sumOfCollection(numbers)))
    } catch (e: Exception) {
        println(e.message)
    }
}

fun sumOfCollection(numbers: List<Double?>): Double {

    return numbers
        .asSequence()
        .filterNotNull()
        .map { if (it.toInt() % 2 == 0) it * it else it / 2 }
        .filter { it <= 25.0 }
        .sortedDescending()
        .take(10)
        .sum()
}

fun numbersRoundToInt(numbers: Double): Double {
    return (numbers * 100.0).roundToInt() / 100.0
}
