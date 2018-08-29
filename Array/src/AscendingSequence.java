import java.util.Arrays;

public class AscendingSequence {
    public static void main(String[] args) {
        boolean ascendingSequence=true;
        int number =12539;
        int length=Integer.toString(number).length();
        int[] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=number%10;
            number=number/10;
        }

        for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[length-1];
            array[length-1]=temp;
            length--;
        }
        System.out.println(Arrays.toString(array));
      // for(int i:array) System.out.println(i);
        for (int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
              ascendingSequence=false;
              break;
            }

        }

        System.out.println(ascendingSequence?"Возрастает":"Не возрастает");


    }

}