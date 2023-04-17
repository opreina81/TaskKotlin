fun main() {
    val numbers: MutableList<Int> = mutableListOf()
    print(numbers.square())
}

fun <Int> MutableList<Int>.square(): MutableList<kotlin.Int> {
    val numbers: MutableList<kotlin.Int> = mutableListOf(1, 2, 3, 4, 5, 9, 16, 25, 11)
    numbers.indices.forEach { i ->
        numbers[i] = numbers[i] * numbers[i]
    }
    return numbers
}