package ru.javaprojects.leetcode_tasks.design_hashSet;

import java.util.LinkedList;

class MyHashSet {
    private LinkedList<Integer>[] buckets = new LinkedList[16];

    public MyHashSet() {

    }

    public void add(int key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        if (bucket == null) {
            buckets[bucketIndex] = new LinkedList<>();
            buckets[bucketIndex].add(key);
        } else {
            if (!bucket.contains(key)) {
                bucket.addFirst(key);
            }
        }
    }

    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        if (bucket != null) {
            bucket.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        if (bucket == null) {
            return false;
        }
        return bucket.contains(key);
    }

    private int getBucketIndex(int key) {
        int hashCode = Integer.hashCode(key);
        return hashCode % buckets.length;
    }
}
