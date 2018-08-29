
public class MinMaxElements {
    public static void main(String[] args) {
        int[] SearchArray = { 8, 15, 4, 4, 10 };
        int minElement = 0;
        int maxElement = 0;
        for (int i = 0; i < SearchArray.length; i++) {
            if (SearchArray[minElement] > SearchArray[i]) {
                minElement = i;

            }
            if (SearchArray[maxElement] <= SearchArray[i]) {
                maxElement = i;
            }

        }
        System.out.println("Minimum element is " + SearchArray[minElement]);
        System.out.println("Maximum element is " + SearchArray[maxElement]);
        for (int i = 0; i < SearchArray.length; i++) {
            SearchArray[minElement]=0;
            SearchArray[maxElement]=99;
        }
        System.out.println("Array with replaced min and max elements looks like:");
        for (int i : SearchArray) {
            System.out.print(i + " ");
        }
    }

}
