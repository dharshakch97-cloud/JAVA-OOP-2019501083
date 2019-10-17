class List extends AbstractList {
    int[] list;
    int size;
    int cap;

    List() {
        super();
    }

    public void add(int item) {
        this.list[size] = item;
        this.size++;
        
        if (size == cap) {
            resize();
        }
    }
    public int indexOf(int item) {
        for (int i = 0 ; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }

}