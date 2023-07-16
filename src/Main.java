import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int tot = 0;
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            tot+=array[i];
        }
        int s=size;
        for(int i=size-1;i>=0;i--){
            tot+=(array[i]*s);
            s--;
        }
        System.out.println(tot);
    }
}