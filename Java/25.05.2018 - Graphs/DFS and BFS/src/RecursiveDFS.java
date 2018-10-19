import java.util.List;

public class RecursiveDFS  {

    public void dfs(Node node){
        System.out.print(node.getData() + " ");
        List<Node> neighbors = node.getNeighbours();
        node.setVisited(true);
        for (int i = 0; i < neighbors.size(); i++) {
            Node tmp = neighbors.get(i);
            if(tmp != null && !tmp.isVisited()){
                dfs(tmp);
            }
        }
    }
}
