

/** Creates a cafe 
 * 
 */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /** Class constructor
    * @param Cafe's name, address and number of floors
    */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 20;
        this.nCreams = 10;
        this.nCups = 120;

        System.out.println("You have built a cafe: ☕");
    }

    
    /** Sell a cup of coffee!!
    * @param size of order (ounces), number of sugar packets, amount of cream, number of cups
    */

    //public void sellCoffee(int size, int nSugarPackets, int nCreams); Am I allowed to change this?
    public void setSellCoffee(int size, int sugar, int cream, int cup) {
        this.nCoffeeOunces = this.nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - sugar;
        this.nCreams = this.nCreams - cream;
        this.nCups = this.nCups - cup;

        restock(size, sugar, cream, cup);

        System.out.println("Here is you order of " + cup + " cup of coffee with "
        + size + " ounces of expresso, " + sugar + " packets of sugar and " +
        cream + " packets of cream. Enjoy!");
    }

        
        /** Restock the inventory
        * @param size of order (ounces), number of sugar packets, amount of cream, number of cups
        */

    private void restock(int size, int sugar, int cream, int cup) {
        if (size > this.nCoffeeOunces){
            this.nCoffeeOunces = this.nCoffeeOunces*10;
            System.out.println("Just a moment. We're restocking the coffee");
         }
        if (sugar > this.nSugarPackets) {
            this.nSugarPackets = this.nSugarPackets*10;
            System.out.println("Just a moment. We're restocking the sugar");
        }
        if (cream > this.nCreams) {
            this.nCreams = this.nCreams*10;
            System.out.println("Just a moment. We're restocking the cream");
        }
        if(cup > this.nCups) {
            this.nCups = this.nCups*10;
            System.out.println("Just a moment. We're restocking the cups");
        }
     }
    

    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "Smith College", 1);
        System.out.println(Compass);

        Compass.setSellCoffee(10, 5, 3, 1);
        Compass.setSellCoffee(10, 5, 8, 1);


    }
    
}
