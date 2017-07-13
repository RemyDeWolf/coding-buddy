# Tree of X's
Write a function, given a number of rows, and print out a tree with that number of rows of X's.
 makeTree(4) =>

```
   X
  X X
 X X X
X X X X
```

# Project structure

    .
    ├── src
    │   ├── main
    │   │   └── groovy
    │   │       └── TreeOfXs.groovy         # Implement this file
    │   └── test
    │   │   └── groovy
    │   │       └── TreeOfXsTest.groovy     # Run the tests to verify implementation.
    └── build.gradle                        # Run `gradle test` from command line to verify implementation.

# Files to implement

- [TreeOfXs.groovy](src/main/groovy/TreeOfXs.groovy): Implement makeTree()

# Verification

```
gradle test
```
