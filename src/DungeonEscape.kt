fun main(){
//    var level=0
//    println("Добро пожаловать в подземелье!")
//    while (level<5){
//        println("\nВы на уровне $level.")
//        println("Выберите действие: [1] Вперёд | [2] Осмотреться | [0] Сдаться")
//        val input= readln()
//        when (input) {
//            "1" -> {
//                level++
//                println("Вы переходите на уровень $level")
//            }
//            "2" -> {
//                println("Вы осматриваетесь. Тут ничего интересного.")
//                continue
//            }
//            "0" -> {
//                println("Вы сдались. Игра окончена.")
//                break
//            }
//            else -> {
//                println("Неверный ввод. Попробуйте снова.")
//                continue
//            }
//        }
//        if (level == 5)
//            println("Поздравляем! Вы выбрались из подземелья!")
//    }
//    var number: Int
//    do {
//        print("Введите число больше 10: ")
//        number = readln().toInt()
//    } while (number <= 10)
//    println("Спасибо! Вы ввели $number.")
//    print("Введите пароль: ")
//    var password: String? = readln()
//    while (password != "qwerty") {
//        print("Введите пароль: ")
//        password =readln()
//    }
//    println("Доступ разрешён!")
    var password: String?
    do {
        print("Введите пароль: ")
        password = readln()
    } while (password != "qwerty")
    println("Доступ разрешён!")
}