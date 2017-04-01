package com.test;

import java.util.*;

/**
 * Dictionary class exposes add and search name functionality
 */
public class Dictionary {

    private TrieNode root = new TrieNode();
    private Map<Integer, Contact> contactMap = new HashMap<Integer, Contact>();
    private int contactId = 0;

    /**
     * Search name list.
     *
     * @param name the name
     * @return the list
     */
    public Set<Contact> searchName(String name) {
        Set<Contact> res = new HashSet<Contact>();
        TrieNode node = getSearchedNode(root, name.toLowerCase(), 0);
        fillAllPossibleContacts(node, res);
        return res;
    }

    private TrieNode getSearchedNode(TrieNode root, String name, int idx) {
        if(idx == name.length())
            return root;
        else {
            int i = name.charAt(idx) - 'a';
            if(root.edge[i] == null)
                return null;
            return getSearchedNode(root.edge[i], name, idx+1);
        }
    }

    /**
     * Add contact.
     *
     * @param contact the contact
     */
    public void addContact(Contact contact) {
        contactMap.put(++contactId, contact);
        addWord(root, contact.getFirstName(), 0, contactId);
        addWord(root, contact.getLastName(), 0, contactId);
    }

    private void fillAllPossibleContacts(TrieNode node, Set<Contact> res) {

        if(node == null)
            return;

        if(node.contactIds.size() > 0)
            for (int contactId: node.contactIds)
                res.add(contactMap.get(contactId));

        for(int i = 0; i < 26; ++i) if(node.edge[i] != null)
            fillAllPossibleContacts(node.edge[i], res);

    }

    private void addWord(TrieNode root, String name, int idx, int contactId) {
        if(name == null)
            return;
        addToTrie(root, name.toLowerCase(), idx, contactId);
    }

    private void addToTrie(TrieNode root, String name, int idx, int contactId) {
        if(name.length() == idx) {
            root.contactIds.add(contactId);
        } else {
            int i = name.charAt(idx) - 'a';
            if(root.edge[i] == null) {
                root.edge[i] = new TrieNode();
            }
            addToTrie(root.edge[i], name, idx+1, contactId);
        }
    }

}
