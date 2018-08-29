public class ArrayInverting {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9,10};
        int j=array.length-1;//end of array
        for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            j--;
        }
        for (int i:array) System.out.println(i);
    }
}
