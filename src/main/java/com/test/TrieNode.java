package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jitendra.k on 01/04/17.
 */
public class TrieNode {

    public List<Integer> contactIds;
    public TrieNode []edge = new TrieNode[26];

    public TrieNode() {
        contactIds = new ArrayList<Integer>();
    }
}
