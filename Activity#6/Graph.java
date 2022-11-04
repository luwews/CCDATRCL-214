public class Graph {
    class Edge {
        String src, dest;
    }

    int vertices, edges;

    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        int noVertices = 12;
        int noEdges = 12;
        Graph mySocialNetwork = new Graph(noVertices, noEdges);


        mySocialNetwork.edge[0].src = "Luis";
        mySocialNetwork.edge[0].dest = "tristan";

        mySocialNetwork.edge[1].src = "Luis";
        mySocialNetwork.edge[1].dest = "jap";

        mySocialNetwork.edge[2].src = "Luis";
        mySocialNetwork.edge[2].dest = "jane";

        mySocialNetwork.edge[3].src = "luis ";
        mySocialNetwork.edge[3].dest = "richael";

        mySocialNetwork.edge[4].src = "Luis";
        mySocialNetwork.edge[4].dest = "rhob";

        mySocialNetwork.edge[4].src = "Luis";
        mySocialNetwork.edge[4].dest = "chi";

        mySocialNetwork.edge[5].src = "Luis";
        mySocialNetwork.edge[5].dest = "fia";

        mySocialNetwork.edge[6].src = "Luis";
        mySocialNetwork.edge[6].dest = "john";

        mySocialNetwork.edge[7].src = "Luis";
        mySocialNetwork.edge[7].dest = "jerome";

        mySocialNetwork.edge[8].src = "Luis";
        mySocialNetwork.edge[8].dest = "maui";

        mySocialNetwork.edge[9].src = "Luis";
        mySocialNetwork.edge[9].dest = "mark";

        mySocialNetwork.edge[10].src = "jane";
        mySocialNetwork.edge[10].dest = "neal";

        mySocialNetwork.edge[11].src = "jap";
        mySocialNetwork.edge[11].dest = "tris";

        for (int i = 0; i < noEdges; i++) {
            System.out.println(mySocialNetwork.edge[i].src + " - " + mySocialNetwork.edge[i].dest);
        }

    }
}
