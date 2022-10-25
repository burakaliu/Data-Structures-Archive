public class Main {
    public static void main(String[] args) {

        Node<Integer> integer = new Node<Integer>();
        Node<String> string = new Node<String>();

        Node<Integer> cur = new Node<Integer>();

        integer.data = 5;
        System.out.println(integer.data);

        string.data = "hello";
        System.out.println(string.data);

        integer.next = new Node();
        cur = integer.next;
        cur.data = 15;
        cur.next = new Node();
        cur = cur.next;
        cur.data = 20;
        System.out.println(cur.data);

    }
}