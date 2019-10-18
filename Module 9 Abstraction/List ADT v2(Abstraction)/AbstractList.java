abstract class AbstractList implements ListInterface {
    int[] list;
    int size;
    int cap;

    AbstractList() {
        this.list = new int[10];
        this.size = 0;
        this.cap = 10;
    }

    abstract public void add(int item);

    abstract public int indexOf(int item);

    public int size() {
        return this.size;
    }

    public int get(int index) {
        if (index < this.size && index >= 0) {
            return this.list[index];
        }
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
        if (index < size) {
            int i = index;
            for (int j = i + 1; j < size; j++) {
                this.list[i] = this.list[j];
                i++;
            }
            this.list[this.size] = 0;
            this.size--;
        }
    }

    public String toString() {
        String out = "[";
        for (int i = 0; i < this.size - 1; i++) {
            out += this.list[i] + ",";
        }
        out += this.list[this.size - 1];
        return out += "]"; 
    } 
}
