# RunnerPractice
1) StopLight
   Add a method changeLight() that has no return type and takes no parameter.
   If the color of the light is red, the color changes to green,
   if the color of the light is green, it changes to orange
   and if the color of the light is orange, it changes to red.
   Use the equals() method to test the value of a Color object.

   Write a toString() method that returns a String that gives the state of the light in one complete sentence.
  
   In the runner make a new StopLight object that 
   sets the light to green in the constructor
   calls changeLight() on the StopLight object
   and prints the state after each change.
    
2) Grade
   Add a graduate() method that has an int return type and takes a String named mark as a parameter.
   If mark is an A, a B or a C then the grade instance variable changes to the next level
   (i.e. freshman -> sophomore -> junior -> senior -> freshman) and the method returns 1.
   If the mark is a D or an F then the grade remains the same and the method returns 0.
   If the mark is not A, B, C, D or F then grade remains the same and the method returns -1;
   Use the equals() method to test the value of a String object.
    
   In the runner make a new Grade object that sets the grade to "freshman".
   Demonstrate all of the functionality of the Grade class.
    
3) FiveSpeed
   Add a shiftUp() method that has an int return type and no parameters.
   If inGear is true and gear < 5, the value of gear is increased by one.
   If inGear is true and gear = 5, the value of gear is unchanged.
   If inGear is false then inGear is set to true and gear is set to 1.
   The value of gear is returned.
    
   Add a shiftDown() method that has an int return type and no parameters.
   If inGear is true and gear >2, the value of gear is decreased by one.
   If inGear is true and gear = 1, the value of inGear is set to false and gear is set to -1.
   If inGear is false no action is taken.
   The value of gear is returned.
   
   In the runner make a new FiveSpeed object. Show that the car can shift up to 5th gear and no farther,
   then show that it shifts down to one and then sets inGear to false.
