# OCP 17 Practice projects
``` diff
### - command line arguments
#### OCP-17-Practice/Hardcoded/Zoo.java
```
#### javac Zoo.java

#### java Zoo 
&emsp; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 at Zoo.main(Zoo.java:4)

#### java Zoo Donkey
&emsp; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 at Zoo.main(Zoo.java:5)

#### java Zoo Donkey Monkey
&emsp; Donkey

&emsp; Monkey

#### java Zoo Donkey Monkey Rabbit
&emsp; Donkey

&emsp; Monkey

#### java Zoo "Donkey Monkey" Rabbit
&emsp; Donkey Monkey

&emsp; Rabbit

#### java Zoo Zoo 2022
&emsp; Zoo

&emsp; 2022


### - creating packages and compiling with packages 

#### OCP-17-Practice/Hardcoded/packagea
#### OCP-17-Practice/Hardcoded/packageb

#### javac packagea/ClassA.java packageb/ClassB.java
Or
#### javac packagea/\*.java packageb/\*.java

#### java packageb.ClassB

### take class files into classes folder

#### javac -d classes packagea/ClassA.java packageb/ClassB.java

#### java -cp classes packageb.ClassB
Or
#### java -classpath classes packageb.ClassB
Or
#### java --class-path classes packageb.ClassB


