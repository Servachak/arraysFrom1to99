/**
 * Created by adavi on 20.07.2017.
 */
public class ArraysInLine implements ArrayWrite{
    @Override
    public void writeArray() {

        int k = 1;
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
                if (k < 100){
        arr[i] = k;
            k+=2;
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        }


    }
}
