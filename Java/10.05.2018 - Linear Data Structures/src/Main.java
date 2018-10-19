public class Main {
    public static void main(String[] args) throws Exception {

        StaticStack stack = new StaticStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(5);

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        StaticQueue queue = new StaticQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);

        while(!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();

        DynamicQueue dQueue = new DynamicQueue();
        dQueue.enqueue(1);
        dQueue.enqueue(2);
        dQueue.enqueue(3);
        System.out.println(dQueue.dequeue());
        dQueue.enqueue(4);
        dQueue.enqueue(5);

        while (!dQueue.isEmpty()){
            System.out.print(dQueue.dequeue() + " ");
        }
        System.out.println();

        DynamicStack dStack = new DynamicStack();
        dStack.push(1);
        dStack.push(2);
        dStack.push(3);
        System.out.println(dStack.pop());
        dStack.push(4);
        dStack.push(5);

        while (!dStack.isEmpty()){
            System.out.print(dStack.pop() + " ");
        }

    }
}
