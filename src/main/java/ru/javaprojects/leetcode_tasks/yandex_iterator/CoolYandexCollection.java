package ru.javaprojects.leetcode_tasks.yandex_iterator;

public abstract class CoolYandexCollection<T> {
    protected T[] elements;

    public CoolYandexCollection(T[] elements) {
        this.elements = elements;
    }

    public abstract CoolYandexIterator<T> iterator();
}

interface CoolYandexIterator<T> {
    T next();

    boolean hasNext();
}

class CoolYandexNumberCollection extends CoolYandexCollection<Integer> {

    public CoolYandexNumberCollection(Integer[] elements) {
        super(elements);
    }

    @Override
    public CoolYandexIterator<Integer> iterator() {
        return new CoolYandexEvenNumberIterator();
    }

    private class CoolYandexEvenNumberIterator implements CoolYandexIterator<Integer> {
        private int cursor;

        @Override
        public Integer next() {
            if (cursor >= elements.length) {
                throw new RuntimeException("No such element"); //no imports!
            }
            return elements[cursor++];
        }

        @Override
        public boolean hasNext() {
            if (cursor >= elements.length) {
                return false;
            }
            if (elements[cursor] % 2 == 0) {
                return true;
            }
            cursor++;
            return hasNext();
        }
    }

    public static void main(String[] args) {
        CoolYandexCollection<Integer> coolYandexCollection = new CoolYandexNumberCollection(new Integer[]{1, 2, 3, 4, 5});
        CoolYandexIterator<Integer> iterator = coolYandexCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}