import spock.lang.Specification

class TreeOfXsTest extends Specification {
    def "tree of size 1"() {
        setup:
        def treeOfXs = new TreeOfXs()

        when:
        def result = treeOfXs.makeTree(1)

        then:
        result == 'X'
    }

    def "tree of size 4"() {
        setup:
        def treeOfXs = new TreeOfXs()

        when:
        def result = treeOfXs.makeTree(4)

        then:
        result == '''   X
  X X
 X X X
X X X X'''
    }

    def "tree of size 20"() {
        setup:
        def treeOfXs = new TreeOfXs()

        when:
        def result = treeOfXs.makeTree(20)

        then:
        result == '''                   X
                  X X
                 X X X
                X X X X
               X X X X X
              X X X X X X
             X X X X X X X
            X X X X X X X X
           X X X X X X X X X
          X X X X X X X X X X
         X X X X X X X X X X X
        X X X X X X X X X X X X
       X X X X X X X X X X X X X
      X X X X X X X X X X X X X X
     X X X X X X X X X X X X X X X
    X X X X X X X X X X X X X X X X
   X X X X X X X X X X X X X X X X X
  X X X X X X X X X X X X X X X X X X
 X X X X X X X X X X X X X X X X X X X
X X X X X X X X X X X X X X X X X X X X'''
    }
}
