package ru.javaprojects.leetcode_tasks.design_hashMap;

import java.util.LinkedList;

class MyHashMap {
    private LinkedList<Entry>[] buckets = new LinkedList[16];

    public MyHashMap() {

    }

    public void put(int key, int value) {
        int bucketIndex = key % buckets.length;
        LinkedList<Entry> bucket = buckets[bucketIndex];
        if (bucket == null) {
            buckets[bucketIndex] = new LinkedList<>();
            buckets[bucketIndex].add(new Entry(key, value));
        } else {
            boolean contains = false;
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    entry.value = value;
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                bucket.addFirst(new Entry(key, value));
            }
        }
    }

    public int get(int key) {
        int bucketIndex = key % buckets.length;
        LinkedList<Entry> bucket = buckets[bucketIndex];
        if (bucket == null) {
            return -1;
        }
        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int bucketIndex = key % buckets.length;
        LinkedList<Entry> bucket = buckets[bucketIndex];
        if (bucket != null) {
            bucket.removeIf(entry -> entry.key == key);
        }
    }

    private static class Entry {
        private int key;
        private int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
