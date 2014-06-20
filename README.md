# Video Store Inventory

This is an in-memory database for a video store inventory. The video store sells movie DVDs. Each movie has a name, price, unique id and a quantity. The store uses sequential integers for unique ids. 

We perform following operations:
 1. Add new movies.
 2. Sell a movie in the inventory.
 3. Add new copies of existing movies
 4. Change the price of a movie
 5. Find the price and/or quantity of a movie by either name or id.  
 
 This implementation shows the use of following Design Patterns:
 1. Memento Design Pattern -- To copy the data in an Inventory object. The memento is serialized so it can be saved in a file.
 2. Command Design Pattern -- A command is created(Eg - AddMovieCommand) for each operation that changes the state of the Inventory object .
 3. Decorator Design Pattern --  The decorator will create the command for every operation that changes the Inventory object's state.



