# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].
```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter :uses
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses
    class AlohaWorld {
        + main(String[] args): void
        - AlohaWorld()
    }
    class Greeter {
        - name: String
        - locality : int
        - localityList :List<String>
        + Greeter (String name)
        + Greeter(String name, int locality)
        + GetName(String)
        + getLocality(int locality)
        + void setLocality(int locality)
        + String greet()
        + String greet(boolean asciiOnly)
        + String getLocalityString()
        + int hashCode()
        + boolean equals(Object obj)
        + String toString()
        + List<String> getLocalityList()
        
    }
    class ConsoleView {
        - ConsoleView()
        + String getName()
        + int getLocality()
        + boolean checkRunAgain()
        + void printGreeting(String greeting)
    }
```


### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).

1. The program starts with the main function in AlohaWorld.java, where it invokes the static function of ConsoleView class to create an interaction with user using standard system input. The input will get the name of the user.
2. Then it repeats the same but asking the question about the locality.
3. It creates a new Greeter object using the name and locality from user inputs.
4. Greeter class will print the greeting constructed from its instance variables name and locality
5. It asks the user if they wanted to be greet again using another locality.
6. Set the locality of the existing Greeter object to the new value.
7. repeat the process until the user doesn't want to interact.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * `final class`
   * `static `
   * `system.in`
   * `system.out`
   * `.trim()`
   * `Integer.parseInt(）`
   * `hashcode()`
   * `@override`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * Static in Java is a method which belongs to the class and not to the object. We don't need to creat an instance to use this class.
    * System.in reads data from user input. System.out writes data to output.
    * trim() is used to remove leading and trailing whitespace from a string.(without the space between)
    * Integer.parseInt(）convert a string to an int.
    * @override is used to override a function that has been defined in its parent class.

3. What does `main` do in Java?
   
   The main() in JAVA is the start point in whole program. When we run the whole program, it will search and run the main() function first.

4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    The 'toString()' in Java is to convert an object into string representation.
    The reason to have a 'toString()' method is to make the output more easily to understand and more readable. And it includes the attribute of the class.

5. What is javadoc style commenting? What is it used for? 

    Javadoc style commenting is multi-line comment in Java, used for documentation for codes, to ensure consistent and structured documentation. 
    The format of this start with  /** and end with */ .
    It can be easily converted into HTML.

6. Describe Test Driving Development (TDD) in your own words. 

    It's a way that write test before actually write the code. In other words, write the test first. Base on the test, we can write the code to pass the test and improve the code.

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

   Abstraction to keep the interaction away from other classes. This can reduce errors when developers are modifying the interaction.


2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
    
   The current locality list is hard-coded. That makes any change to require a re-compilation.
   We could read from a database or config file to make the program more dynamic.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.

[^3]: Static class in Java. https://home.csulb.edu/~pnguyen/cecs277/lecnotes/static%20in%20java.pdf 

[^4]: Java System.in, System.out, and System.error. https://jenkov.com/tutorials/java-io/system-in-out-error.html

[5^]: Java String trim() Method. https://www.geeksforgeeks.org/java-string-trim-method-example/

[^6]: Java - parseInt() Method. https://www.tutorialspoint.com/java/number_parseint.htm

[^7]: Overriding in Java. https://www.geeksforgeeks.org/overriding-in-java/


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java