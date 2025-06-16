public class Main {
    public static void main(String[] args) {
        System.out.println("===== Testing MyStack =====");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop()); // 3
        System.out.println("Peek: " + stack.peek());  // 2

        System.out.println("\n===== Testing MyQueue =====");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Dequeued: " + queue.dequeue()); // A
        System.out.println("Peek: " + queue.peek());         // B

        System.out.println("\n===== Testing MyMinHeap =====");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(42);
        heap.insert(17);
        heap.insert(33);
        heap.insert(5);
        System.out.println("Extracted Min: " + heap.extractMin()); // 5
        System.out.println("Extracted Min: " + heap.extractMin()); // 17
    }
}
