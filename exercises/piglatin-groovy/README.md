# piglatin translator

English -> piglatin
Given a sentence in english, return the sentence in piglatin
Piglatin rules:
1) If a word starts with a vowel, add 'yay' to the word (apple => appleyay)
2) If a word starts with a consonent, move the consonents to the end and then add 'ay' (glove => oveglay)

# Project structure

    .
    ├── src
    │   ├── main
    │   │   └── groovy
    │   │       └── Piglatin.groovy         # Implement this file
    │   └── test
    │   │   └── groovy
    │   │       └── PiglatinTest.groovy     # Run the tests to verify implementation.
    └── build.gradle                        # Run `gradle test` from command line to verify implementation.

# Files to implement

- [Piglatin.groovy](src/main/groovy/Piglatin.groovy): Implement translate()

# Verification

```
gradle test
```
