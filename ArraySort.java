package cycle2;

import java.util.Arrays;

import java.util.Scanner;

public class ArraySort {

public static void main(String[] args) {

// TODO Auto-generated method stub

int n, i = 0;

Scanner s = new Scanner(System.in);

System.out.print("Enter no. of elements you want in array:");

n = s.nextInt();

String[] a = new String[n];

System.out.println("Enter all the elements:");

for (i = 0; i < n; i++)

{

a[i] = s.next();

}

int size = a.length;

for (int i1 = 0; i1 < size - 1; i1++) {

for (int j = i1 + 1; j < a.length; j++) {

if (a[i1].compareTo(a[j]) > 0) {

String temp = a[i1];

a[i1] = a[j];

a[j] = temp;

}

}

}

System.out.println(Arrays.toString(a));

}

}
