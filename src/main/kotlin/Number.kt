fun main() {
    var age: Int = 23
    var sample: Float = 10.10F
    println(age)
    println(sample)

    var binary: Int =0b10101010
    println(binary)

    var price: Long = 9_000_000_000L
    println(price)

    var princeInt: Int = price.toInt()
    println(princeInt)
    //Kenapa hasilnya 410065408? karna "istilahnya" adalah "integer overflow" atau "number overflow"
    // karena memasukan lebih dari kapasitas Integer yg hanya 2milyar sekian.

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)

    var a: Int = 1324

    println(a)
}