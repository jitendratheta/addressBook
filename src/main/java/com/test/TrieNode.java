package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jitendra.k on 01/04/17.
 */
public class TrieNode {

    /**
     * Keeps the contact id list ending at given node
     */
    public Set<Integer> contactIds;
    /**
     * Keeping track of child nodes for a node
     */
    public TrieNode []edge = new TrieNode[26];

    /**
     * Instantiates a new Trie node.
     */
    public TrieNode() {
        contactIds = new HashSet<Integer>();
    }
}
