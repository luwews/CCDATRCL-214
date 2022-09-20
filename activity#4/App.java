import java.util.LinkedList;
import java.util.Queue;

public class App {

        public static void main(String[] args) throws Exception {
      Queue<String> INF214 = new  LinkedList<>();
      INF214.add("Verzosa");
      INF214.add("labon");
      INF214.add("Bablis");
      INF214.add("jalalon");
      INF214.add("paller");
      System.out.println(INF214.peek());
      INF214.remove();
      INF214.remove();
      INF214.remove();
      INF214.remove();
      INF214.remove();

      INF214.add("bolanos");
      INF214.add("abella");
      INF214.add("torres");
      INF214.add("par");
      INF214.add("lalo");
      System.out.println(INF214.size());
    System.out.println(INF214.peek());
}
}
