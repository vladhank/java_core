public class SearchForDuplicates {
    public static void main(String[] args) {
        int[] array ={3,17,6,5,10,3,17,7,11,7,11,17};
        boolean[] checked =new boolean[array.length];
        int count=1;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]&&checked[j]==false){
                    count++;
                    checked[j]=true;
                }
            }
            if(count>1){
                System.out.println(array[i]+" has "+count+" duplicates");
                count=1;

            }
        }

    }
}
