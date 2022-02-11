package com.assignment;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][]={{2,4,8},{5,9,3},{6,3,1}};
		int b[][]={{6,2,9},{4,7,10},{1,5,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
        
	}

}
