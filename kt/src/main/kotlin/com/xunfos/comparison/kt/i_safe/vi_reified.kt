package com.xunfos.comparison.kt.i_safe

fun main() {
    val root = BananaRootNode("bananinha")

    val node1 = TreeNode(root)
    val node2 = TreeNode(root)

    val node11 = FruitBearingNode(parent = node1, fruit = "apple")
    val node111 = TreeNode(parent = node11)
    val node21 = TreeNode(node2)

    val searchedRoot = node21.findParentOfType<BananaRootNode>()
    println(searchedRoot)

    val searchedFruitBearingNode : FruitBearingNode? = node111.findParentOfType()
    println(searchedFruitBearingNode)
}

inline fun <reified T:TreeNode> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}

open class TreeNode(open val parent: TreeNode?)
data class BananaRootNode(val name: String = "root") : TreeNode(parent = null)
data class FruitBearingNode(override val parent: TreeNode, val fruit: String) : TreeNode(parent = parent)
