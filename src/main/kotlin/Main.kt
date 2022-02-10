fun main(args: Array<String>) {
    val list = readLine()!!
        .split(" ")
        .filter {it.isNotEmpty() }
        .map { it.toInt() }
    val a = list[0]
    val b = list[1]
    val c = list[2]

    println(when {
        a in 0..100 -> "wait"
        (a>0 || b+c==7) -> "ok"
        (readLine()!!.isEmpty()) -> "error"
        else -> "UNDEFINED"
    })

   /*
------------------------------------------------------
Напишите программу, которая считывает строку и выводит:
"A", если её длина больше 0 и меньше 11;
"B", если её длина равна 20
"C", если её длина равна 15
"D" во всех остальных случаях.

Использовать условный опреатор if-else запрещено.
Sample Input: a
Sample Output: A




    */


}