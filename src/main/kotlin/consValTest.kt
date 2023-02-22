//We wrote a program, but it doesn't work.
//Please correct the error in the code.
//The program must print [10000, 1000000, 100000000].


const val CONST: Int = 100

fun main() {
    val listNumber = mutableListOf<Int>()
    listNumber.add(10000)
    listNumber.add(1000000)
    listNumber.add(100000000)
    println(listNumber)


    val listNumber1 = mutableListOf<Int>()
    CONST
    listNumber1.add(CONST * CONST)
    listNumber1.add(CONST * CONST * CONST)
    listNumber1.add(CONST * CONST * CONST * CONST)
    println(listNumber1)
}
