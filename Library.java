import java.util.Hashtable;
import java.util.Enumeration;

/* This is a stub for the Library class */
public class Library extends Building{

    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();

      System.out.println("You have built a library: 📖");
    }
  
    //Add a book to the collection
    public void addTitle(String title) {
      this.collection.put(title, true);
    }

    //Remove a book from the collection
    public String removeTitle(String title) {
      this.collection.remove(title);
      return title;
    }

    //Check out a book
    public void setCheckOut(String title) {
      this.collection.replace(title, true, false);
      System.out.println("You are borrowing "+ title +". Enjoy, and please return it on time.");
    }

    //Return a book
    public void setReturn(String title) {
      this.collection.replace(title, false, true);
      System.out.println("You have succesfully returned the book " + title);
    }

    //See if the library has a book 
    public boolean containsTitle(String title) {
      //System.out.println(this.collection.containsKey(title));
      if (this.collection.containsKey(title) == true) {
        System.out.println("The book " + title + " is part of our collection");
      } else {
        System.out.println("The book " + title + " is not part of our collection");
      }
      return this.collection.containsKey(title); 
    }

    //Check if a book is available
    public boolean isAvailable(String title) {
      //System.out.println(this.collection.get(title));
      if (this.collection.get(title) == true) {
        System.out.println("The book " + title + " is available");
      } else {
        System.out.println("The book " + title + " is not currently available");
      }

      return this.collection.get(title); 
    }

    //prints out the entire collection
    public void printCollection() {
      Enumeration<String> keys = this.collection.keys();
      System.out.println("Neilson Library collection is composed by:");

      while (keys.hasMoreElements()) {
 
        // Displaying the Enumeration
        System.out.println(keys.nextElement());
    }
  }

    public static void main(String[] args) {
     Library Neilson = new Library("Neilson", "Smith College", 5);
     System.out.println(Neilson);
     Neilson.addTitle("Don Quixote");
     Neilson.addTitle("La Odisea");
     Neilson.addTitle("Azul");
     Neilson.printCollection();

     Neilson.removeTitle("Azul");
     Neilson.printCollection();

     Neilson.setCheckOut("Don Quixote");
     Neilson.containsTitle("Don Quixote");
     Neilson.isAvailable("Don Quixote");

     Neilson.setReturn("Don Quixote");
    }
  
  }