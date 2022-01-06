public class timGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {8, 2, 3, 4, 5, 6, 7, 8};
        int index = check(array);
        System.out.println(" gia tri nho nhat la :" + array[index]);
    }

    public static int check(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}


