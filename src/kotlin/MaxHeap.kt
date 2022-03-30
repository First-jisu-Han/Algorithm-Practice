package kotlin

// maxHeap을 코틀린으로 구현
//MaxHeap class는 자유 롭게 구현 아래 두가지 메소드는 필수로 구현 o push(element) : heap에 element라는 원소를 insert
//o pop() : heap에서 root를 제거, maxheap 유지, root 값 return
//– 1000개의 random number array를 만들고 sort array와 MaxHeap을 pop하여 만든 array 두개를 비교하여
// 다르다면 " error” 출력하는 코드 작성àsort가 제대로 되어있다면 아무것도 출력하면 안됨

package com.example.myapplication

import java.util.*

class MaxHeap<T : Comparable<T>>() {

    private val items = mutableListOf<T?>()

    val size: Int
        get() = items.size

    fun pushset(item: T) {
        push(size + 1, item)
        upHeap(size - 1)
    }

    fun peek() = get(0)

    fun pop(): T? {
        if (size == 0) {
            return null
        }
        val max = peek()
        push(0, get(size-1))
        items.removeAt(items.lastIndex)
        downHeap(0)
        return max
    }
    private fun upHeap(i: Int) {
        assert(i >= 0 && i < size)
        if (i == 0) {
            return
        }
        val iParent = parentIndex(i)
        if (get(i)!! > get(iParent)!!) {
            swap(i, iParent)
            upHeap(iParent)
        }
    }
    fun downHeap(i: Int) {
        assert(i >= 0 && i < size)
        if (i >= size / 2) {
            return
        }
        val iLeft = leftChildIndex(i)
        val iRight = rightChildIndex(i)
        var iLargerChild = iLeft
        if (iRight < size && get(iLeft)!! < get(iRight)!!) {
            iLargerChild = iRight
        }
        if (get(i)!! < get(iLargerChild)!!) {
            swap(i, iLargerChild)
            downHeap(iLargerChild)
        }
    }
    fun push(i: Int, value: T?) {
        if (i < items.size) {
            items[i] = value
        } else {
            items.add(value)
        }
    }
    fun get(i: Int): T? {
        if (i < items.size) {
            return items[i]
        } else {
            return null
        }
    }
    fun swap(i: Int, j: Int) {
        val temp = items[i]
        items[i] = items[j]
        items[j] = temp
    }

    private fun parentIndex(i: Int) = (i - 1) / 2
    private fun leftChildIndex(i: Int) = i * 2 + 1
    private fun rightChildIndex(i: Int) = i * 2 + 2
}

fun main(){
    val maxheap=MaxHeap<Int>()
    val random = Random()


    var testArr=Array<Int>(1000,{random.nextInt()})
    var exArr=Array<Int>(1000,{0});
    for(i in 0..999){
        maxheap.pushset(testArr.get(i));
    }
    for(i in 0..999){
        exArr[i]=maxheap.pop()
    }
    testArr.sort();
    for(i in 0..999){
        if (exArr[i] != testArr[i]){
            print("error")
            break
        }
    }

}
