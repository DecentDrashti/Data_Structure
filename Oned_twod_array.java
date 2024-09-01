//leetcode 1st sep program
//my solution
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=m*n) 
          return new int[0][0];
         
        int [][]ans= new int[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               ans[i][j]=original[k++];
               
            }

         }
         return ans;
    }
}
//another easy solution with lesser time complexity
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length){
            return new int[0][0];
        }
        int[][] arr = new int[m][];

        for(int i=0; i<m; i++){
           arr[i] = Arrays.copyOfRange(original, i*n, i*n+n);
        }
        return arr;
    }
}
//explanation of arr[i] = Arrays.copyOfRange(original, i*n, i*n+n);
Purpose
This method call creates a new array by copying a specific range of elements from the original array.

Parameters
original: The source array from which elements are copied.
i * n: The starting index (inclusive) in the original array.
i * n + n: The ending index (exclusive) in the original array.
Example
Let’s say original = [1, 2, 3, 4, 5, 6], m = 2, and n = 3. When i = 0:

i * n = 0 * 3 = 0
i * n + n = 0 * 3 + 3 = 3
So, Arrays.copyOfRange(original, 0, 3) will copy elements from index 0 to 2 (not including 3), resulting in [1, 2, 3].

When i = 1:

i * n = 1 * 3 = 3
i * n + n = 1 * 3 + 3 = 6
So, Arrays.copyOfRange(original, 3, 6) will copy elements from index 3 to 5 (not including 6), resulting in [4, 5, 6].

How It Fits in the Loop
In the loop:

Java

for(int i = 0; i < m; i++){
    arr[i] = Arrays.copyOfRange(original, i * n, i * n + n);
}

For each i, it copies a subarray of length n from original starting at index i * n and assigns it to arr[i].