Purpose:
•	This is a prototype of the project LockedMe.com developed by Harshita Kandula as part of the product digitalization initiative of the company Lockers Pvt Ltd
Features:
•	Display the following when the application opens:
o	Application name and the developer details 
o	The details of the user interface 
o	Options displaying the user interaction information 
o	Features to accept the user input to select one of the options listed 

•	The first option should return the current file names in ascending order. Here root directory can be either empty or may contain few files or folders in it
•	The second option should return the details of the user interface such as options displaying the following:
•	Add a file to the existing directory list (Ignoring case sensitivity)
•	Delete a user-specified file from the existing directory list (Case sensitivity included to ensure the accuracy of the file being deleted)
	Return a message if FNF (File not found)
•	Search a user-specified file from the existing directory list (Ignore case sensitivity)
	Return a message if FNF (File not found)
•	Navigation option to close the current context and return to the main context

•	The Third option should be for closing the application

Algorithms Used
•	Used java Collections to collect the file names
•	Use Collections.sort to sort the file names 
•	Java.io.File to manage file operations.
•	Used Exception handlers to catch the exceptions and supress them along with printing an error message.


