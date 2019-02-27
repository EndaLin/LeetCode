package project.data_structure.sequence;

/**
 * search sequentially base on linked list without order
 *
 * @author wt
 * @create 2019-02-27 上午10:34
 */
public class SequentialSearchST<Key, Value> {
    private Node first;

    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Value get(Key key) {
            // find the relative value by specified key
            for (Node x = first; x != null; x = x.next) {
                if (key.equals(x.key)) {
                    return x.value;
                }
            }
            return null;
        }

        public void put(Key key, Value value) {
            // find the relative key by specified key, or create new node in table
            for (Node x = first;x!=null;x=x.next) {
                if (key.equals(x.key)) {
                    // if find the specified key, update the value
                    x.value = value;
                    return;
                }
            }
            first = new Node(key, value, first);
        }
    }
}
