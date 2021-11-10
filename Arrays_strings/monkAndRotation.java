/* IMPORTANT: Multiple classes and nested static classes are supported */


//uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
import java.io.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int j=0;j<t;++j){
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            k=k%n;
            //System.out.println("ok");
            int[] arr = new int[n];
            //best approach
            int count=0;
            String str = br.readLine();
            if(k==0){
                System.out.println(str);
                continue;
            }    
            for(int i=0;i<str.length();++i){
                if(str.charAt(i)==' ')
                    count++;
                if(count==n-k){
                    System.out.println(str.substring(i+1,str.length())+" "+str.substring(0,i));
                    break;
                }    
            }



            /*
            //2nd approach
            String[] arr_s = br.readLine().split(" ");
            int count = 0;
            
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(arr_s[i]);
                count++;
                if(count >n-k){
                    System.out.print(arr[i]+" ");
                }
            }
            int i=0;    
            for(i=0;i<n-k-1;++i){
                
                System.out.print(arr[i]+" ");
            }    
            System.out.print(arr[i]);
            System.out.println();
            */
            /*
            //naive approach
            for(int i=0;i<n;++i){
                arr[(i+k)%n] = Integer.parseInt(arr_s[i]);   
            }      
            //System.out.println(Arrays.toString(arr_1)+" "+Arrays.toString(arr_2) );
            for(int i=0;i<n;++i)
                System.out.print(arr[i]+" ");    
            System.out.println();
            */
        }



    }
}

