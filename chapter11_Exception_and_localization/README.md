# Chapter 11

## 11.1. Understanding
- A method can handle the exception itself or make it the caller's responsibility.
- **Throwable** is the parent class of all exceptions, including **Error** class. 
- 3 exception types:
![Screenshot from 2023-11-18 23-16-41](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/fa985b8b-4623-4fe3-a00f-ffb7c01cf753)<br>
- 1. Checked exception (Compile time exceptions): Handle or declare rule - should throw or use try-catch, otherwise compile error. Inherit **Exception**, inherits **Throwable**. Ex: IOException
![Screenshot from 2023-11-18 23-35-16](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/9b3e0101-2042-4e6a-a153-ed637a6c2831)
- 2. Unchecked exception (Runtime exceptions): does not need to be declared or handled by the code where it is thrown. but okay for code to catch. inherits **RuntimeException** or **Error**. **RuntimeException** inherits **Exception** class. Ex: NullPointerException
![Screenshot from 2023-11-18 23-35-07](https://github.com/vijanipiyawardana/OCP-17-Practice/assets/6631956/a5b28754-e21c-4ea4-bfe4-38219b6e780b)
- 3. Error: System error - OS is down, disk drive dissapeared, ran out of memory. inherits **Error**. Your code should not attempt to recover from it.

[`Demo.java`](1_understanding/Demo.java)
