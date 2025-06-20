public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
  
        ht.put(1, 100);
        ht.put(11, 200); 
        ht.put(21, 300); 
        ht.put(2, 400);
        ht.put(3, 500);
        
        System.out.println("Value for key 1: " + ht.get(1));     
        System.out.println("Value for key 11: " + ht.get(11));   
        System.out.println("Value for key 21: " + ht.get(21));
        System.out.println("Value for key 2: " + ht.get(2));
        System.out.println("Value for key 99: " + ht.get(99));
        
        ht.put(11, 777);
        System.out.println("Updated value for key 11: " + ht.get(11));

        ht.remove(11);
        System.out.println("After removing key 11: " + ht.get(11));

        ht.remove(21);
        System.out.println("After removing key 21: " + ht.get(21));

        ht.remove(1);
        System.out.println("After removing key 1: " + ht.get(1));

        System.out.println("Value for key 2: " + ht.get(2));
        System.out.println("Value for key 3: " + ht.get(3));
    }
}
