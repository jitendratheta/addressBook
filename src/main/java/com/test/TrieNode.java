package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jitendra.k on 01/04/17.
 */
public class TrieNode {

    /**
     * Keeps the contact id list ending at given node
     */
    public List<Integer> contactIds;
    /**
     * Keeping track of child nodes for a node
     */
    public TrieNode []edge = new TrieNode[26];

    /**
     * Instantiates a new Trie node.
     */
    public TrieNode() {
        contactIds = new ArrayList<Integer>();
    }
}
