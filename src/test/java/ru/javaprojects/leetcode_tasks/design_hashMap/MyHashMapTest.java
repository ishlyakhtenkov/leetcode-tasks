package ru.javaprojects.leetcode_tasks.design_hashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @Test
    void testOperations() {
        MyHashMap myHashMap = new MyHashMap();
        for (int i = 0; i < 20; i++) {
            myHashMap.put(i, i);
        }

        for (int i = 0; i < 20; i++) {
            assertEquals(i, myHashMap.get(i));
        }

        for (int i = 0; i < 20; i++) {
            myHashMap.remove(i);
        }

        for (int i = 0; i < 20; i++) {
            assertEquals(-1, myHashMap.get(i));
        }
    }

}