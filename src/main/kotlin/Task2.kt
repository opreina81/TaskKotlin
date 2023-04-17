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
    println(typeCasting(of(2006, 12, 24)))
    println(typeCasting(null))
    println(typeCasting(Handler::class))

}

fun typeCasting(x: Any?) : Any {

    if (x is String) {
        return "Я получил тип String = \"$x\", ее длина равна ${x.length} символ"
    } else if (x is Int) {
        return "Я получил тип Int = $x, его квадрат равен ${x * x}"
    } else if (x is Double) {
        return "Я получил Double = $x, это число округляется до ${(x * 100.0).roundToInt() / 100.0}"
    } else if (x is LocalDate) {

        val endDate = now()
        val tinkoffOfBirth = of(2006, 12, 24)
        val xData = ChronoUnit.YEARS.between(x, endDate).toInt()
        val tinkoffData = ChronoUnit.YEARS.between(tinkoffOfBirth, endDate).toInt()

        if (tinkoffData > xData) {
            return "Я получил LocalDate $x, эта дата меньше, чем дата основания Tinkoff"
        } else if (tinkoffData < xData) {
            return "Я получил LocalDate $x, эта дата больше, чем дата основания Tinkoff"
        } else {
            return "Я получил LocalDate $x. Вы одного возраста с Tinkoff!" //Alexey Belolipetskiy аппрувнул такое условие, согласовала с ним
        }

    } else if (x == null) {
        return "Oбъект равен null"
    } else {
        return "Мне этот тип неизвестен("
    }
}
