import java.util.*;


class LRUCache {


   class Node {
      Node prev , next ;
      int key , value ;

      Node(int key , int value){
        this.key = key;
        this.value  = value;
      }
   } 

   private int capacity;
   private HashMap<Integer, Node> map;

   private Node head;
   private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next = tail;
        tail.prev = head;
    }

    public void remove(Node node){
        Node previous = node.prev;
        Node nextnode = node.next;

        previous.next = nextnode;
        nextnode.prev = previous;
    }

    public void addtofront(Node node){
        Node headnext = head.next;

        head.next = node;
        node.prev = head;

        headnext.prev = node;
        node.next = headnext;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;

        Node node = map.get(key); // extract that node

        remove(node);
        addtofront(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            Node node = map.get(key);

            node.value = value;

            remove(node);
            addtofront(node);
        }

        else{//not contains

         if(map.size() == capacity){

            Node lru = tail.prev;

            remove(lru);
            map.remove(lru.key);
         }
         Node newnode = new Node(key , value);

         addtofront(newnode);
         map.put(key , newnode);

        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */