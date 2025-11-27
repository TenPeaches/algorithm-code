package com.graph_theory.leetcode208;

public class Trie {
    private Trie[] children;
    private boolean isEnd;
    public Trie() {
        children=new Trie[26];
        isEnd=false;
    }

    public void insert(String word) {
        Trie node=this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(node.children[c-'a']==null){
                node.children[c-'a']=new Trie();
            }
            node=node.children[c-'a'];
        }
        node.isEnd=true;
    }

    public boolean search(String word) {
        return ff(word)!=null&&ff(word).isEnd;
    }

    public boolean startsWith(String prefix) {
        return ff(prefix)!=null;
    }

    public Trie ff(String prefix) {
        Trie node=this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index=c-'a';
            if(node.children[index]==null){
                return null;
            }
            node=node.children[index];
        }
        return node;
    }
}
