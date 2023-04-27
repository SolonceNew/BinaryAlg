public class Main {
    
    public static void main(String[] args) {
        int[] arr = {14, 16, 19, 32, 32, 32, 56, 69, 72};

        System.out.println(binaryBooksSearch(arr, 32));

    }

    public static int binaryBooksSearch(int[] arr, int sizeNewBook) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;
        int countLagerBooks = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            if (sizeNewBook > arr[right]) {
                return 0;
            } else if (sizeNewBook < arr[left]) {
                return arr.length;
            } else if (arr[middle] <= sizeNewBook) {

                if ((arr[middle] == sizeNewBook) && (arr[middle + 1] > sizeNewBook)) {
                    countLagerBooks = arr.length - (middle + 1);
                    break;
                } else if (sizeNewBook < arr[middle + 1]) {
                    countLagerBooks = arr.length - (middle + 1);
                    break;
                } else {
                    left = middle + 1;
                }

            } else {
                right = middle - 1;
            }
        }
        return countLagerBooks;
    }
}

