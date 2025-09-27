fun main(){
//    var number=1
//    while (number<=5){
//        println("Число: $number")
//        number++
// }
//    var number = 0
//   while (number < 10) {
//       number++
//       if (number == 3) {
//           println("Останавливаемся на $number")
//            continue
//        }
//       println(number)
//    }
    println("Напишите что-нибудь (для выхода введите 'выход'):")
    while (true) {
        val input= readLine()
        if (input == "выход") {
            println("До свидания!")
            break
        }
        println("Вы ввели: $input")
    }
}