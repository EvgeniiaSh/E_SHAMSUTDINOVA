//package task1;
import java.io.*;
import java.util.*;


public class task1 {
  public static void main(String[] args) {
  
    String fileNameIn = args[0];
    int[] array = null;
    try (BufferedReader in = new BufferedReader(new FileReader(fileNameIn)))
    {
        array = in.lines().mapToInt(Integer::parseInt).toArray();
    }
    catch (IOException | NumberFormatException e)
    {
        e.printStackTrace();
    }
    if (array != null)
    {      
        int max = Integer.MIN_VALUE;
        int min = array[0];
        double average = 0;
        double median = array[0] ;
    
        for (int i = 0; i < array.length; i++) {
            
          if (max < array[i])
          {
            max = array[i];
          }
            if (array.length > 0){
              double sum = 0;
              for (int j = 0; j < array.length; j++) {
              sum += array[j];
            }
            average = sum / array.length;
            }
            if (array.length % 2 == 0){
                median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
            }
            else {
              min = array[i];
              median = (double) array[array.length/2];
            }           
        }
        System.out.printf("median: " + "%.2f   ",median);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.printf("average: " + "%.2f",average);
      }
    }  
  }