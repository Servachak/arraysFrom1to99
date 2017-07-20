/**
 * Created by adavi on 20.07.2017.
 */
public class SortArray  {

    public void sort(int arr[]){

        int k  = 0;
        for (int i = arr.length - 1; i > 0  ; i--){
            if (arr[i] > arr[i-1]){
                k = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = k;
                System.out.println(arr[i]);
            }
        }
    }
}