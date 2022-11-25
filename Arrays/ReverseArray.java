public class ReverseArray {
    public static void main(String[] args) {
        //How do you reverse an array in Java?
        int[] arr={10, 20, 30, 40, 50};
        int[] rev_arr=new int[arr.length];

        int j=arr.length;
        for(int i=0; i< arr.length; i++){
            rev_arr[j-1]=arr[i];
            j--;
        }

        //Reversed Array
        for(int i=0; i<rev_arr.length; i++) {
            System.out.println(rev_arr[i]);
        }

    }
}
