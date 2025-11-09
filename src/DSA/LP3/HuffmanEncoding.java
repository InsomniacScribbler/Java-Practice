package DSA.LP3;
//Huffman Encoding using a greedy strategy.
// 1. Buiild an Huffman Tree
// 2. Traverse the Huffman tree and assign codes to character


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanEncoding {
    /*
    *
    * Get each unique character with its count
    * Pick two characters whose count are minimum and add them to make a new node
    * Finally the last sum leads to the root
    * all the characters are the leaf node
    *
    *
    * */

    //static class to make node
    static class Node{
        char ch;
        int freq;
        Node left;
        Node right;

        Node(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }

    // Build the tree

    static Node huffmanTree(String text){
        //map to get char and their count
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //PQ to make min heap for huffman tree
        PriorityQueue<Node> queue = new PriorityQueue<>(((a,b) -> a.freq - b.freq));
        for(var entry : map.entrySet()){
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while(queue.size() > 1){
            //in the min heap:
//                topmost element is the left child and second to top is the right child
            Node left = queue.poll();
            Node right = queue.poll();
            Node newNode = new Node('$', left.freq + right.freq); // add a new node to the tree with sum of child nodes as freq and '$' as the char
            newNode.left = left;
            newNode.right = right;

            queue.add(newNode);
        }
        return queue.peek(); //root of the huffman tree

    }
    public static void generateCodes(Node root,String code, Map<Character, String> CodeMap){
        if(root == null) return;
        if(root.left == null && root.right == null){
            CodeMap.put(root.ch, code);
            return;
        }
        generateCodes(root.left, code+"0", CodeMap);
        generateCodes(root.right, code+"1", CodeMap);
    }
    public static void encoder(String text) {
        Node root = huffmanTree(text);
        Map<Character, String> codeMap = new HashMap<>();
        generateCodes(root, "", codeMap);

        System.out.println("Character\tFrequency\tCode");
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch : text.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        for(char ch : freqMap.keySet()){
            System.out.println(ch+"\t\t\t"+freqMap.get(ch)+"\t\t\t"+codeMap.get(ch));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = sc.nextLine();
        text = text.toLowerCase().trim();
        encoder(text);
    }
}
