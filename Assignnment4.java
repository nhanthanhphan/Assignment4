/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignnment4;

import java.util.Scanner;

/**
 *
 * @author phant
 */
public class Assignnment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc mang
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        // Khoi tao mang
        float[] arr = new float[n];

        // Goi ham nhap du lieu
        arr = importData(arr);

        // Goi ham xuat mang
        printData(arr);

        // Tim gia tri lon thu 2
        float max2 = findMax2(arr);
        System.out.println("Gia tri lon thu 2 trong mang la: " + max2);

        // Xoa phan tu le
        deleteOddNumber(arr);

        // Xuat mang sau khi xoa
        System.out.println("Mang sau khi xoa cac phan tu le:");
        printData(arr);
    }

    // Ham n hap du lieu cho mang
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    // Ham xuat mang ra mang hinh
    public static void printData(float[] arrays) {
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Ham tim gai tri lon thu 2 trong mang
    public static float findMax2(float[] arrays) {
        float max1 = arrays[0];
        float max2 = Float.MIN_VALUE; // Gan gia tri nho nhat cho max2

        for (float value : arrays) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value != max1) {
                max2 = value;
            }
        }
        return max2;
    }

    // Ham xoa cac phan tu le trong mang ( thay the bang 0)
    public static void deleteOddNumber(float[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                arrays[i] = 0;
            }
        }
    }
}

    

