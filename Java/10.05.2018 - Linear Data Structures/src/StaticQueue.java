public class StaticQueue {
    int capacity, head, tail;
    int[] data;

    public StaticQueue() {
        capacity = 10;
        head = -1;
        tail = -1;
        data = new int[capacity];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void enqueue(int x) {
        tail++;
        tail %= capacity;
        if (head == tail) {
            resizeData();
        }
        data[tail] = x;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        head++;
        head %= capacity;
        int result = data[head];
        return result;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        return data[(head + 1) % capacity];
    }

    private void resizeData() {
        int[] newData = new int[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            head++;
            head %= capacity;

            newData[i] = data[head];
        }
        data = newData;
        head = -1;
        tail = capacity - 1;
        capacity *= 2;
    }
}
