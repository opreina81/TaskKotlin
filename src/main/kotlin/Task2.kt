import java.time.LocalDate
import java.time.LocalDate.*
import java.time.temporal.ChronoUnit
import java.util.logging.Handler
import kotlin.math.roundToInt

fun main() {

    typeCasting("Privet")
    typeCasting(145)
    typeCasting(145.0)
    typeCasting(145.2817812)
    typeCasting(of(2006, 12, 24))
    typeCasting(null)
    typeCasting(Handler::class)

}

fun typeCasting(x: Any?) {

    if (x is String) {
        println("Я получил тип String = \"$x\", ее длина равна ${x.length} символ")
    } else if (x is Int) {
        println("Я получил тип Int = $x, его квадрат равен ${x * x}")
    } else if (x is Double) {
        println("Я получил Double = $x, это число округляется до ${(x * 100.0).roundToInt() / 100.0}")
    } else if (x is LocalDate) {

        val endDate = now()
        val tinkoffOfBirth = of(2006, 12, 24)
        val xData = ChronoUnit.YEARS.between(x, endDate).toInt()
        val tinkoffData = ChronoUnit.YEARS.between(tinkoffOfBirth, endDate).toInt()

        if (tinkoffData > xData) {
            println("Я получил LocalDate $x, эта дата меньше, чем дата основания Tinkoff")
        } else if (tinkoffData < xData) {
            println("Я получил LocalDate $x, эта дата больше, чем дата основания Tinkoff")
        } else {
            println("Я получил LocalDate $x. Вы одного возраста с Tinkoff!") //Alexey Belolipetskiy аппрувнул такое условие, согласовала с ним
        }

    } else if (x == null) {
        println("Oбъект равен null")
    } else {
        println("Мне этот тип неизвестен(")
    }
}
