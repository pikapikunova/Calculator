
import kotlin.math.sqrt

class number (Num: Double)
{

    var num: Double
    var howMuchC = 0
    var currentOperation: String = "0"
    init {
        num = Num
    }
    constructor(): this(0.0)

    operator fun plus(other: number)= number(num + other.num)
    operator fun times(other: number)= number(num * other.num)
    operator fun div (other: number)= number(num / other.num)
    operator fun minus(other: number)= number(num - other.num)
    fun root()= number(sqrt(num))

    fun addNum(char: Char)
    {
        var res = num.toInt()

        if(num - res == 0.0) {
            var str = res.toString()
            str = str.padEnd(str.length + 1, char)
            num = str.toDouble()
        }
        else
        {
            var str = num.toString()
            str = str.padEnd(str.length + 1, char)
            num = str.toDouble()
        }
    }

    fun Calc(currentOperation: String, res: number, num: number)
    {
        when(currentOperation)
        {
            "plus" -> res+num
            "times"->res*num
            "div"-> res/num
            "minus"->res-num
            "root"->res.root()
        }
    }

    fun ShiftValue(otherNum: number)
    {
        var temp = num
        num = otherNum.num
        otherNum.num = temp
    }


}

//консольная проверка
/*fun main(args: Array<String>) {
    val a = number(6.0)
    val b = number(7.5)


    println((a+b).num)
    println((a-b).num)
    println((a*b).num)
    println(a.root().num)
    a.ShiftValue(b)
    println(a.num)
    println(b.num)
    a.addNum('3')
    println(a.num)
}*/