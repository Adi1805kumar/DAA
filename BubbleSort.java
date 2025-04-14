import java.util.Arrays;

public class Bubblesort {
	public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
	public static void main(String[] args) {
		 int[] a=new int[]{1,5,7,3,8,8,2};
		 bubbleSort(a);
		 System.out.println(Arrays.toString(a));
	}

}