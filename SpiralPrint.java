public class SpiralPrint {

	public static void spiralPrint(int matrix[][]){
	int i, k = 0, l = 0,m=matrix.length,n=matrix[0].length; 
        /*  k - starting row index 
        m - ending row index 
        l - starting column index 
        n - ending column index 
        i - iterator 
        */
           
        while (k < m && l < n) 
        { 
            // Print the first row from the remaining rows 
            for (i = l; i < n; ++i) 
            { 
                System.out.print(matrix[k][i]+" "); 
            } 
            k++; 
   
            // Print the last column from the remaining columns  
            for (i = k; i < m; ++i) 
            { 
                System.out.print(matrix[i][n-1]+" "); 
            } 
            n--; 
   
            // Print the last row from the remaining rows */ 
            if ( k < m) 
            { 
                for (i = n-1; i >= l; --i) 
                { 
                    System.out.print(matrix[m-1][i]+" "); 
                } 
                m--; 
            } 
   
            // Print the first column from the remaining columns */ 
            if (l < n) 
            { 
                for (i = m-1; i >= k; --i) 
                { 
                    System.out.print(matrix[i][l]+" "); 
                } 
                l++;     
            }         
        } 
	}
}