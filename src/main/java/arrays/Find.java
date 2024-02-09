package arrays;

public class Find {
    public static void main(String [] args){
        int[] array ={1,6,9,-5,-2,0};
        int largest=array[0];
        int smallest=array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("Largest Number=" +largest);
        System.out.println("Smallest Number=" +smallest);
    }
}
