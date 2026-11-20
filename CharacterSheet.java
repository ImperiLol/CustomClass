public class CharacterSheet { 
   private String name;
   private String charClass;
   private String race;
   private double intelligence;
   private int movement; 
   private boolean poisonImmunity; 
   
   public CharacterSheet(){
      name = "Carolus";
      charClass = "Wizard";
      race = "Half Elf";
      intelligence = 19.5;
      movement = 35;
      poisonImmunity = false; 
    }
    
    public CharacterSheet(String name, String charClass, String race, double intelligence, int movement, boolean poisonImmunity) {
        this.name = name;
        this.charClass = charClass;
        this.race = race;
        this.intelligence = intelligence;
        this.movement = movement;
        this.poisonImmunity = poisonImmunity;
     }
     
     
    //Methoid 1: Display Character Sheet
     public void displayCharacter() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + charClass);
        System.out.println("Race: " + race);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Movement: " + movement);
        System.out.println("Poison Immunity: " + poisonImmunity);
    }


    // Method 2: Increase intelligence by a certain amount
    public void increaseIntelligence(double amount) {
        intelligence += amount;
        System.out.println(name + "'s intelligence increased by " + amount + ". New intelligence: " + intelligence);
    }

    // Method 3: Change movement speed; Allows for Character to move more squares per turn.
    public void setMovement(int newMovement) {
        movement = newMovement;
        System.out.println(name + "'s movement speed is now " + movement);
    }

    // Method 4: Toggle poison immunity to true or false. 
    public void togglePoisonImmunity() {
        poisonImmunity = !poisonImmunity;
        System.out.println(name + " poison immunity set to: " + poisonImmunity);
    }

    // Method 5: Get intelligence score (returns a value)
    public double getIntelligence() {
        return intelligence;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create character using default constructor
        CharacterSheet defaultChar = new CharacterSheet();
        defaultChar.displayCharacter();
        defaultChar.increaseIntelligence(2.5);
        defaultChar.setMovement(40);
        defaultChar.togglePoisonImmunity();
        System.out.println("Current Intelligence: " + defaultChar.getIntelligence());
    ///Generating new Character named John

      CharacterSheet John = new CharacterSheet("John", "Thief", "Tiefling", 15.0, 45, true);

    // John Leveled Up 
       John.displayCharacter();
       John.increaseIntelligence(1.0);
       System.out.println("Current Intelligence: " + John.getIntelligence());
    }
 }  