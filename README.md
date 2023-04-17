Для запуска проекта с выполненными задачами, необходимо склонировать данный репозиторий к себе в IDE и запустить.
В проекте представлены решения четырех задач (`задача 1 в двух вариантах`), каждое размещено в отдельном файле в папке main.
В папке test представлен файл с юнит-тестами к решениям.

# Task1
Написана функция-расширения `MutableList<Int>.square()` для работы с изменяемой (mutable) коллекцией, содержащей в себе тип Int, функция расширения возводит все элементы в квадрат.
В этом варианте решения возвращаемое значение функции-расширении - в формате MutableList<kotlin.Int>, при выводе в консоль полностью идентично требуемому в условиях к задаче виду и содержанию

# Task1_version2
Написана функция-расширения `ListInSquare.square()` для работы с изменяемой (mutable) коллекцией, содержащей в себе тип Int, функция расширения возводит все элементы в квадрат.
В этом варианте решения функция-расширения выводит на печать mutablelist-коллекцию возведенную в квадрат

# Task2
Написан метод `typeCasting()`, который принимает в себя Any? и, исходя из того к какому типу принадлежит объект делает определенные действия:
- если объект типа String, выводит полученный тип, его значение и длину строки в сообщении "Я получил тип String = 'Привет, Андрей, ну где ты был, ну обними меня скорей!', ее длина равна 51 символ"
- если Int - выводит полученный тип, его значение, и его значение, возведенное в квадрат, например “Я получил Int = 145, его квадрат равен 21025”
- если Double - выводит полученный тип, его значение и его математически верное, округленное до 2х знаков после запятой значение в сообщении "Я получил Double = 2.356, это число округляется до 2.36"
- если LocalDate - выводит полученный тип, его значение и ответ на вопрос, меньше ли введенная дата даты основания Tinkoff (считаем, что это 24 декабря 2006) , например "Я получил LocalData = val, эта дата меньше чем дата основания Tinkoff"
- для других типов поведение не определено, поэтому выводится сообщение "Мне этот тип неизвестен("
- если передано null, выводит сообщение, что объект равен null "Oбъект равен null"

# Task3
Написан метод `sumOfCollection`, который принимает в себя лист (коллекцию) с числами типа Double? (nullable) , после чего:
- делит на два элемент, если он нечетный, а если четный - возводит в квадрат ( проверка на четность/нечетность - без учета дробной части) , - сохранено в переменные `parityCheck`, `checkingForOdd` соответственно и в `newList` -соединяем полученные значения в коллекцию для дальнейшей работы
- выкидывает все цифры больше 25 - `.filter { it!! < 25 }`
- отбрасывает null - `.filterNotNull()`
- сортирует коллекцию по убыванию - `.sortedDescending()`
- отбрасывает все элементы коллекции кроме первых 10 - `.take(10)`
- возвращает сумму элементов в оставшейся коллекции - `.forEach { sum += it }`
- после чего ее выводит в консоль с округлением до двух знаков после запятой - `(sum * 100.0).roundToInt() / 100.0`

# Task4
Написан метод `numberRussianWords`, который работает с натуральным числом n (n<=1000): печатает это число русскими словами (30 ->тринадцать, 105 -> сто пять, и т.д.)

# Tasktest
Файл с юнит-тестами к решениям
`task1Test()` - проверяет, что переданная в функцию-расширения `MutableList<Int>.square()` коллекция, корректно возводится в квадрат.
`task2StringTest()`- проверяет, что переданный в функцию тип данных, является String.
`task2IntTest()` - проверяет, что переданный в функцию тип данных, является Int.
`task2DoubleTest()`- проверяет, что переданный в функцию тип данных, является Double.
`task2DoubleRoundsTest()` - проверяет, что переданный в функцию тип данных Double, математически верно округляется до 2х знаков после запятой.
`task2LocalDateTest()` - проверяет, что переданный в функцию тип данных, является LocalDate.
`task2NullTest()`- проверяет, что переданный в функцию объект равен или не равен null
`task2UnknownTest()` - проверяет, что переданный в функцию тип данных, неизвестен.
 `task3Test()` -  проверяет, что метод `sumOfCollection`, который принимает в себя лист с числами типа Double? (nullable) , проводит с ними требуемые в условиях задачи операции и возвращает сумму элементов оставшейся коллекции с округлением до двух знаков после запятой.
`task4Test()` проверяет, что метод `numberRussianWords`, который работает с натуральным числом n (n<=1000), корректно печатает это число русскими словами.
