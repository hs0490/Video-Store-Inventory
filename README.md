# Video Store Inventory

- This is an in-memory database for a video store inventory. The video store sells movie DVDs. 
- Each movie has a name, price, unique id and a quantity. 
- The store uses sequential integers for unique ids. 

We perform following operations:
 - Add new movies.
 - Sell a movie in the inventory.
 - Add new copies of existing movies
 - Change the price of a movie
 - Find the price and/or quantity of a movie by either name or id.  
 
This implementation shows the use of following Design Patterns:
 - Memento Design Pattern -- To copy the data in an Inventory object. The memento is serialized so it can be saved in a file.
 - Command Design Pattern -- A command is created(Eg - AddMovieCommand) for each operation that changes the state of the Inventory object .
 - Decorator Design Pattern --  The decorator will create the command for every operation that changes the Inventory object's state.



