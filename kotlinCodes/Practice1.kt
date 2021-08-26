package kotlinCodes

fun main() {
    var a = 5
    var b = 6
    println("Value of a is : $a")
    println("Value of b is : $b")
    println("Added 6 in a : ${a+6}")
    println("Added 5 in b : ${b+5}\n")

    var b1: Byte = Byte.MIN_VALUE
    var b2: Byte = Byte.MAX_VALUE
    println("Byte MIN_VALUE : $b1")
    println("Byte MAX_VALUE : $b2")
    println("Addition of b1 and b2 : ${b1+b2}\n")

    var s1: Short = Short.MIN_VALUE
    var s2: Short = Short.MAX_VALUE
    println("Short MIN_VALUE : $s1")
    println("Short MAX_VALUE : $s2")
    println("Addition of s1 and s2 : ${s1+s2}\n")

    var i1: Int = Int.MIN_VALUE
    var i2: Int = Int.MAX_VALUE
    println("Int MIN_VALUE : $i1")
    println("Int MAX_VALUE : $i2")
    println("Addition of i1 and i2 : ${i1+i2}\n")

    var l1: Long = Long.MIN_VALUE
    var l2: Long = Long.MAX_VALUE
    println("Long MIN_VALUE : $l1")
    println("Long MAX_VALUE : $l2")
    println("Addition fo l1 and l2 : ${l1+l2}\n")

    var f1: Float = Float.MIN_VALUE
    var f2: Float = Float.MAX_VALUE
    println("Float MIN_VALUE : $f1")
    println("Float MAX_VALUE : $f2")
    println("Addition of f1 and f2 : ${f1+f2}\n")

    var d1: Double = Double.MIN_VALUE
    var d2: Double = Double.MAX_VALUE
    println("Double MIN_VALUE : $d1")
    println("Double MAX_VALUE : $d2")
    println("Addition of d1 and d2 : ${d1+d2}\n")

    var ch: Char = 'S'
    println("Value of ch is : $ch\n")

    var boolean: Boolean = 10>9
    println("Expression result is : $boolean\n")

    /**
     * val is same as a final in Java.....we can just assign value once and also we can't do changes in the value
     */
    val q: Int = 10
    println("a value before changes : ${q}")
}