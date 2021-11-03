import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

class TestClass {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;++i){
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            for(int j=0;j<n;++j){
                arr[j] = Integer.parseInt(s[j]);
            }
            System.out.println(minAndXorOr(arr,n));    
        }


    }
    static int minAndXorOr(int[] arr, int n){
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n-1;++i)
            ans = Math.min(ans,arr[i]^arr[i+1]);

        return ans;

    }
}

