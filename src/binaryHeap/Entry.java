package binaryHeap;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Entry<Key extends Comparable<Key>, Value> {
    private Key ky;
    private Value val;

    public Entry(Key newKey, Value newVal) {
        this.ky = newKey;
        this.val = newVal;
    }

    public Key getKey() {
        return this.ky;
    }

    public Value getValue() {
        return this.val;
    }

    public void setKey(Key newKey) {
        this.ky = newKey;
    }

    public void setValue(Value newValue) {
        this.val = newValue;
    }
}