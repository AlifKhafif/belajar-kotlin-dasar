fun main() {

    var firstName: String = "Alif Nur"
    var lastName: String = "Khafif"

    var address: String = """
        |Perum Bumi Cikarang Makmur, 
        |Blok A8 No:21, 
        |Kabupaten Bekasi,
        |Indonesia
    """.trimMargin()

    var address2: String = """
        >Perum Jayasampurna Residence,
        >Blok G12A No:1,
        >Kabupaten Bekasi,
        >Indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)
    println(address2)

    var fullName: String = firstName + " " + lastName

    println(fullName)

    //String Template
    var fullName2: String = "$firstName $lastName"
    println(fullName2)
 
    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}