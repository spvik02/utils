# utils

Build project:

./gradlew clean build

Publish jar file to maven local repository C:\Users\user_name\.m2\repository\

./gradlew publishToMavenLocal

Assemble custom jar utils-1.3.5.jar. It should be compatible with java 8.
The manifest file should contain the name and version of your jar.
The jar should contain class StringUtils with method boolean isPositiveNumber(String str).
Use Apache Commons Lang 3.10 library to implement this method. 
Write one any unit test for your StringUtils.isPositiveNumber(String str) using JUnit 5.+.
