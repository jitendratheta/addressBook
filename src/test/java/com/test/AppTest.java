package com.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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
        List<Contact> res = dictionary.searchName("tes");
        Assert.assertTrue("test".equalsIgnoreCase(res.get(0).getFirstName()));
    }

    @Test
    public void searchOnLastName() {
        Contact c = new Contact();
        c.setFirstName("test");
        c.setLastName("name");
        dictionary.addContact(c);
        List<Contact> res = dictionary.searchName("name");
        Assert.assertTrue("test".equalsIgnoreCase(res.get(0).getFirstName()));
        Assert.assertTrue("name".equalsIgnoreCase(res.get(0).getLastName()));
    }

}
