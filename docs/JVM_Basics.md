JDK (Java Development Kit): The JDK is the complete toolkit used by developers to write, compile, and run Java programs.
It contains the JRE, compiler (javac), debugging tools, and libraries.

JRE (Java Runtime Environment): The JRE provides the environment required to run Java applications.
It provides the libraries and the JVM needed to execute Java programs, but does not include the compiler.
So, we can only run the programs with JRE, but we can't build the programs.

JVM (Java Virtual Machine): The JVM is the part of Java that actually runs the compiled program.
It takes Java’s bytecode and converts it into instructions that your machine understands.
The JVM also handles things like memory, execution flow, and garbage collection while the program runs.

ByteCode: When we compile a .java file, the compiler converts into Bytecode i.e. .class files.
This bytecode is not tied to any operating system, which is why the same .class file can run anywhere a JVM exists.

Write Once, Run Anywhere: It means that a Java program written on one system can run on any other system without 
modification. This is possible because Java code is compiled into bytecode, and each platform has its own JVM that 
knows how to execute that bytecode.
So developers don’t need to rewrite or recompile their programs for different operating systems like Windows, macOS, 
or Linux