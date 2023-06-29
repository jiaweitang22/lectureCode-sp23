package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */
public class AList {
    public int[] array;
    public int lastIndex;
    public int size;
    /** Creates an empty list. */
    public AList() {
        array = new int[10];
        lastIndex = 0;
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (lastIndex >= array.size()) {
            int[] new_array = new int[array.size() * 2];
            for (int i=0; i<array.size(); i++) {
                new_array[i] = array[0];
            }
            array = new_array;
        }
        array[lastIndex] = x;
        lastIndex++;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return array[lastIndex - 1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return array[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int temp = array[lastIndex - 1];
        array[lastIndex - 1] = 0;
        lastIndex--;
        size--;
        return temp;
            }
} 
