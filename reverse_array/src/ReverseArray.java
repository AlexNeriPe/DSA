public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr, arr.length);
        reverseArray(arr, arr.length - 1);
        System.out.println("The array reversed is: ");
        printArray(arr, arr.length);
        System.out.println("The array reversed again using a recursive method: ");
        reverseArrayRecursive(arr, 0,arr.length - 1);
        printArray(arr, arr.length);
    }

    static void printArray(int[] arr, int size){
        for(int i = 0 ; i < size ; i++) {
//            System.out.println(arr[i] + " ");
            System.out.print(STR."\{arr[i]} ");
        }
        System.out.println();
    }

    static void reverseArray(int[] arr, int end){
        int tmp;
        int start = 0;
        while(start < end) {
            tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    static void reverseArrayRecursive(int[] arr, int start, int end) {
        int tmp;
        if(start >= end)
            return;
        tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        reverseArrayRecursive(arr, start + 1, end - 1);
    }
}
