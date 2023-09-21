import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //Input using STDIN
        List<Integer> nlist = new ArrayList<Integer>(n); //making of an ArrayList and inputting numbers
        for (int i = 0; i < n; i++)
        {
            nlist.add(scan.nextInt());
        }
        
        int ins = scan.nextInt();
        for (int i = 0; i < ins; i++)
        {
            String operation = scan.next();
            if (operation.equals("Insert"))
            {
                int ind = scan.nextInt(); //to get the index number
                int val = scan.nextInt(); //to get the value to be inserted at the ind position
                nlist.add(ind, val);
            }
            
            else if (operation.equals("Delete"))
            {
                int ind = scan.nextInt(); //index to the delete the value
                nlist.remove(ind);
            }
        }
        for (int element: nlist)   
        {
            System.out.print(element + " ");
        }
    }
}