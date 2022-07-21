package com.bridgelap;
import java.util.Scanner;
public class AddMatrix {
    public static void main(String args[])
        {
            int rows, columns,i,j;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the number of rows");
            rows = in.nextInt();

            System.out.println("Enter the number columns");
            columns = in.nextInt();

            int mat1[][] = new int[rows][columns];
            int mat2[][] = new int[rows][columns];
            int res[][] = new int[rows][columns];

            System.out.println("Enter the elements of matrix1");

            for ( i= 0 ; i < rows ; i++ )
            {

                for ( j= 0 ; j < columns ;j++ )
                    mat1[i][j] = in.nextInt();

                System.out.println();
            }
            System.out.println("Enter the elements of matrix2");

            for ( i= 0 ; i < rows ; i++ )
            {

                for ( j= 0 ; j < columns ;j++ )
                    mat2[i][j] = in.nextInt();

                System.out.println();
            }

            for ( i= 0 ; i < rows ; i++ )
                for ( j= 0 ; j < columns ;j++ )
                    res[i][j] = mat1[i][j] + mat2[i][j] ;

            System.out.println("Sum of matrices:-");

            for ( i= 0 ; i < rows ; i++ )
            {
                for ( j= 0 ; j < columns ;j++ )
                    System.out.print(res[i][j]+"\t");

                System.out.println();
            }

        }
    }

