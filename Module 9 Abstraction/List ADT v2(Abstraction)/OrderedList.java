class OrderedList extends AbstractList {

    OrderedList() {
        super();
    }

    public void add(int item) {
        if (size == 0) {
            list[size] = item;
        } else {
            for (int j = 0; j < size; j++) {
                if (item <= list[j]) {
                    insertAt(item, j);
                    break;
                }
            }
        }
        size++;
        if (size == cap) {
            resize();
        }
    }

    public void resize() {
        list = java.util.Arrays.copyOf(list, 2 * cap);
        cap = cap * 2;
    }

    public void insertAt(int item, int index) {
        for (int j = size; j > index; j--) {
            list[j] = list[j - 1];
        }
        list[index] = item;
    }

    public int indexOf(int item) {
        return binarySearch(list, 0, size, item);
    }

    public int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}