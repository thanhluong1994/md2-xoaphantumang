import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int[] a = {3, 2, 6, 4, 8};
        int index_del;
        int[] newArray;
        int k=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap phan tu ban muon xoa : ");
        index_del=scanner.nextInt();
        newArray=new int[a.length-1];
        for(int i=0;i<a.length;i++){
            if(a[i]!=index_del){
                a[k] = a[i];
                k++;
                }
        }
        System.out.println("Mang sau khi xoa la : ");
        for(int i=0;i<k;i++){
            System.out.print(a[i] + "\t");
        }
      }
    }