public class Ex13 {
    public static void main(String[] args) {
        int[] arr = {4,44,5,71,2,9};
         int m = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[m] > arr[i]) {
                        m = i;
                    }
                }
         System.out.println(arr[m]);
         }
    }

