### [1491. Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/?envType=study-plan&id=programming-skills-i)

##### Language : Kotlin

##### Tags: `Array` `Sorting`

```kotlin
class Solution {
    fun average(salary: IntArray): Double {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var result = 0

        salary.forEach { it ->
            min = minOf(it, min)
            max = maxOf(it, max)
            result += it
        }
        return (result - (max + min)) / (salary.size - 2.0)
    }
}
```

