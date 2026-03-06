public class Coda extends Lista{

    public void enqueue(String valore) {
        accodamento(valore);
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }

        String valore = lettura(0);
        eliminazione(0);
        return valore;
    }

    public String peek() {
        if (isEmpty()){
            return null;
        }

        String valore = lettura(0);
        return valore;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }
}