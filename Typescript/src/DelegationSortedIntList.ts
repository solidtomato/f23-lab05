/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

import { IntegerList } from './IntegerList'
import { SortedIntList } from './hidden/SortedIntListLibrary'

class DelegationSortedIntList implements IntegerList {
  // Write your implementation below with API documentatioin

  private readonly sortedList = new SortedIntList()
  private addCount = 0

  add = (num: number): boolean => {
    this.addCount += 1
    return this.sortedList.add(num)
  }

  addAll = (list: IntegerList): boolean => {
    this.addCount += list.size()
    return this.sortedList.addAll(list)
  }

  get = (index: number): number => {
    return this.sortedList.get(index)
  }

  remove = (num: number): boolean => {
    return this.sortedList.remove(num)
  }

  removeAll = (list: IntegerList): boolean => {
    return this.sortedList.removeAll(list)
  }

  size = (): number => {
    return this.sortedList.size()
  }

  getTotalAdded = (): number => {
    return this.addCount
  }
}

export { DelegationSortedIntList }
