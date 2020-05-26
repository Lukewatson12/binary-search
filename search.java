class Scratch {
    static int binarySearch(int[] array, int numberToFind) {
        int rightPosition = array.length - 1;
        int leftPosition = 0;
        int arrayIndex = 0;
        int middle;
        int middleNumber;


        boolean isSearchingForIndex = true;
        while (isSearchingForIndex) {
            middle = (leftPosition + rightPosition) / 2;

            middleNumber = array[middle];

            if (array[middle] == numberToFind) {
                arrayIndex = middle;
                isSearchingForIndex = false;
            }

            if (middleNumber > numberToFind) {
                rightPosition = middle + 1;
            } else {
                leftPosition = middle - 1;
            }
        }
        return arrayIndex;
    }

    public static void main(String[] args) {
        int arrayIndex = binarySearch(
                new int[]{1, 2, 4, 6, 7, 9, 10, 15, 18, 20, 25},
                18
        );

        System.out.println(arrayIndex);
    }
}
