# Chapter 1

- javac: converts .java source files into .class bytecode
- java: Executes the program
- jar: Packages files together
- javadoc: Generates documentation

## 1.1. Class structure

- class: basic building block
- object: a runtime instance of a class in memory
- reference: a variable that points to an object
- members of a class:
  - methods: functions or procedures, operate on program's state
  - fields: variables, holds the state of the program
keyword: a word with special meaning in java

- to compile and have .class files inside build folder:
```shell
javac -d build Animal.java 
```
- to run the compiled code in build folder: (all three options do the same thing)
```shell
java -cp build Animal
```
```shell
java -classpath build Animal
```
```shell
java --class-path build Animal
```

Classes and Source Files
[`Demo.java`](1_class_structure/Demo.java)
<br>Fields and methods
[`Animal.java`](1_class_structure/Animal.java)
<br>Comments
[`Comment.java`](1_class_structure/Comment.java)

## 1.2. Main method

- main() method must be **public**
- main() method must have a **void** return type.
- main() method must be **static**
- canonical main() method signature
    `public static void main(String[] args)` 
- alternate form of main() method signature with the redundant **final** 
    `public static final void main(String[] args)`

<br>Writing a main() method
[`Zoo.java`](2_main_method/Zoo.java)

To run with arguments passed into main method:
```shell
java Zoo elephant rabbit
```
```shell
java -cp build Zoo elephant rabbit
```
```shell
java -cp build Zoo "african elephant" rabbit
```

- Single-File Source code: skipping explicit compilation step, useful for small programs, one file.
```shell
java Zoo.java elephant Zoo
```
```shell
java Zoo.java Zoo
```

## 1.3. Packages
### 1.3.1. Using Java Packages
- import from packages to use a java class
[`NumberPickerError.java`](3_packages/NumberPickerError.java)
[`NumberPickerCorrect.java`](3_packages/NumberPickerCorrect.java) <br>
- \* is the wildcard that matches all classes in a package
[`NumberPickerWildcard`](3_packages/NumberPickerWildcard.java) <br>
- The import statement imports only classes directly under the package.
[`AtomicIntegerDemo`](3_packages/AtomicIntegerDemo.java) <br>
- Redundant imports
[`NumberPickerRedundantImports`](3_packages/NumberPickerRedundantImports.java)
[`InputImportsRedundantImports`](3_packages/InputImportsRedundantImports.java)<br>
- Naming conflicts
[`NamingConflicts`](3_packages/NamingConflicts.java)

### 1.3.2. Create a new package
ClassA.java in packagea [`ClassA`](3_packages/packagea/ClassA.java)<br>
ClassB.java in packageb [`ClassB`](3_packages/packageb/ClassB.java)
- Compile both at once
```shell
javac packagea/ClassA.java packageb/ClassB.java
```
- Which will result;<br>
ClassA.class in packagea [`ClassA`](3_packages/packagea/ClassA.class)<br>
ClassB.class in packageb [`ClassB`](3_packages/packageb/ClassB.class)

- to run the program
```shell
java packageb.ClassB
```

- Compiling with wildcard: use \* to include all java files in a directory, if you have a lot of files in a package
```shell
javac packagea/*.java packageb/*.java
``` 

- Compiling to another directory: into build directory
```shell
javac -d build packagea/ClassA.java packageb/ClassB.java
```
- Which will result;<br>
ClassA.class in build/packagea [`ClassA`](3_packages/build/packagea/ClassA.class)<br>
ClassB.class in build/packageb [`ClassB`](3_packages/build/packageb/ClassB.class)<br>

- to run the program: can use one of the three options
```shell
java -cp build packageb.ClassB
```
```shell
java -classpath build packageb.ClassB
```
```shell
java --class-path build packageb.ClassB
```

### 1.3.3. Compiling with JAR file.
[`LotteryDraw`](3_packages/jar_example/LotteryLib/src/com/postcode/draw/LotteryDraw.java)<br>
[`Main`](3_packages/jar_example/LotteryMain/src/com/postcode/main/Main.java)<br>
[`postcodes`](3_packages/jar_example/postcodes.txt)<br>
- first compile LotteryDraw.java
- you are inside folder: chapter_1_Building_blocks/3_packages/jar_example/LotteryLib/src
```shell
javac -d ../build com/postcode/draw/LotteryDraw.java
```
- create LotteryDraw.jar in current folder
- you are inside folder: chapter_1_Building_blocks/3_packages/jar_example/LotteryLib/build
```shell
jar -cvf LotteryLib.jar com/postcode/draw/*.class
```
- compile Main.java with LotteryLib.jar
- you are inside folder: chapter_1_Building_blocks/3_packages/jar_example/LotteryMain/src
```shell
javac -cp /home/vijani/Documents/kata/OCP-17-Practice/chapter_1_Building_blocks/3_packages/jar_example/LotteryLib/build/LotteryLib.jar -d ../build com/postcode/main/Main.java
```
- run Main with LotteryLib.jar
- you are inside folder: chapter_1_Building_blocks/3_packages/jar_example/LotteryMain/build
```shell
java -cp .:/home/vijani/Documents/kata/OCP-17-Practice/chapter_1_Building_blocks/3_packages/jar_example/LotteryLib/build/LotteryLib.jar com/postcode/main/Main
```

Note: (here, : is used to separate different class paths. If you want to consider .jar files in multiple class paths, you can use : to put them into class path. And a . (dot) means the current folder. It says to consider the Main class in the current folder to run)
<br>

### 1.3.4. Ordering elements in a class

- Package declaration
- import statements
- Top-level type declaration: public class A --> this is required
- Field declarations
- Mathod declarations

## 1.4. Creating objects

## 1.5. Data types

## 1.6. Declaring variables
