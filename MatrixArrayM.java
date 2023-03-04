import java.util.*;
public class MatrixArrayM{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of  tables: ");
int t = sc.nextInt();
System.out.print("Enter the number of  rows: ");
int r = sc.nextInt();
System.out.print("Enter the number of columns: ");
int c = sc.nextInt();

int[][][]a = new int[t][r][c];
System.out.print("Enter the values :");
for(int k = 0; k < t; k++){
for(int i = 0; i < r; i++){
for(int j = 0; j < c; j++){
//System.out.print("Enter the values a[" + k + "] [" + i + "] [" + j + "]  ");
 a[k][i][j] = sc.nextInt();
}
}
}
System.out.println();
for(int k = 0; k < t; k++){
for(int i = 0; i < r; i++){
for(int j = 0; j < c; j++){
System.out.print(a[k][i][j] + " ");
}
System.out.print("\t");
}
System.out.println();
}
}
}