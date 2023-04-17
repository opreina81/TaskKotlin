import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.math.roundToInt
import java.util.logging.Handler
import kotlin.test.assertEquals as assertEquals1


class TaskTest {

    @Test
    fun task1Test() {
        val numbers: MutableList<kotlin.Int> = mutableListOf(1, 4, 9, 16, 25)
        assertEquals1(
            numbers.square(),
            listOf(1, 16, 81, 256, 625),
            "Extension function: squaring the collection"
        )
    }

    @Test
    fun task2StringTest() {
        val x = "Привет, Андрей, ну где ты был, ну обними меня скорей!"
        typeCasting(x)
        assertEquals1<Any>(expected = x is String, actual = true, "Data type String")
    }

    @Test
    fun task2IntTest() {
        val x = 23
        typeCasting(x)
        assertEquals1<Any>(expected = x is Int, actual = true, "Data type Int")
    }

    @Test
    fun task2DoubleTest() {
        val x = 23.0
        typeCasting(x)
        assertEquals1<Any>(expected = x is Double, actual = true, "Data type Double")
    }

    @Test
    fun task2DoubleRoundsTest() {
        val x = 45.2817812
        assertEquals1<Any>(45.28, (x * 100.0).roundToInt() / 100.0, "Double rounding check")
    }

    @Test
    fun task2LocalDateTest() {
        val x = LocalDate.of(2006, 12, 24)
        typeCasting(x)
        assertEquals1<Any>(expected = x is LocalDate, actual = true, "Data type LocalDate")
    }

    @Test
    fun task2NullTest() {
        val x = null
        typeCasting(x)
        assertEquals1<Any>(expected = x == null, actual = true, "The object is null")
    }

    @Test
    fun task2UnknownTest() {
        val x = Handler::class
        typeCasting(x)
        assertEquals1<Any>(expected = x == Handler::class, actual = true, "Unknown data type")
    }

    @Test
    fun task3Test() {
        val numbers: List<Double?> =
            listOf(13.31, 3.98, 12.0, 2.99, 9.0, 53.61, 34.78, 16.0, 8.91, 10.0, 3.53, 32.98, 17.0)
        assertEquals1(
            sumOfCollection(numbers),
            actual = 32.35,
            "Operations on a collection and the sum of its elements"
        )
    }

    @Test
    fun task4Test() {
        assertEquals1(
            numberRussianWords(975),
            actual = "девятьсот семьдесят пять",
            "Operations on a collection and the sum of its elements"
        )
    }


}
