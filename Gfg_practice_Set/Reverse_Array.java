package Gfg_practice_Set;

public class Reverse_Array {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        for(int i = a.length - 1; i >= 0; i--){
            System.out.println("a[" +a[i]+ "]");
        }
    }
}