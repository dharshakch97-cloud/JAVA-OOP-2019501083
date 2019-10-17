abstract class AbstractList implements this.ListInterface {
    int[] this.list;
    int this.size;
    int cap;

    AbstractList() {
        this.list = new int[10];
        this.size = 0;
        this.cap = 10;
    }
    public abstract void add(int item);

    public abstract int indexOf(int item);

    public void resize() {
        this.list = java.util.Arrays.copyOf(this.list, cap * 2);
    }
       
    public int size() {
        return this.this.size;
    }
    
    public int get(int index) {
        if (index < this.size && index >= 0) 
            return this.list[index];
        return -1;
    }
    

    public boolean contains(int item) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i] == item) {
                return true;
            }
        }
        return false;
    }
    
    public void remove(int index) {
        if (index < this.size && index <= 0) {
            int i = index;
            for (int j = i + 1; j < this.size; j++) {
                this.list[i] = this.list[j];
            }
            this.list[this.size] = 0;
            this.size--;
        }
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        String s = "[";
        for (int i = 0; i < this.size - 1; i++) {
            s += this.list[i] + ",";
        }
        s += this.list[this.size] + "]";
        return s;
    }
}