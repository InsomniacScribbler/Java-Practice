package DSA.LP3;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class practice {
    static class Node{
        char ch;
        int freq;
        Node left,right;
        public Node(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }


    }

    static Node huffmanTree(String text){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.freq - b.freq);
        for(var entry : map.entrySet())
        {
            pq.add(new Node(entry.getKey(), entry.getValue()));

        }

        while(pq.size()>1){
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node('$', left.freq + right.freq);
            newNode.left =  left;
            newNode.right = right;
            pq.add(newNode);
        }
        return pq.peek();
    }

    static void codeGenerator(Node root, String code, Map<Character, String> codeMap){
        if(root == null) return;
        if(root.left == null && root.right == null){
            codeMap.put(root.ch, code);
        }
        codeGenerator(root.left, code + '0', codeMap);
        codeGenerator(root.right, code + '1', codeMap);
    }

    static void encoder(String text){
        Node root = huffmanTree(text);
        Map<Character, String> codeMap = new HashMap<>();
        codeGenerator(root, text, codeMap);
        System.out.println("Character\tFrequency\tCode");
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch : text.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        for(char ch : freqMap.keySet()){
            System.out.println(ch+"\t\t\t"+freqMap.get(ch)+"\t\t\t"+codeMap.get(ch));
        }

    }

    public static void main(String[] args) {}
}
