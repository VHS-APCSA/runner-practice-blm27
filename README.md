# RunnerPractice
1) StopLight
  Add a method changeLight() that has no return type and takes no parameter.
  If the color of the light is red, the color changes to green,
  if the color of the light is green, it changes to orange
  and if the color of the light is orange, it changes to red.
  
  Write a toString() method that returns a String that gives the state of the light in one complete sentence.
  
  Use the equals() method to test the value of a Color object.
  
  In the runner make a new StopLight object that 
    sets the light to green in the constructor
    calls changeLight() on the StopLight object
    and prints the state after each change.
    
 2) Grade
    Add a graduate() method that an int return type and takes a String named mark as a parameter.
    If mark is an A, a B or a C then the grade instance variable changes to the next level
    (i.e. freshman -> sophomore -> junior -> senior -> freshman) and the method returns 1.
    If the mark is a D or an F then the grade remains the same and the method returns 0.
    If the mark is not A, B, C, D or F then grade remains the same and the method returns -1;
    
    In the runner make a new Grade object that sets the grade to "freshman".
    Demonstrate all of the functionality of the Grade class.
    
 3)
