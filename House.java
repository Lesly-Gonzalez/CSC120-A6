import java.util.ArrayList;

/* This is a stub for the House class */


public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hDiningRoom) {
    super(name, address, nFloors); //The first set of step for constructing this house is constructing a building
    this.hasDiningRoom = hDiningRoom;
    this.residents = new ArrayList<String>();
 
    System.out.println("You have built a house: 🏠");
  }

//Tell us if there is a dinning room in the house
  public boolean hasDiningRoom(){
    if (hasDiningRoom == true){
        System.out.println("There is a dining hall in this house.");
      }
      else{
        System.out.println("There is no dining hall in this house.");
      }
      return hasDiningRoom;
  }

  //Return the number of residents in the house
  public int getResidents() {
    return this.residents.size();
  }

  //Method to update the `ArrayList` of `residents` every time someone moves in 
  public void setmoveIn(String name) {
    this.residents.add(0,name); //add.(index, new resident)
  }

  //Method to update the `ArrayList` of `residents` every time someone moves out
  public String setmoveOut(String name) {
    this.residents.remove(String.valueOf(name));
    return name; 
  }

  //method that tells us whether or not a given person is a resident of the `House`
  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    House chase = new House("Chase", "134 Elm st", 4, true);
    System.out.println(chase);
    System.out.println(chase.hasDiningRoom());
    System.out.println("Chase house has " + chase.getResidents() + " residents");
    chase.setmoveIn("Lesly");
    System.out.println("Chase house has " + chase.getResidents() + " residents");
    chase.setmoveIn("Katalina");
    System.out.println("Chase house has " + chase.getResidents() + " residents");
    chase.setmoveIn("Anglis");
    chase.setmoveIn("Bianca");
    System.out.println("Chase house has " + chase.getResidents() + " residents");
    System.out.println(chase.setmoveOut("Bianca") + " moved out");
    System.out.println(chase.isResident("Lesly"));
    System.out.println(chase.isResident("Bianca"));
  }

}