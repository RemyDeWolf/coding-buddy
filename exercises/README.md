# exercises files

Each exercise includes:
* A template for the class to implement with the method signatures.
* Some tests to verify the implementation is correct.
* A solution: the files ending with `.solution` won't be deployed. The tests should pass when running against the solution.
* A property file: coding-buddy.properties
    * successCommand: command to execute to test the exercise. It would only succeed if the tests are passing.
        * Default is `gradle test`.
    * levels: The elapsed times in minute to reach each level.
        * Default is `{"gold": 10, "silver": 30, "bronze": 60}`
        * If completed in less than 10 minutes -> 'gold'
        * If completed in less than 30 minutes -> 'silver'
        * If completed in less than 60 minutes -> 'bronze'
        * If completed in more than 60 minutes -> 'passed'

An exercise should not include:
* binaries such as libraries and jars: instead configure a build tool such as gradle to download dependencies.
