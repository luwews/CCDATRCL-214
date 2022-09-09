public class App {
    public static void main(String[] args) {
        Stack games_recentlyplayed = new Stack(5);
games_recentlyplayed.push("dota");
games_recentlyplayed.push("csgo");
games_recentlyplayed.push("valorant");
games_recentlyplayed.push("tetrio");
games_recentlyplayed.push("ytmusic");
        System.out.println("The size of the stack is: " +games_recentlyplayed.size());
        System.out.println("The top of the stack is: "+ games_recentlyplayed.peek());
games_recentlyplayed.pop();
        System.out.println("After pop");
games_recentlyplayed.printStack();
        System.out.println("The top of the stack is:" + games_recentlyplayed.peek());
      }
}
