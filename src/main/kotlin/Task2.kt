import java.time.LocalDate
import java.time.LocalDate.*
import java.time.temporal.ChronoUnit
import java.util.logging.Handler
import kotlin.math.roundToInt

fun main() {

    println(typeCasting("Privet"))
    println(typeCasting(145))
    println(typeCasting(145.0))
    println(typeCasting(145.2817812))

    try {
        println(typeCasting(of(2023, 5, 19)))
    } catch (e: Exception) {
        println(e.message)
    }

    println(typeCasting(null))
    println(typeCasting(Handler::class))
}

fun typeCasting(x: Any?): Any {
    when (x) {
        is String -> return "Я получил тип String = \"$x\", ее длина равна ${x.length} символ"
        is Int -> return "Я получил тип Int = $x, его квадрат равен ${x * x}"
        is Double -> return "Я получил Double = $x, это число округляется до ${(x * 100.0).roundToInt() / 100.0}"
        is LocalDate -> {

            val endDate = now()
            val tinkoffOfBirth = of(2006, 12, 24)
            val xData = ChronoUnit.YEARS.between(x, endDate).toInt()
            val tinkoffData = ChronoUnit.YEARS.between(tinkoffOfBirth, endDate).toInt()
            if (x > endDate) throw Exception("Вы ввели заду из будущего! Оно еще не наступило :)")
            return when {
                (tinkoffData > xData) -> "Я получил LocalDate $x, эта дата больше, чем дата основания Tinkoff"
                (tinkoffData < xData) -> "Я получил LocalDate $x, эта дата меньше, чем дата основания Tinkoff"
                else -> "Я получил LocalDate $x. Вы одного возраста с Tinkoff!"
            }
        }

        null -> return "Oбъект равен null"
        else -> return "Мне этот тип неизвестен("
    }
}
