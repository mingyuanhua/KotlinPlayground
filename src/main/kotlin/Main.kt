import java.awt.Rectangle

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

    val rec = Rectangle(3.0, 5.0)
    println(rec.height)


    // extension 不通过继承 给已经存在的class加个方法 --> 非常的灵活！！
    // extension的使用场景是在已经存在的class里增加我们经常使用的util方法
    val dog = GoldenRetriver("golden")
    dog.size()

    // first-class 可以当做type来对待 type就是一个function
    val numberTransformer : (Int) -> String

    val sum: (Int, Int) -> Int = {x: Int, y: Int -> x + y}

}

// data class 帮你实现了 toString, equals, hashcode, 跟Java record class一样的

fun GoldenRetriver.size(): Int {
    return 100
}

interface Animal {
    val furColor: String
    fun bark(): String
}

interface Mammal {
    fun birth(): Mammal
}

interface bird {
    fun egg()
}

// java extends implement, kotlin不分
open abstract class Dog(val breed: String): Animal, Mammal {
    override fun bark(): String {
        return  "Wu..Wu..Wu"
    }


}

// 如果想给Dog加个新的方法, 要么Dog里写在里面，或者写个新的interface
interface NewDog: Animal {
    fun size(): Int
}
// extension是不通过继承加新的方法


// 类似Java里的super
class GoldenRetriver(furColor: String): Dog("GoldenRetriver") {
    override val furColor: String = "Golden"

    override fun birth():Mammal {
        return GoldenRetriver("Golden")
    }

    override fun bark(): String {
        return "wang-wang"
    }
}

class Rectangle(val height: Double, val length: Double) {
    val perimeter: Double = (height + length) * 2

    fun calculateSize(): Double {
        return height * length
    }
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

