fun main() {

    val range = 1..100 step 2

    println(range.count())
    println(range.contains(78))
    println(range.contains(109))
    println(range.first)
    println(range.last)
    println(range.step)

    println("-----")

    //Range terbalik
    val rangeRevers = 100 downTo 0

    println(rangeRevers.count())
    println(rangeRevers.contains(78))
    println(rangeRevers.contains(109))
    println(rangeRevers.first)
    println(rangeRevers.last)
    println(rangeRevers.step)
}