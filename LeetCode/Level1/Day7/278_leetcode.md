### [278. First Bad Version](https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=level-1)

##### Language : Kotlin

##### Tags: Binary Search Interactive

```kotlin
/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var low = 0
        var high = n
        while (low < high) {
            val mid = low + (high - low) / 2

            if (isBadVersion(mid)) { high = mid }
            else { low = mid + 1 }
        }
        return high
    }
}
```

