import java.util.List;
import java.util.Stack;

public class IterativeDFS {

    public void dfsUsingStack(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        node.setVisited(true);
        while (!stack.isEmpty()){
            Node element = stack.pop();
            System.out.print(element.getData() + " ");
            List<Node>neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node tmp = neighbours.get(i);
                if(tmp !=null && !tmp.isVisited()){
                    stack.add(tmp);
                    tmp.setVisited(true);
                }
            }
        }
    }

}
