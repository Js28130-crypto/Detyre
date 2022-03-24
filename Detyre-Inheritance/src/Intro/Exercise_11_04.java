package Intro;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_04 {
    //main method
    public static void main(String[] args) {
        //create a scanner
        Scanner in = new Scanner(System.in);
        //create an ArrayList
        ArrayList<Integer>list=new ArrayList<Integer>();

        //prompt the user to enter a sequence of numbers ending with 0
        System.out.println("Enter a sequence of numbers ending with 0: ");
        Integer number=in.nextInt();
        while (number.intValue()!=0){
            list.add(number);
            number=in.nextInt();
        }

        //display the largest number in the input
        System.out.println("The largest number in the input is "+max(list));
    }
    //return the maximum value in an ArrayList of integers
    public static Integer max(ArrayList<Integer>list){
        if (list.size()==0)
            return null;
        Integer max=list.get(0);
        for (int i=0;i<list.size();i++){
            if (list.get(i)>max)
                max=list.get(i);
        }
        return max;
    }
}
