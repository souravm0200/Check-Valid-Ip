//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java



class Solution 
{
     public Set<String> allnums;
    public boolean isValid(String s) 
    {
       allnums = new HashSet<>();
        // allowed segments
        for (int i = 0; i < 256; i++) {
            allnums.add(String.valueOf(i));
        }

        int dots = 0;
        // counting dots
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') dots++;
        }
        if (dots != 3) return false;
        
        // split according to positions of '.'
        String[] nums = s.split("\\.");
        if (nums.length != 4) return false;

        for (String x : nums) {
            if (!allnums.contains(x)) return false;
        }
        return true;
    }
}

 