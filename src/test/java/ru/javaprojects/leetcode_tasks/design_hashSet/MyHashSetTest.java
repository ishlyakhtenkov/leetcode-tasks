package ru.javaprojects.leetcode_tasks.design_hashSet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    @Test
    void operationsTest() {
        MyHashSet myHashSet = new MyHashSet();
        for (int i = 0; i < 20; i++) {
            assertFalse(myHashSet.contains(i));
        }

        for (int i = 0; i < 20; i++) {
            myHashSet.add(i);
        }

        for (int i = 0; i < 20; i++) {
            assertTrue(myHashSet.contains(i));
        }

        for (int i = 0; i < 20; i++) {
            myHashSet.remove(i);
        }

        for (int i = 0; i < 20; i++) {
            assertFalse(myHashSet.contains(i));
        }

    }

}