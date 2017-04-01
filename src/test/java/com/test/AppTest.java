package com.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest  {

    Dictionary dictionary = new Dictionary();

    @Test
    public void addContact() {
        Contact c = new Contact();
        c.setFirstName("test");
        dictionary.addContact(c);
        Assert.assertTrue(true);
    }

    @Test
    public void searchContact() {
        Contact c = new Contact();
        c.setFirstName("test");
        dictionary.addContact(c);
        Set<Contact> res = dictionary.searchName("tes");
        Assert.assertTrue(res.contains(c));
    }

    @Test
    public void searchOnLastName() {
        Contact c = new Contact();
        c.setFirstName("test");
        c.setLastName("name");
        dictionary.addContact(c);
        Set<Contact> res = dictionary.searchName("name");

        Assert.assertTrue(res.contains(c));
    }

}
