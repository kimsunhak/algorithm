### [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Tree` `Binary Search Tree`


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
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return root

        if (root.`val` == `val`) return root

        return if (root.`val` > `val`) { searchBST(root.left, `val`) }
        else { searchBST(root.right, `val`) }
    }
}
```

