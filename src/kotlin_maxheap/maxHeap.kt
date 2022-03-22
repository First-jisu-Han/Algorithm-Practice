package kotlin_maxheap

//o push(element) : heap에 element라는 원소를 insert
//o pop() : heap에서 root를 제거, maxheap 유지, root 값 return

// 1000개의 random number array를 만들고 sort array와
// MaxHeap을 pop하여 만든 array 두개를 비교하여 다르다면 " error” 출력하는 코드 작성àsort가 제대로 되어있다면 아무것도 출력하면 안됨

class MaxHeap<T : Comparable<T>>() {
    private val items: MutableList<T?> = mutableListOf()
    var size: Int = 0
        private set

    fun push(item: T) {
        set(size++, item)
        siftUp(size - 1)
    }

    fun peek() = get(0)

    fun pop(): T? {
        // If there are no items in the heap, null is returned
        if (size == 0) {
            return null
        }
        // Get the max item, replace it with the last item in the heap,
        // then sift it down until the heap property is restored
        val max = peek()
        set(0, get(--size))
        items.removeAt(size) // Remove original reference to the last item
        siftDown(0)
        return max
        
    }
    private fun siftUp(i: Int) {
        assert(i >= 0 && i < size)

        // The root node has no parent, so we cannot sift up any more
        if (i == 0) {
            return
        }

        // If the current item is larger than the parent, swap them and
        // then repeat on the item, which is now in the parent position
        val iParent = parentIndex(i)
        if (get(i)!! > get(iParent)!!) {
            swap(i, iParent)
            siftUp(iParent)
        }
    }

    private fun siftDown(i: Int) {
        assert(i >= 0 && i < size)

        // Cannot sift down leaf nodes
        if (i >= size / 2) {
            return
        }
        
        val iLeft = leftChildIndex(i)
        val iRight = rightChildIndex(i)
        var iLargerChild = iLeft
        if (iRight < size && get(iLeft)!! < get(iRight)!!) {
            iLargerChild = iRight
        }

        // If this item is less than the larger child, sift it down
        if (get(i)!! < get(iLargerChild)!!) {
            swap(i, iLargerChild)
            siftDown(iLargerChild)
        }
    }

    private fun set(i: Int, value: T?) {
        if (i < items.size) {
            items[i] = value
        } else {
            items.add(value)
        }
    }

    private fun get(i: Int): T? {
        if (i < items.size) {
            return items[i]
        } else {
            return null
        }
    }

    private fun swap(i: Int, j: Int) {
        val temp = items[i]
        items[i] = items[j]
        items[j] = temp
    }

    private fun parentIndex(i: Int) = (i - 1) / 2
    private fun leftChildIndex(i: Int) = i * 2 + 1
    private fun rightChildIndex(i: Int) = i * 2 + 2
}

