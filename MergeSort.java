
public class MergeSort {

	public static int[] merge(int arr1[], int arr2[]){
      int n = arr1.length+arr2.length,i=0,j=0,k=0;
	  int arr3[] = new int[n];
      while(i<arr1.length && j<arr2.length)
      {
        if(arr1[i]<=arr2[j])
        {
          arr3[k] = arr1[i];
          i++;
        }
        else 
        {
          arr3[k] = arr2[j];
          j++;
        }
        k++;
      }
	while(i<arr1.length)
    {
      arr3[k] = arr1[i];
      i++;
      k++;
    }
  while(j<arr2.length)
    {
      arr3[k] = arr2[j];
      j++;
      k++;
    }
        return arr3;
  }
}