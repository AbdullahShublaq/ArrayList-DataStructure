package datastructure1;

import java.util.Arrays;

public class CustomizeArrayList<E> {

    private int size = 0;
    private int[] elements;

    public CustomizeArrayList() {
        elements = new int[1];
    }

    public int size() {
        return size;
    }

    public void add(int integer) {
        if (size == 0) {
            elements[0] = integer;
            size++;
        } else {
            size++;
            elements = Arrays.copyOf(elements,/*elements.length*/ size);
            elements[size - 1] = integer;
        }
    }

    /*Dlete Without return the item deleted*/
    public void remove(int index) {
        for (int i = index, j = i + 1; j < size; j++) {
            //int j = i + 1;
            elements[i] = elements[j];
        }
        size--;
        elements = Arrays.copyOf(elements, size);
    }

    /*Dlete With return the item deleted*/
    public int remove2(int index) {
        int deleted = elements[index];
        for (int i = index, j = i + 1; j < size; j++) {
            //int j = i + 1;
            elements[i] = elements[j];
        }
        size--;
        elements = Arrays.copyOf(elements, size);
        return deleted;
    }

    public int get(int index) {
        return elements[index];
    }

    public boolean contains(int integer) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == integer) {
                return true;
            }
        }
        return false;
    }

    /*public boolean contains(E object) {
        return true;
    }*/
}
