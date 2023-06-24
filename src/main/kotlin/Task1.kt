fun main() {
    val numbers: MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
    print(numbers.squareAllElementsMap())
}

fun MutableList<Int>.squareAllElementsMap(): MutableList<Int> {
    return map { it * it }.toMutableList()
}
