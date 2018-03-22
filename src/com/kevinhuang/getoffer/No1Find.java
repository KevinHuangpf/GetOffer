package com.kevinhuang.getoffer;

public class No1Find {
	
	public static void main(String[] agrs)
	{
		int[][] array ={
			{1,2,8,9},
			{2,4,9,12},
			{4,7,10,13},
			{6,8,11,15},
		};
		
		System.out.print(FindC(7, array));
	}

	//1:运行时间：217ms,占用内存：16264k	
    public static boolean FindA(int target, int [][] array) 
    {
        int row = 0;
        int col = array[0].length - 1;
         while(row <= array.length-1 && col >= 0)
         {
             if(array[row][col] == target)
                 return true;
             else if(array[row][col] < target)
                 row++;
             else
                 col--;
         }
        return false;

    }
    
    
    //2:时间复杂度N*N
    public static boolean FindB(int target, int[][] array)
    {
    	for(int row = 0; row <= array.length -1;row++ )
    	{
    		for(int col = 0; col <= array[row].length-1; col++)
    		{
    			if(array[row][col] == target)
    			return true;	
    		}
    			
    	}
    	return false;		
    }
    
    //3:二分查找  时间复杂度O（log2n）
    public static  boolean FindC(int target, int[][] array)
    {
    	for(int row = 0; row <= array.length -1;row++ )
    	{
    		int colH=0;
    		int colT=array[row].length-1;
    		while(colH<=colT)
    		{
    			int mid=(colH+colT)/2;
    			if(array[row][mid]>target)
    				colT=mid-1;
    			else if(array[row][mid]<target)
    				colH=mid+1;
    			else
    				return true;
    		}

    	}
    	return false;		
    }

//尾行
}
