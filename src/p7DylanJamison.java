/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dj0986903
 */
import java.util.*;
public class p7DylanJamison 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers should be read?");
        int[] array = new int[input.nextInt()];
        read(array, input);
        //average
        System.out.println("The average is " + average(array, input));
        //display array
        displayArray(array);
    }
    public static void read(int[] array, Scanner input)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Now enter the number."); 
            array[i] = input.nextInt();
        }
    }
    public static double average(int[] array,Scanner input)
    {
        int sum = 0;
        for(int i = 0; i < array.length;i++)
        {
            sum += array[i];
        }
        double average = sum/array.length;
        return average;
    }
    public static void displayArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
}
