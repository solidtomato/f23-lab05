package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    private SortedIntList sortedList;
    private int addCount = 0;

    public DelegationSortedIntList() {
        this.sortedList = new SortedIntList();
    }

    public boolean add(int num) {
        addCount += 1;
        return sortedList.add(num);
    }

    public boolean addAll(IntegerList list) {
        addCount += list.size();
        return sortedList.addAll(list);
    }

    public int get(int index) {
        return sortedList.get(index);
    }

    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return sortedList.remove(addCount);
    }

    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return this.addCount;
    }
}