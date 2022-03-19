# Hustlers-1022-Project

Name of Team:
 Hustlers
 
First name:
Amanveer
 	Last name:
 Singh
 	York Email:
 aman30@my.yorku.ca	Lecture Section:
 P	Lab Section: 1
 
First name:
 Angeline 	Last name:
 Samuvel 
 	York Email:
 angel003@my.yorku.ca	Lecture Section:
 P	Lab Section: 2
 
First name:
Harsh
 	Last name:
Kuddu	York Email:
 harshk10@my.yorku.ca	Lecture Section:
 N	Lab Section: 1
 
First name:
 Nathaniel	Last name:
Acker 
 	York Email:
nacker@my.yorku.ca 
 	Lecture Section:
 N	Lab Section: 3
 
Project Title: 
Guessing game
 
Project Description: 
Our program will allow for the user and the computer to engage in a game to guess what number the computer is thinking of. The number will be randomized between the parameter numbers 1-10 (easy), 1-30 (medium), 1-50 (hard), and 1-100 (extreme). The user will have the choice to choose the level. The user will be able to guess as many times as they like until they enter a 0, however the number being guessed will be different each time. The program records how many successful guesses the user has had in a row and stores a high score, the most guessed correctly in a row, along with displaying a congratulatory message. 

The points associated with the user guessing the number correctly will be dependent upon the level and number of guesses correct in a row. Everytime the user gets a guess correct they will receive the base point for the level and every consecutive correct guess will be awarded with double the previous point. When the user gets a guess wrong the point is reverted back to base point for the level.

For easy level the base point is 1, for medium level it is 2. For the hard level the base point is 3 and for the extreme level the base point is 5.

For example if the user is playing the medium level and gets 3 correct in a row. The points awarded would be 1+2+4. Then the user gets one wrong and gets 2 correct in a row again, the point then would look like, 1+2. In total the user got 1+2+4+1+2= 9 points.

Also, there would be other functionalities like am options to turn on hints and change the background of the app.

 
 
 
 
 
Functional requirements: 
1.	The app opens up to the initial Welcome page containing all the correct layout and design
1.	Title of the game
2.	Asks to enter nickname
3.	Six buttons 
1.	Introduction and rules
2.	High scores
3.	Start, which leads to Select a level screen - there are three levels; level 1, 2 and 3
4.	Exit - exit button appears on each phase of the game (e.g while viewing rules on introductions page or in between the game)
5.	Themes button  
2.	The user will be incited to pick a level of their choice and begin playing. 	
3.	Once they start the game, the program randomizes a number.
4.	The user is required to enter ONLY numbers.
5.	In the event that the client inputs something besides numbers, an alarm message will pop and state: "invalid input, please enter a number"
6.	A functions randomizes one more number inside the given boundaries and stores this everytime the client guesses wrong
7.	A function tracks the number of guesses the user gets right in a row 
8.	A method keeps track of the points according to the correct guesses and consecutively updates the scoring data
9.	A function outputs the numbers guessed correctly overall, score, and congratulatory message when a 0 or home button is inputed
10.	User is directed to homepage after finishing the game or they can exit the game
11.	Welcome page of the website contains multiple buttons as mentioned in (1).
12.	Once the user exits the game and opens it again the restored data under their username will no longer be available. 
13.	The user will be allowed to select backgrounds of their liking through a dropdown menu for aesthetic pleasure









