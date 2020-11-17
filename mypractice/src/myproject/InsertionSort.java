package myproject;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {6,1,7,9,0,3,1,-4,13};
     int n=arr.length;
     for(int i=0;i<n-1;i++) {
    	for(int j=i+1;j<n;j++) {
    		if(arr[i]>arr[j]) {
    		int tmp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=tmp;
    		}
    	}
     }
     for(int i=0;i<n;i++) {
     System.out.print(arr[i]+" ");
	}
	}
}
