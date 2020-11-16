public class ArrayMinMaxChange {
    public static void main(String[] args) {
            int min;
            int max;
            int[] numberArray = {1, 0, 5, 3, -1};
            System.out.println("Array :");
            for (int i =0; i<numberArray.length; i++){
                System.out.print(numberArray[(i)] + " ");
            }

            max = numberArray[0];
            for (int i = 0; i <numberArray.length; i++){
                if (numberArray[i] > max){
                    max = numberArray[i];
                }
            }
        System.out.println("\n" +"Maximum array value: " + max);

        min = numberArray[0];
        for (int i = 0; i <numberArray.length; i++){
            if (numberArray[i] < min){
                min = numberArray[i];
            }
        }
        System.out.println("Minimum array value: " + min);

        for (int i = 0; i <numberArray.length; i++){
            if (numberArray[i] == min){
                if (numberArray[i] == max){
                    numberArray[i] = min;
                }
                if (numberArray[i] == min){
                    numberArray[i] = max;
                }
            } else {
                if (numberArray[i] == max){
                numberArray[i] = min;
                }
            }
        }

        System.out.println("Array after minimum and maximum value switch places: ");
        for (int i =0; i<numberArray.length; i++){
            System.out.print(numberArray[(i)] + " ");
        }

    }
}

