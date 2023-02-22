const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    val firstName = "alif"
    val age = 23

    println(firstName)
    println(age)

    //nullable

    var name: String? = null
    name = "alif"
    println(name)
    println(name?.length)
    //this syntax not recomended, kalo bisa jangan pernah bikin variable yg bisa null
    //kecuali kalo akses kode java dan mau gak mau harus pake variable yg bisa null


    println("$APPLICATION : $VERSION")

}