fun main() {
    val numbers: MutableList<Int> = mutableListOf()
    print(numbers.square())
}

fun <Int> MutableList<Int>.square(): MutableList<kotlin.Int> {
    val numbers: MutableList<kotlin.Int> = mutableListOf(1, 4, 9, 16, 25)
    numbers.indices.forEach { i ->
        numbers[i] = numbers[i] * numbers[i]
    }
    return numbers
}
