import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int[] a=new int[n]; //Array initialization
for(int s=0; s<=n-1; s++){  //for loop to fetch the elements of the Array
    a[s]=scan.nextInt();
}
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}