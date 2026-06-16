Name: Shahar Ankonina
Class: CIS 35A
Assignment: Lab 6

FILES INCLUDED:
Student.java
Statistics.java
StudentGrade.java
StudentGradingException.java
Util.java
FileIO.java
StudentAPI.java
StudentAPIImpl.java
Driver1.java
Driver2.java
Driver3.java
UML.pdf
readme.txt
data.txt

DESCRIPTION:
In this lab, we build upon the file I/O and object relationships established in Lab 5 to implement Exception Handling, Serialization, and an API/Adapter pattern to robustly manage and access student grading data.

Project 1 [Exception Handling]: Uses StudentGradingException and Driver1 to centralize the capture of errors when reading student data. It logs errors to an external text file and dynamically prompts the user via the console to fix missing file issues.

Project 2 [Serialization]: Uses the StudentGrade wrapper class, FileIO, and Driver2 to package the student array and calculated statistics into a single data transfer object. It then serializes and deserializes this object to and from a binary file.

Project 3 [API / Adapter Pattern]: Uses the StudentAPI interface, StudentAPIImpl, and Driver3 to abstract the data layer. It provides a clean interface for external programs to print classroom statistics and look up specific student scores without directly interacting with the underlying model classes.

HOW TO RUN:
1. Open the project in Eclipse.
2. Ensure data.txt is present in the main root project folder (outside of the src folder).
3. Right-click on Driver1.java inside the driver package. Select 'Run As' then 'Java Application' to test the exception handling (input 'data.txt' in the console when prompted).
4. Run Driver2.java to test object serialization and generate the 'student_grades.ser' file.
5. Run Driver3.java to test the API adapter, which will read the serialized file and display the requested statistics and specific student scores.