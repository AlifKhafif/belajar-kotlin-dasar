fun main() {
    //Array yang tidak bisa null
    val members: Array<String> = arrayOf("Alif", "Nur", "Khafif")
    val alif: String = members[0]
    val nur: String = members.get(1)
    val khafif: String = members.get(2)

    members.set(0, "Afif")
    val Afif: String = members[0]
    println(members[0])

    //Array yg Nullable
    val names: Array<String?> = arrayOfNulls(5)
    names[0] = "alif"
    names[1] = "alif"
    names[2] = "alif"
    names[3] = "alif"
    names[4] = "alif"
    println(names[3])


}