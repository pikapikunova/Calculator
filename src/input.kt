fun main(args: Array<String>) {
    val a: number = number(6.0)
    val b: number = number(7.0)
    print(a+b)
    print(a-b)
    print(a*b)
    print(a.root())
    a.ShiftValue(b)
    print(a)
    print(b)
    a.addNum('3')
    print(a)

}