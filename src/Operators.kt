fun main(args:Array<String>) {
    val i = 20
    val j = 10
    var result: Int

    result = i+j
    println("Sum : " +result)

    result = i-j
    println("Sub : " +result)

    result = i*j
    println("Mul : " +result)

    result = i/j
    println("Div : " +result)

    result = i%j
    println("Mod : " +result)

    var k = 50
    k *= 5                           // k = k * 5 Assignment Operator
    println("Testing Assignmet Operator *= " +k)

    var x = 50
    x++                              // x = x + 1 Increment Operator
    println("Testing Increment Operator " +x)

    var y = 50
    y--                              // y = y - 1 Decrement Operator
    println("Testing Decrement Operator " +y)

    --y                              // y = y - 1 Decrement Operator
    println("Testing Decrement Operator another way " +y)


    println("Fifth Kotline Prog , By Sanjay D Shirsath")
}