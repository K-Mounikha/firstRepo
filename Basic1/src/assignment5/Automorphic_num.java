package assignment5;

import java.util.Scanner;

public class Automorphic_num {
	static boolean isAutomorphic(int num) {
        int square=num*num;
        int temp=num;
        int tempSquare = square;
        while (num>0) {
            if (num%10!=square%10) {
                return false;
            }
            num/=10;
            square/=10;
        }
        return true;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number ");
     int num=sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }

	}

