public class Main {
    public static void main(String[] args) {

        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");

        A.addNeighbours(C);
        A.addNeighbours(B);
        B.addNeighbours(C);
        B.addNeighbours(E);
        C.addNeighbours(D);
        D.addNeighbours(E);
        E.addNeighbours(C);
        A.addNeighbours(F);

        RecursiveDFS test = new RecursiveDFS();
        test.dfs(A);

        System.out.println();
        A.setVisited(false);
        B.setVisited(false);
        C.setVisited(false);
        D.setVisited(false);
        E.setVisited(false);
        F.setVisited(false);

        IterativeDFS test1 = new IterativeDFS();
        test1.dfsUsingStack(A);
    }
}
