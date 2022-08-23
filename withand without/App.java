public class App {
    public static void main(String[] args) throws Exception {
       // Creates a new object named "Knight" from Character class
       Character knight = new Character(10, 5, 0, "Chen");
       // Calls the sayMyName method
       knight.sayMyName();

       // Creates a new object named "mage" from Character class
       Character mage = new Character(0, 5, 10, "Akasha");
       // Calls the sayMyName method
       mage.sayMyName();

       // Creates a new object named "mage" from Character class
       Character thief = new Character(5, 10, 0, "Gondar");
       // Calls the sayMyName method
       thief.sayMyName();
        
       noconstructor healer= new noconstructor();
       healer.agility=22;
       healer.strength=11;
       healer.intelligence=30;
       healer.name="omniknight";
       healer.hiMyName();
       healer.hiMyStrength();
       healer.hiMyAgility();
       healer.hiMyintellegence();
       };

    
}
