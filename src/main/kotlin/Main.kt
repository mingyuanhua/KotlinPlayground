fun main(args: Array<String>) {
    // declare val, cannot reassign value
    val a: Int = 5
    // declare var, can reassign value
    var b: String = "hello"
    b = "world"

    // declare ? to allow null values
    var c: String? = "hello"
    c = null

    println(a)
    println(b)
    println(c?.length) // nullable length

    fun checkNull(a: Int) {
        // a从定义就不可能是null
        a.toString()
    }

    fun checkNull(a: Int?) {
        // a可能是null 需要checknull
        a.toString()
    }

    println(condition(2))

    println("Program arguments: ${args.toString()}")
}

fun condition(x: Int): Int? {
    val numbers:List<Int> = listOf(1,2,3,4,5)
    val a : Int? = numbers.getOrNull(2)

    // mutabeList = arraylist
    val mutableNum: MutableList<Int> = mutableListOf(1,2,3,4,5)
    mutableNum.add(6)

    return numbers.getOrNull(x)
}

fun mapExample() {
    val colorBook: Map<String, Int> = mapOf("red" to 1, "vello" to 2, "blue" to 3)
}