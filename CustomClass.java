public class CustomClass{
   private String name;
   private String charClass;
   private String race;
   private double intelligence;
   private int movement; 
   private boolean poisonImmunity; 
   
   public characterSheet(){
      name = "Carolus";
      charClass = "Wizard";
      race = "Half Elf";
      intelligence = 19.5;
      movement = 35;
      poisonImmunity = false; 
    }
    
    public characterSheet(String name, String charClass, String race, double intelligence, int movement, boolean poisonImmunity;){
      this.name = name; 
      this.charClass = charClass;
      this.race = race;
      this.intelligence = intelligence;
      this.movement = movement;
      this.poisonImmunity = poisonImmunity; 
      
      