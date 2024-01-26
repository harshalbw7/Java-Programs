// Sample input 1
// 1
// 3
  
// Sample output 1
// 3
  
// Sample input 2
// -1
// 2
  
// Sample output 2
// java.lang.Exception: Breadth and height must be positive

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            if(x<=0 || y<=0){
                throw new Exception("Breadth and height must be positive");
            }
            else{
                System.out.print(x*y);
            }  
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
