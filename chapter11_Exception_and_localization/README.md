# Chapter 11

## 11.1. Understanding
- A method can handle the exception itself or make it the caller's responsibility.
- **Throwable** is the parent class of all exceptions, including **Error** class. <br>
- 3 exception types:<br>
![Screenshot from 2023-11-18 23-16-41](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/fa985b8b-4623-4fe3-a00f-ffb7c01cf753)<br>
- 1. Checked exception (Compile time exceptions): Handle or declare rule - should throw or use try-catch, otherwise compile error. Inherit **Exception**, inherits **Throwable**. Ex: IOException<br>
![Screenshot from 2023-11-18 23-35-16](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/9b3e0101-2042-4e6a-a153-ed637a6c2831)<br>
- 2. Unchecked exception (Runtime exceptions): does not need to be declared or handled by the code where it is thrown. but okay for code to catch. inherits **RuntimeException** or **Error**. **RuntimeException** inherits **Exception** class. Ex: NullPointerException <br>
![Screenshot from 2023-11-18 23-35-07](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/a5b28754-e21c-4ea4-bfe4-38219b6e780b)<br>
- 3. Error: System error - OS is down, disk drive dissapeared, ran out of memory. inherits **Error**. Your code should not attempt to recover from it.

[`Demo.java`](1_understanding_exceptions/Demo.java)

## 11.2. Throwing an exception
- Two types of code that result in an exception.
- can pass a String parameter with a message when creating an exception, or you can pass no parameters and use the defaults.
- Exception is an Object, can store in an object reference.
[`Demo.java`](2_throwing_an_exception/Demo.java)
<br>

- Calling methods that throw exceptions
[`Bunny1.java`](2_throwing_an_exception/Bunny1.java)
- When a checked exception declared inside a catch block, make sure the code in the associated try block is capable of throwing the exception or a subclass of the exception. If not, the code is unreachable and does not compile.
[`Bunny2.java`](2_throwing_an_exception/Bunny2.java)
- Overriding methods with exceptions
- An overridden method may not declare any new or broader checked exceptions than the method it inherits.
[`Bunny3.java`](2_throwing_an_exception/Bunny3.java)
- An overriden method not declaring one of the exceptions thrown by the parent method is legal.
[`Bunny4.java`](2_throwing_an_exception/Bunny4.java)
- Printing an exception: 3 ways
[`Bunny.java`](2_throwing_an_exception/Bunny.java)

## 11.3. Exception classes
- RuntimeException classes - unchecked exceptions
![Screenshot from 2023-11-20 17-56-23](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/58a75f52-c18e-4ce7-bc1d-3634be214442)<br>
[`RuntimeExceptions.java`](3_exception_classes/RuntimeExceptions.java)
- **Helpful NullPointerException**: The JVM now tells you the object reference that triggered the NullPointerException! Ex: <parameter1><br>
[`Frog.java`](3_exception_classes/Frog.java)<br>
[`Demo.java`](3_exception_classes/Demo.java)
<br>
- Checked exceptions

<br>
- Error

## 11.4. Handling exceptions


## 11.5. Automatic resource management