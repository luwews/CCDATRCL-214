import java.util.LinkedList;
public class linkedliist {
    public static void main (String[]args ){

        LinkedList<String> Playlist = new LinkedList<>();
 
        Playlist.addFirst("waltz of four left feet");

        Playlist.addLast("celebrate");
    
        Playlist.add("just like you");
        Playlist.add("when i grow up");
        Playlist.add("umaasa");
        Playlist.add("photograph");
        Playlist.add("circles");

        System.out.println(Playlist.get(0));

        Playlist.set(6, "the feels");

        Playlist.remove(0);

        System.out.println("Updated playlist: " + Playlist);
    }
    
}
