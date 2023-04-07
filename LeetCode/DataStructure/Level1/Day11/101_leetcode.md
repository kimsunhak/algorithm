### [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Tree` `Depth-First Search` `Breadth-First Search` `Binary Tree`


```kotlin
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return check(root?.left, root?.right)
    }

    private fun check(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null || right == null) return left == right
        return left?.`val` == right?.`val` && check(left.left, right.right) && check(left.right, right.left)
    }
}
```

