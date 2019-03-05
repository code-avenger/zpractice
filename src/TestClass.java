//Equal Array
//You are given an array  of size 
//
//Find the minimum non negative number  such that there exist an index  and when you can replace  by , the sum of elements of array from index  to   and  to   becomes equal, where . Assume array to be 1-indexed.
//
//If there is no possible  print  in separate line.
//
//Input Format
//
//The first line contains , the number of test cases.
//For each Test case :
//The first line contains an integer , size of the array.
//The second line contains  space-separated integers, the  of which is .
//
//Input Constraints
//
//
//
//
//Sum of N all over testcases doesn't not exceed .
//
//Output Format
//
//For each test case, print the required answer in separate line.
//
//Sample Input
//1
//5
//1 2 3 2 1
//Sample Output
//3
//Explanation
//Add  to the index(1-indexing). 
//
//Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.


import java.util.*;
import java.lang.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {

		// Write your code here

		Scanner scanit = new Scanner(System.in);
		int tests = scanit.nextInt();

		if(1<= tests && tests<= Math.pow(10,5)){

			for(int i=0;i<tests;i++){

				int size=scanit.nextInt();
				
				if(2<= size && size<= Math.pow(10,5)){
				int arr[] = new int[size];

				for(int j=0;j<size;j++){

                    int k=scanit.nextInt();
                    if(0<= k && size<= Math.pow(10,6)){
					arr[j]=k;
                    }
				}

				if(size<=2){
					System.out.println("-1");
					System.exit(0);
				}

				int left=0;
				int right=arr.length-1;

				int leftTotal=arr[left];
				int rightTotal=arr[right];

				while(left < (right-2)){

					if(leftTotal < rightTotal){
						leftTotal += arr[++left];
					}else if(rightTotal < leftTotal){
						rightTotal += arr[--right];
					}else if(leftTotal == rightTotal){
						leftTotal += arr[++left];
						rightTotal += arr[--right];

					}
				}

				if(left+1 == right-1 && leftTotal == rightTotal){
					System.out.println(arr[left+1]);
				}else{
					System.out.println("-1");
				}
				}
			}
		}   
	}
}
