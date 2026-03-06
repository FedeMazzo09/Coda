public class Test {

    public static void main(String[] args) {
        Coda c = new Coda();
        c.enqueue("A");
        c.enqueue("B");
        c.enqueue("C");
        c.enqueue("D");

        c.stampa();

        System.out.println("Peek: " + c.peek());

        System.out.println("Dequeue: " + c.dequeue());
        c.stampa();

        System.out.println("Dequeue: " + c.dequeue());
        c.stampa();

        System.out.println("È vuota? " + c.isEmpty());

        c.clear();

        System.out.println("È vuota dopo il clear? " + c.isEmpty());
    }
}