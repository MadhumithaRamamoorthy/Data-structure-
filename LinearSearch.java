public class LinearSearchBoolean {
    
    public static boolean containsElement(int[] array, int target) {
       
         if (array == null || array.length == 0) {
            return false;
        }
       
        for (int element : array) {
            if (element == target) {
                return true;               }
        }
        
        return false;    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 93, 28, 5};
        int searchTarget = 93;

        boolean isFound = containsElement(numbers, searchTarget);

        if (isFound) {
            System.out.println("Success! The element " + searchTarget + " is in the array.");
        } else {
            System.out.println("The element " + searchTarget + " was not found.");
        }
    }
}
