
//Второй вариант решения задачи 1, лаконичней, но первый мне нравится больше.
class ListInSquare(val numbers: MutableList<Int>) {
}

fun main() {
    ListInSquare(mutableListOf(1, 4, 9, 16, 25)).square()
}

fun ListInSquare.square() {
    numbers.indices.forEach { i ->
        print("${numbers[i] * numbers[i]}\t")
    }
}

