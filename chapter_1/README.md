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
- to run the compiled code in build folder:
```shell
java -cp build Zoo.java
```
```shell
java -classpath build Zoo.java
```
```shell
java --class-path build Zoo.java
```

Classes and Source Files
[`Demo.java`](1_class_structure/Demo.java)
<br>Fields and methods
[`Animal.java`](1_class_structure/Animal.java)
<br>Comments
[`Comment.java`](1_class_structure/Comment.java)

## 1.2. Main method
<br>Writing a main() method
[`Zoo.java`](2_main_method/Zoo.java)

## 1.3. Packages


## 1.3. Jar example

## 1.4. Creating objects

## 1.5. Data types

## 1.6. Declaring variables

## java Zoo Donkey Monkey Rabbit

