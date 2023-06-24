import org.junit.jupiter.api.Test
import java.lang.Exception
import java.time.LocalDate
import java.util.logging.Handler
import kotlin.math.roundToInt
import kotlin.test.assertFailsWith
import kotlin.test.assertEquals as assertEquals1


class TaskTest {

    @Test
    fun task1Test() {
        val numbers: MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
        assertEquals1<Any>(
            numbers.squareAllElementsMap(),
            listOf(1, 16, 81, 256, 625),
            "Extension function: squaring the collection"
        )
    }

    @Test
    fun task2StringTest() {
        val x = "Привет, Андрей, ну где ты был, ну обними меня скорей!"
        assertEquals1(
            expected = typeCasting(x),
            actual = "Я получил тип String = \"Привет, Андрей, ну где ты был, ну обними меня скорей!\", ее длина равна 53 символ",
            "Data type String"
        )
    }

    @Test
    fun task2IntTest() {
        val x = 23
        assertEquals1(
            expected = typeCasting(x),
            actual = "Я получил тип Int = 23, его квадрат равен 529",
            "Data type Int"
        )
    }

    @Test
    fun task2DoubleTest() {
        val x = 23.0
        assertEquals1(
            expected = typeCasting(x),
            actual = "Я получил Double = 23.0, это число округляется до 23.0",
            "Data type Double"
        )
    }

    @Test
    fun task2DoubleRoundsTest() {
        val x = 45.2817812
        assertEquals1<Any>((x * 100.0).roundToInt() / 100.0, 45.28, "Double rounding check")
    }

    @Test
    fun task2LocalDateTestBig() {
        val x = LocalDate.of(2023, 5, 19)
        assertEquals1(
            expected = typeCasting(x),
            actual = "Я получил LocalDate 2023-05-19, эта дата больше, чем дата основания Tinkoff",
            "Data type LocalDate. The date is greater than the date of foundation of Tinkoff"
        )
    }

    @Test
    fun task2LocalDateTestSmall() {
        val x = LocalDate.of(2006, 5, 19)
        assertEquals1(
            expected = typeCasting(x),
            actual = "Я получил LocalDate 2006-05-19, эта дата меньше, чем дата основания Tinkoff",
            "Data type LocalDate. The date is less than the founding date of Tinkoff"
        )
    }

    @Test
    fun task2LocalDateTestEquals() {
        val x = LocalDate.of(2006, 12, 24)
        assertEquals1(
            expected = typeCasting(x),
            actual = "Я получил LocalDate 2006-12-24. Вы одного возраста с Tinkoff!",
            "Data type LocalDate. Date are equal"
        )
    }

    @Test
    fun task2LocalDateTestException() {
        val x = LocalDate.of(2026, 12, 24)
        assertFailsWith(
            exceptionClass = Exception::class,
            message = "Exception check: date from the future",
            block = { typeCasting(x) }
        )
    }

    @Test
    fun task2NullTest() {
        val x = null
        assertEquals1(expected = typeCasting(x), actual = "Oбъект равен null", "The object is null")
    }

    @Test
    fun task2UnknownTest() {
        val x = Handler::class
        assertEquals1(expected = typeCasting(x), actual = "Мне этот тип неизвестен(", "Unknown data type")
    }

    @Test
    fun task3Test() {
        val numbers: List<Double?> =
            listOf(13.31, 3.98, 12.0, 2.99, 9.0, 53.61, 34.78, 16.0, 8.91, 10.0, 3.53, 32.98, 17.0)
        assertEquals1(
            sumOfCollection(numbers),
            actual = 32.3501,
            "Finding the sum of the collection elements"
        )
    }

    @Test
    fun task3TestRoundToInt() {
        val numbers: List<Double?> =
            listOf(13.31, 3.98, 12.0, 2.99, 9.0, 53.61, 34.78, 16.0, 8.91, 10.0, 3.53, 32.98, 17.0)
        assertEquals1(
            numbersRoundToInt(sumOfCollection(numbers)),
            actual = 32.35,
            "Complete verification of task 3"
        )
    }

    @Test
    fun task3TestSumRoundToInt() {
        val numbers = 32.3501
        assertEquals1(
            numbersRoundToInt(numbers),
            actual = 32.35,
            "Rounding to two decimal places"
        )
    }

    @Test
    fun task4TestPositive() {
        assertEquals1(
            numberRussianWords(575),
            actual = "пятьсот семьдесят пять",
            "Write the number in Russian words"
        )
        assertEquals1(
            numberRussianWords(11),
            actual = "одиннадцать",
            "Write the number in Russian words"
        )

        assertEquals1(
            numberRussianWords(999),
            actual = "девятьсот девяносто девять",
            "Write the number in Russian words"
        )

        assertEquals1(
            numberRussianWords(55),
            actual = "пятьдесят пять",
            "Write the number in Russian words"
        )

        assertEquals1(
            numberRussianWords(1000),
            actual = "тысяча",
            "Write the number in Russian words"
        )

        assertEquals1(
            numberRussianWords(0),
            actual = "ноль",
            "Write the number in Russian words"
        )

        assertEquals1(
            numberRussianWords(1),
            actual = "один",
            "Write the number in Russian words"
        )

    }

    @Test
    fun task4TestNegative() {
        assertFailsWith(
            exceptionClass = Exception::class,
            message = "Write the number in Russian words - error!",
            block = { numberRussianWords(1001) }
        )

        assertFailsWith(
            exceptionClass = Exception::class,
            message = "Write the number in Russian words - error!",
            block = { numberRussianWords(-1) }
        )

        assertFailsWith(
            exceptionClass = Exception::class,
            message = "Write the number in Russian words - error!",
            block = { numberRussianWords(7777) }
        )
    }

}
