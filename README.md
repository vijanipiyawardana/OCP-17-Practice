# OCP 17 Practice projects



``` diff
- creating and using a .jar file
```

### OCP-17-Practice/Hardcoded/JarExample

##### inside this folder: JarExample/LotteryLib/src
#### javac com/postcode/draw/LotteryDraw.java
#### jar -cvf LotteryLib.jar com/postcode/draw/\*.class

##### to make the jar inside JarExample folder (2 folders back)
#### jar -cvf ../../LotteryLib.jar com/postcode/draw/*.class

##### inside this folder: JarExample/LotteryMain/src
##### compiling Main.java with the LotteryLib.jar file
#### javac -cp /media/vijani/2CB4BCFFB4BCCD18/Vijani_projects/OCP-17-Practice/Hardcoded/JarExample/LotteryLib.jar com/postcode/

##### run Main.java with the LotteryLib.jar file
#### java -cp .:/media/vijani/2CB4BCFFB4BCCD18/Vijani_projects/OCP-17-Practice/Hardcoded/JarExample/LotteryLib.jar com/postcode/main/Main

(here, : is used to separate different class paths. If you want to consider .jar files in multiple class paths, you can use : to put them into class path. And a . (dot) means the current folder. It says to consider the Main class in the current folder to run)
