public class Test
{
    public static void main(String[] args)
    {
        int[] arr1 = {100, 256, 956, 475, 333, 756, 358, 123, 693, 250, 684, 523, 854, 354, 287, 482, 198};
        String[] names = {"Mohammed", "Ivan", "Ryan", "Brian", "Matthew", " Paul", "Elliot", "Michael", "Steven", "Ethan"};
        Sorts.printArr(arr1);
        System.out.println(); //Blank line

        Sorts.ascendingSort(arr1);
        Sorts.printArr(arr1);
        System.out.println();

        Sorts.printArr(names);
        System.out.println();

        Sorts.ascendingSort(names);
        Sorts.printArr(names);



    }
}
