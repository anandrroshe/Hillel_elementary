public class Array8 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length-1 ; i++) {
            array[i]=2*i+1;
            System.out.print(array[i]+ ", ");
        }
        array[9]=2*9+1;
        System.out.print(array[9]+ ". ");


    }
}
