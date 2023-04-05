import java.util.*

/**
 * @author : ksh
 * @date : 2023/03/23
 **/


fun main() {
    val solution = Solution()
    print(solution.isAnagram())
}

class MyQueue() {

    val inputStack = Stack<Int>()
    val outputStack = Stack<Int>()

    fun push(x: Int) {
        inputStack.push(x)
    }

    fun pop(): Int {
        peek()
        return outputStack.pop()
    }

    fun peek(): Int {
        if (outputStack.isEmpty()) {
            while(inputStack.isNotEmpty()) {
                outputStack.push(inputStack.pop())
            }
        }
        return outputStack.peek()
    }

    fun empty(): Boolean {
        return inputStack.isEmpty() && outputStack.isEmpty()
    }

}
