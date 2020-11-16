public class ArithmMeanArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6 };
        double sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }

        double result = sum / array.length;
        System.out.println(sum+" "+result);
    }
}
