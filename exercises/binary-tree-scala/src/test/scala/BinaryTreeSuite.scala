import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.util.Random

@RunWith(classOf[JUnitRunner])
class BinaryTreeSuite extends FunSuite {

  protected def createInstance(): BinaryTree = {
    BinaryTree()
  }

  test("Add and search one value") {
    var bt = createInstance()
    assert(!bt.search(5))
    bt = bt.add(5)
    assert(bt.search(5))
    bt = bt.add(5)
    assert(bt.search(5))
  }

  test("Add and search many values") {
    val bt = createInstance().add(5).add(4).add(3).add(8).add(7)
    assert(bt.search(5))
    assert(bt.search(4))
    assert(bt.search(3))
    assert(bt.search(8))
    assert(bt.search(7))
  }

  test("Add and remove one value") {
    val bt = createInstance().add(5).remove(5)
    assert(!bt.search(5))
  }

  test("Add and remove many values") {
    var bt = createInstance().add(5).add(8).add(1).add(3).add(2).add(4).add(9).add(6).add(7)
      .remove(6).remove(7)
    assert(!bt.search(6))
    assert(!bt.search(7))
    bt = bt.remove(5)
    assert(!bt.search(5))
    assert(bt.search(8))
    assert(bt.search(1))
    assert(bt.search(3))
    assert(bt.search(2))
    assert(bt.search(2))
    assert(bt.search(4))
    assert(bt.search(9))
  }

  test("Add and remove random values") {
    var bt = createInstance()

    val rand = scala.util.Random
    val size: Int = 10000
    val max: Int = 1000000

    val array = Seq.fill(size)(Random.nextInt(max))
    array.foreach { i => bt = bt.add(i) }
    //test all present
    array.foreach(i => assert(bt.search(i)))

    //remove some random numbers
    val arrayToRemove = Seq.fill(size)(Random.nextInt(max))
    arrayToRemove.foreach { i => bt = bt.remove(i) }
    arrayToRemove.foreach(i => assert(!bt.search(i)))
  }
}
