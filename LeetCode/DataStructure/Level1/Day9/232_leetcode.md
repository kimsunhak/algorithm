### [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Stack` `Design` `Queue`

```kotlin
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

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
```

