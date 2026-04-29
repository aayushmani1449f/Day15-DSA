public class Main {
    public static void main(String[] args) {
        System.out.println("Testing HashMap UC1:");
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            myHashMap.add(word, value);
        }
        System.out.println(myHashMap);

        System.out.println("\nTesting HashMap UC2:");
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] paraWords = paragraph.toLowerCase().split(" ");
        for (String word : paraWords) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            myLinkedHashMap.add(word, value);
        }
        System.out.println("Before removing 'avoidable':");
        System.out.println(myLinkedHashMap);

        System.out.println("\nTesting HashMap UC3:");
        myLinkedHashMap.remove("avoidable");
        System.out.println("After removing 'avoidable':");
        System.out.println(myLinkedHashMap);

        System.out.println("\nTesting BST UC1:");
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        System.out.println("Added 56, 30, 70 to the BST.");

        System.out.println("\nTesting BST UC2:");
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        System.out.println("Size of the BST: " + size);

        System.out.println("\nTesting BST UC3:");
        boolean isFound = myBinaryTree.search(63);
        if (isFound) {
            System.out.println("Element 63 is found in the BST.");
        } else {
            System.out.println("Element 63 is not found in the BST.");
        }
    }
}
