package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation

    private int addCount = 0;

    public InheritanceSortedIntList() {
        super();
    }

    @Override
    public  boolean add(int num) {
        addCount += 1;
        return super.add(num);
    }

    public int getTotalAdded() {
        return addCount;
    }
}