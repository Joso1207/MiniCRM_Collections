Simple terminalapplication as a Mini- Customer Relations Managar

Customers are stored in a hashmap <String id,Customer customer_class> to bind ID to the stored classes.

Functions
Add Customer
Add/remove email(String)
Add/remove tags(String)
Add/remove notes(String)
List all information from a customer
List all customers

Using
Java JDK 24
Intellij IDEA 2025.2.1
Maven (Built into Intellij)


//Datastructur comments on tags, notes and email.
Email och Tags funkar bra som LinkedHashSet,  Då dessa håller både en ordning och håller unika values,  Tekniskt sett kan emails vara lika i deras text men hade vi använt en Email Klass så löser detta sig.
Notes skulle vara av interfacet list och ha en ordning,  Detta passar ArrayList perfect till då vi kan komma att läsa i mitten av listan.  LinkedList hade funkat men detta blir mer när vi är mer intresserade av första/sista index.





