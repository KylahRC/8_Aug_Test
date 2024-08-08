import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
//        question v

//        declarations
        int i;
        int j;
        int temp;
        Random rand = new Random();
        int[] intArr = new int [50];

//        code to add rand to array
        for(i = 0; i < intArr.length; i++)
        {
            intArr[i] = rand.nextInt (50);
        }
//        code to sort the array
        for(i = 0; i < intArr.length - 1; i++)
        {
            for(j = i + 1; j < intArr.length; j++)
            {
                if (intArr[i] < intArr[j])
                {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

//        prints the array
        System.out.println(Arrays.toString(intArr));
    }

    public void i ()
    {
//        declarations
        String[] strArr = new String[50];
    }

    public void ii ()
    {
//        declarations
        String[] strArr;
        strArr = new String[50];
    }

    public void iii ()
    {
//        declarations
        String[] strArr = {"/"};
    }

    public void iv ()
    {
//        I count it as a separate line by technicality
//        declarations
        int i;

        String sizeString = JOptionPane.showInputDialog("Enter size of array");
        int SIZE = Integer.parseInt(sizeString);

        String[] strArr = new String[SIZE];

        for(i = 0; i < SIZE; i++)
        {
            String strElements = JOptionPane.showInputDialog("Enter string elements");
            strArr[i] = strElements;
        }

        for (i = 0; i < SIZE; i++)
        {
            JOptionPane.showMessageDialog(null, i + ": " + strArr[i]);
        }
    }

    public void vi ()
    {
//        declarations
        int[][] intArr = new int[5][8];
    }

    public void vii ()
    {
//        declarations
        int[][] intArr;
        intArr= new int[5][8];
    }

    public void viii ()
    {
//        declarations
        int[][] intArr;
        intArr= new int[5][];
//        I have no idea what to do after this step :(
    }

    public void ix ()
    {
//        declarations
        int i;
        int j;
        int[][] intArr;
        intArr= new int[5][8];
//        couldn't do the allocate memory step in previous
//        question, so we start with what I can do

        for(i = 0; i < intArr.length; i++)
        {
            for(j = 0; j < intArr.length; j++)
            {
                intArr[i][j] = i * j;
            }
        }

//        it doesn't work and I don't know why
    }

    public void x ()
    {
//        declarations
        int i;
        int j;
        int[][] intArr;
        intArr= new int[5][8];

//        code to inout things into the array
        for(i = 0; i < intArr.length; i++)
        {
            for(j = 0; j < intArr.length; j++)
            {
                intArr[i][j] = i * j;
            }
        }
//        code to output what was in array
//        it doesn't work and I don't know why
        for(i = 0; i < intArr.length; i++)
        {
            for(j = 0; j < intArr.length; j++)
            {
                System.out.println(intArr[i][j] + " ");
            }
        }
//        We're struggling, I have no idea what to do
    }

    public void Question3 ()
    {
//        declarations
        int[] array = {10, 5, 20, 25, 29, 27, 22, 12, 8};
        int i;
        int temp;
        int j;

//        prints the unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(array));

//        code to sort the array
        for(i = 0; i < array.length - 1; i++)
        {
            for(j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
//                prints the array sorting steps
                System.out.println("Array being sorted: " + Arrays.toString(array));
            }

        }
//        prints the final sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public void Question4 ()
    {
//        I totally forgot how to write the code for an insertion sort :(
//        declarations
        int[] array = {20, 5, 15, 10, 3, 17, 7};
        int i = 2;
        int temp;
        int j = i - 1;
        int a = j - 1;

        System.out.println("Unsorted array: " + Arrays.toString(array));

//        code to sort the array
        while(array[a] < array[j])
        {
            i++;
            while(array[a] < array[j] && array[i] > array[j])
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.println("Array being sorted: " + Arrays.toString(array));
            }

        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}