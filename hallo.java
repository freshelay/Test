import java.util.Arrays;

public class hallo {
public int[] removeOneElement(int[] currentArray, int removeIndex)
{
    int size = currentArray.length;
    int[] resultArray = new int[size-1];	
    int resulArrayCount = 0;
    for(int i = 0;i < size; i++) 
    {			
        if (i!=removeIndex)
        {				
            
            resultArray[resulArrayCount] = currentArray[i];
            resulArrayCount++;
        }
        
    }
    return resultArray;
}
}