import java.util.*;
public class MatrixArray{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of  rows: ");
int r = sc.nextInt();
System.out.print("Enter the number of columns: ");
int c = sc.nextInt();

int[][]a = new int[r][c];

for(int i = 0; i < a.length; i++){
for(int j = 0; j < a.length; j++){
 a[i][j] = sc.nextInt();
}
}
for(int i = 0; i < a.length; i++){
for(int j = 0; j < a.length; j++){
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}
}