public class BubbleSort {
    public static int[] bubbleSortAscending(int[] array){
        for(int i=array.length-1;i>0;i--){
            for(int j=0;i>j;j++){
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static int[] bubbleSortDescending(int[] array){
        for(int i=array.length-1;i>0;i--){
            for (int j=0;i>j;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }

        }
        return array;
    }
    public static void main(String[] args) {
        int[] array ={5,45,52,8,71,12,56,93};
        bubbleSortDescending(array);
        for(int i:array) System.out.println(i);
    }
}
