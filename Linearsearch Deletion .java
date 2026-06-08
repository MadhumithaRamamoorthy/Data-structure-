public class ArrayDeletion {

    // Performs a linear search to find the element's index
    public static int linearSearch(int[] arr, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    // Deletes the element using linear search and shifting
    public static int deleteElement(int[] arr, int size, int target) {
        // Step 1: Find the position of the element
        int index = linearSearch(arr, size, target);

        // If the element doesn't exist, return the original size
        if (index == -1) {
            System.out.println("Element " + target + " not found in the array.");
            return size;
        }

        // Step 2: Shift elements to the left to overwrite the target
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Element " + target + " deleted successfully.");
        
        // Return the updated size of the array
        return size - 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 12;
        arr[1] = 34;
        arr[2] = 10;
        arr[3] = 6;
        arr[4] = 40;

        int size = 5; 
        int targetToDelete = 10;

        System.out.print("Array before deletion: ");
        printArray(arr, size);

        // Perform deletion
        size = deleteElement(arr, size, targetToDelete);

        System.out.print("Array after deletion: ");
        printArray(arr, size);
    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
