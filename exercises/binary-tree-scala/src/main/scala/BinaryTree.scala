sealed trait BinaryTree {
  def add(value: Int): BinaryTree

  def search(value: Int): Boolean

  def remove(value: Int): BinaryTree
}

object BinaryTree {
  def apply(): BinaryTree = ???
}
