class List extends AbstractList {

    List() {
        super();
    }

    public void add(int item) {
        list[size] = item;
        size++;
        if (size == cap) {
            resize();
        }
    }

    public void resize() {
        list = java.util.Arrays.copyOf(list, cap * 2);
        cap *= 2;
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
}