package week11;
public class Task1 {
    public <T> void swap(T[] arr, int i, int j) {
        if (i != j) {
            T tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public <T extends Comparable<T>> void sapxep(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) <= 0) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Task1 n = new Task1();
        Integer[] I = {2, 6, 1, 9, 7, 3};
        Double[] D = {2.6, 3.5, 8.9, 9.9, 7.4};

        Character[] C = {'d', 'u', 'c', 'a', 'b'};
        n.sapxep(I);
        n.sapxep(D;
        n.sapxep(C);
    }
}

