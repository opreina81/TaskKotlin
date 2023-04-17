fun main() {
    try {
        print(numberRussianWords(0))
    } catch (e: Exception) {
        println(e.message)
    }
}

fun numberRussianWords(number: Int): String {
    if (number < 0 || number > 1000) throw Exception("Введенное число должно быть больше нуля и меньше 1000")
    var word: String
    if (number == 1000) {
        word = "тысяча"
    }
    else if (number == 0) {
        word = "ноль"
    } else {
        word = ""
        when (number / 100) {
            1 -> word = "сто"
            2 -> word = "двести"
            3 -> word = "триста"
            4 -> word = "четыреста"
            5 -> word = "пятьсот"
            6 -> word = "шестьсот"
            7 -> word = "семьсот"
            8 -> word = "восемьсот"
            9 -> word = "девятьсот"
        }
        if (number >= 100 && number % 100 >= 10) {
            word += " "
        }
        when (number % 100 / 10) {
            2 -> word = word + "двадцать"
            3 -> word = word + "тридцать"
            4 -> word = word + "сорок"
            5 -> word = word + "пятьдесят"
            6 -> word = word + "шестьдесят"
            7 -> word = word + "семьдесят"
            8 -> word = word + "восемьдесят"
            9 -> word = word + "девяносто"
        }
        if ((number % 100 >= 10) && (number % 100 < 20)) {
            when (number % 100) {
                10 -> word = word + "десять"
                11 -> word = word + "одиннадцать"
                12 -> word = word + "двенадцать"
                13 -> word = word + "тринадцать"
                14 -> word = word + "четырнадцать"
                15 -> word = word + "пятнадцать"
                16 -> word = word + "шестнадцать"
                17 -> word = word + "семнадцать"
                18 -> word = word + "восемнадцать"
                19 -> word = word + "девятнадцать"
            }
        } else {
            if (number % 10 != 0 && (number % 100 >= 20 || number >= 100)) {
                word += " "
            }
            when (number % 10) {
                1 -> word = word + "один"
                2 -> word = word + "два"
                3 -> word = word + "три"
                4 -> word = word + "четыре"
                5 -> word = word + "пять"
                6 -> word = word + "шесть"
                7 -> word = word + "семь"
                8 -> word = word + "восемь"
                9 -> word = word + "девять"
            }
        }
    }
    return word
}
