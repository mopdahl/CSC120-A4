Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Encapsulation` affects your programming?
- What worked, what didn't, what advice would you give someone taking this course in the future?

ENCAPSULATION:
I found that encapsulation emphasizes the relationships between classes. When using encapsulation, it is much less efficient to consider each class in a vacuum.

EXPERIENCE / ADVICE:
I was initially confused by what Car.addPassenger/removePassenger and Passenger.boardCar/getOffCar were supposed to do. At first, I put all functionality within the Car class (checking if conditions were met and modifying the passengers array), and just called this method within the Passenger class. I later changed this so that the Car class only checks if conditions are met, while the Passenger class modifies the contents of the  Car's passenger array. However, for this to be possible, I had to add a getter method for Car.passengers.

I would advise that future students take the time to fully understand the requirements and intent behind each part of the program before planning how to implement it.