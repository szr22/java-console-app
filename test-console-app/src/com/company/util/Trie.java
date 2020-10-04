package com.company.util;

public class Trie {
    public class TrieNode{
        public TrieNode[] next;
        public boolean isWord;
        public TrieNode(){
            next = new TrieNode[26];
            isWord = false;
        }
    }
    public TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word){

        int n = word.length();

        TrieNode node = root;
        for (int i=0;i<n;i++){
            int index = word.charAt(i)-'a';
            if (node.next[index] == null) {
                node.next[index] = new TrieNode();
            }
            node = node.next[index];
        }
        node.isWord = true;
    }

    public boolean isWord(String word){
        int n = word.length();
        TrieNode node = root;
        for (int i = 0;i<n;i++) {
            int index = word.charAt(i)-'a';
            if (node.next[index] == null) {
                return false;
            }
            node = node.next[index];
        }
        return node.isWord;
    }
}
