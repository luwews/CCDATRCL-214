public class Character {
   
        // Attributes
        int strength;
        int agility;
        int intelligence;
        String name;
    
        // Method
        public void sayMyName() {
            System.out.println("Hello I am " + name);
        }
        public void sayMyStrength() {
            System.out.println("my strength is " + strength);
        }

        public void sayMyAgility() {
            System.out.println("my agi is " + agility);
        }

        public void sayMyintellegence() {
            System.out.println("my int is " + intelligence);
        }
        // Constructor
        public Character(int str, int agi, int intel, String characterName) {
            strength = str;
            agility = agi;
            intelligence = intel;
            name = characterName;
        }
    
    
}
