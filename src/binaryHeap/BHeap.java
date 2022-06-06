package binaryHeap;


public class BHeap<Key extends Comparable<Key>, Value> {
    private Entry[] a;
    private int N;

    public BHeap(Entry[] harray, int initialSize) {
        this.a = harray;
        this.N = initialSize;
    }

    public int size() {
        return this.N;
    }

    private boolean greater(int i, int j) {
        return this.a[j].getKey().compareTo(this.a[i].getKey()) < 0;
    }

    private void swap(int i, int j) {
        Entry temp = this.a[i];
        this.a[i] = this.a[j];
        this.a[j] = temp;
    }

    public void createHeap() {
        for(int i = this.N / 2; i > 0; --i) {
            this.downheap(i);
        }
    }

    public void downheap(int i) {
        while(true) {
            if (2 * i <= this.N) {
                int k = 2 * i;
                if (k < this.N && this.greater(k, k + 1)) {
                    ++k;
                }
                if (this.greater(i, k)) {
                    this.swap(i, k);
                    i = k;
                    continue;
                }
            }

            return;
        }
    }

    public void insert(Key newKey, Value newValue) {
        Entry temp = new Entry(newKey, newValue);
        this.a[++this.N] = temp;
        this.upheap(this.N);
    }

    private void upheap(int j) {
        while(j > 1 && this.greater(j / 2, j)) {
            this.swap(j / 2, j);
            j /= 2;
        }

    }

    public void decrease_key(int var1, int var2) {
        throw new Error("Unresolved compilation problems: \n\tThe type of the expression must be an array type but it resolved to int\n\tThe left-hand side of an assignment must be a variable\n\tSyntax error on token \"-\", invalid AssignmentOperator\n\tSyntax error, insert \". class\" to complete Expression\n\tSyntax error, insert \";\" to complete Statement\n");
    }

    public Entry deleteMin() {
        Entry min = this.a[1];
        this.swap(1, this.N--);
        this.a[this.N + 1] = null;
        this.downheap(1);
        return min;
    }

    public void print() {
        for(int i = 1; i <= this.N; ++i) {
            System.out.print("[" + this.a[i].getKey() + " " + this.a[i].getValue() + "]");
        }
        System.out.println(" ");
        System.out.println("힙의 크기: " + this.size());
        System.out.println(" ");
    }
}
