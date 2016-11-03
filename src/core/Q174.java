package core;

public class Q174 {
public static void main(String[] args) {
int arr[] = new int[4];
arr[0] = 1;
arr[1] = 2;
arr[2] = 4;
arr[3] = 5;
int sum = 0;
try {
for (int pos = 0; pos <= 5; pos++) {
sum = sum + arr[pos];
}
} catch (Exception e) {
System.out.println("Invalid index");
}
System.out.println(sum);
}
}
