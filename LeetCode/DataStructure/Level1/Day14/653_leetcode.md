### [653. Two Sum IV - Input is a BST](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Hash Table` `Two Pointers` `Tree` `Depth-First Search` `Breadth-First Search` `Binary Search Tree` `Binary Tree`


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
    private val set = hashSetOf<Int>()
    fun findTarget(root: TreeNode?, k: Int): Boolean {

        if (root == null) return false

        if (set.contains(k - root.`val`)) {
            return true
        }

        set.add(root.`val`)

        return findTarget(root.left, k) || findTarget(root.right, k)
    }
}
```

