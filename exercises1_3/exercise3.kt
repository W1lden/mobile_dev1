fun sum(a: Int, b: Int): Int {
    return a + b
}

val multiply: (Int, Int) -> Int = { x, y -> x * y }

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val resultSum = sum(5, 10)
    println("Sum: $resultSum")

    val resultMultiply = multiply(4, 6)
    println("Multiply: $resultMultiply")

    val resultApplyOperation = applyOperation(3, 7, multiply)
    println("Applied Operation (Multiply): $resultApplyOperation")
}
