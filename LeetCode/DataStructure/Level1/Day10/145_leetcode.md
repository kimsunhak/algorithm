### [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/valid-parentheses/?envType=study-plan&id=data-structure-i)

##### Language : Kotlin

##### Tags: `Stack` `Tree` `Depth-First Search`

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
    private lateinit var nodes: MutableList<Int>

    fun postorderTraversal(root: TreeNode?): List<Int> {
        nodes = arrayListOf()
        dfs(root)
        return nodes
    }

    private fun dfs(node: TreeNode?) {
        if (node != null) {

            node.left?.let {
                dfs(it)
            }

            node.right?.let {
                dfs(it)
            }

            nodes.add(node.`val`)

        }
    }
}
```

