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
    }
}
