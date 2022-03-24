package Array_Arraylist;

import java.util.Scanner;

public class Exercise_07_17 {
    //main method
    public static void main(String[] args) {

        //create a scanner
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the number of students
        System.out.println("Enter the number of students: ");
        String[]students=new String[in.nextInt()];
        int[]scores=new int[students.length];

        //prompt the user to enter each student's named and their scores
        System.out.println("Enter the name a score for each student: ");
        for (int i=0;i<students.length;i++){
            System.out.println("Student "+(i+1)+": ");
            students[i]=in.next();
            System.out.println("Score: ");
            scores[i]=in.nextInt();
        }

        //sort students names in decreasing order of their scores
sortDecreasing(students,scores);
        //display student name in decreasing order of their scores
for (String e:students){
    System.out.println(e);
}

    }
    //sort a string and integer array in decreasing order
    public static void sortDecreasing(String[]strs,int[]nums){
        for (int i=0;i<nums.length;i++){
            int max=nums[i];
            int maxIndex=i;
            String temp;

            //find the minimum in the list[i..nums.length-1]
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]>max){
                    max=nums[j];
                    maxIndex=j;
                }
            }
            if (maxIndex!=i){
                //swap string array
                temp=strs[i];
                strs[i]=strs[maxIndex];
                strs[maxIndex]=temp;

                //swap int array
                nums[maxIndex]=nums[i];
                nums[i]=max;

            }
        }
    }
}
