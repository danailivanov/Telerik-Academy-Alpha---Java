import java.util.ArrayList;
import java.util.List;

public class Node {

    private String data;
    private boolean visited;
    private List<Node> neighbours;

    public Node(String data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }
    public void addNeighbours(Node neighbourNode){
        neighbours.add(neighbourNode);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;

    }

    public List<Node> getNeighbours() {
        return neighbours;

    }

    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }
}
