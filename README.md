[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/92arv5Vv)
Owethu Khumalo
St10513544

Features
Main Screen
Welcome screen for users.
Navigation button to proceed to the gear management screen.
Gear Management Screen
Add camping gear items.
Enter gear category.
Specify item quantity.
Add comments or notes.
Calculate and display the total number of packed items.
Validate user input before storing data.
Detailed View Screen
Display all stored camping gear information.
Show:
Item Name
Category
Quantity
Comments
Return to the previous screen using the Back button.
Technologies Used
Programming Language: Kotlin
IDE: Android Studio
Platform: Android
UI Design: XML Layouts
Data Storage: ArrayLists (Temporary In-Memory Storage)
Application Structure
MainActivity

Responsibilities:

Displays the welcome screen.
Navigates to the gear management screen.
MainScreen

Responsibilities:

Captures user input.
Stores data in ArrayLists.
Calculates total packed items.
Navigates to the detailed view.
DetailedActivity

Responsibilities:

Retrieves stored data.
Displays all camping gear information.
Allows navigation back to the previous screen.
Data Structures

The application uses four ArrayLists stored in a Companion Object:

val itemNames = ArrayList<String>()
val categories = ArrayList<String>()
val quantities = ArrayList<Int>()
val comments = ArrayList<String>()

These arrays store information at matching indexes.

Example:

Index	Item Name	Category	Quantity	Comment
0	Tent	Shelter	1	Family tent
1	Flashlight	Equipment	2	Extra batteries included
Pseudocode
Add Gear Process
START

IF any input field is empty THEN
    Display "Please fill in all fields"
ELSE
    Store item name
    Store category
    Store quantity
    Store comment

    Calculate total quantity

    Display total items packed

    Clear all input fields

    Display "Gear Added"
END IF

END
View Details Process
START

FOR each item in the gear list
    Display item name
    Display category
    Display quantity
    Display comment
END FOR

END
User Guide
Adding Gear
Open the application.
Click the Proceed button.
Enter:
Item Name
Category
Quantity
Comment
Click Add.
The item will be stored and the total quantity updated.
Viewing Gear Details
Click the View button.
A detailed list of all stored gear items will be displayed.
Click Back to return to the previous screen.
Error Handling

The application performs validation to ensure:

No field is left empty.
Users receive feedback through Toast messages.
Quantities are properly calculated before display.
Future Improvements
Database integration using SQLite or Room Database.
Edit existing gear entries.
Delete gear entries.
Search and filter functionality.
Save data permanently between application sessions.
Improved user interface and visual design.
Category-based sorting.
Author

Developer: Owethu Khumalo

Project: Camping Gear Tracker App

Language: Kotlin

Development Environment: Android Studio

License

This project was developed for educational purposes and may be modified or extended for future development and learning activities.
