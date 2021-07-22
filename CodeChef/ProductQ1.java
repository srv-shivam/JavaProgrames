package CodeChef;

import java.util.*;
public class ProductQ1 {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sub = new int[n];
        int[] nSub = new int[n];
        int size = 0;
        int k =0;
        int count = 0, neg = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        
        for(int i=0; i<n; i++) {
        	
            count = 0; neg = 0;
            
            if(isPrime(arr[i]) && arr[i] > 0) {
                count++;
                
                if(arr[i] < 0) neg++;
                
                for(int j=i+1; j<n; j++) {
                	
                    if(isPrime(arr[j]) && arr[i] > 0) {
                        count++;
                       if(arr[j] < 0) neg++; 
                        i = j;
                        break;
                    }
                    
                    if(arr[j] < 0) neg++;
                    count++;
                }
                sub[k] = count;
                nSub[k] = neg;
                size++;
                k++;
            }
        }
        
        System.out.print("Subset array : ");
        for(int i=0; i<size; i++) {
        	System.out.print(sub[i] + " ");
        }
        
        System.out.println("Size : " + size);
        System.out.print("\nSubset Negative array : ");
        for(int j=0; j<size; j++) {
        	System.out.print(nSub[j] + " ");
        }
        
        int max = Integer.MIN_VALUE;
        int maxPos=0;
        
        int Negmin = Integer.MAX_VALUE;
        int minPos=0;
        
        for(int i=0; i<size; i++) {
        	
        	max = Math.max(max, sub[i]);
        	maxPos = i;
        }
        
        System.out.println("\nMax : " + max);
        
        for(int i=0; i<size-1; i++) {
        	
        	Negmin = Math.min(Negmin, nSub[i]);
        	minPos = i;
        }
        
        System.out.println("\nMin : " + Negmin);
        
        if(Negmin < max) {
        	System.out.println(sub[minPos]);
        } else {
        	System.out.println(sub[maxPos]);
        }
    }
}
