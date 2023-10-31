package Java.Tugas1;

import jdk.internal.org.objectweb.asm.tree.TableSwitchInsnNode;

import java.util.Scanner;

import static java.lang.System.out;

public class KalkulatorSederhana {
    public static void main(String[] args) { //menggunakan shortcut PSVM.
        Scanner input = new Scanner(System.in);
        out.println("Halo Ini cuma coba");

        out.println("=== Kalkulator Sederhana ===");
        out.println("Pilihlah operasi yang ingin anda gunakan :");
        out.println("1. Penjumlahan");
        out.println("2. Pengurangan");
        out.println("3. Perkalian");
        out.println("4. Pembagian");

        out.println("Masukkan pilihan (1/2/3/4) : ");
        int pilihan = input.nextInt();

        out.println("Masukkan bilangan pertama : ");
        double bilangan1 = input.nextDouble();

        out.println("Masukkan bilangan kedua : ");
        double bilangan2 = input.nextDouble();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = bilangan1 + bilangan2; //Live template (tambah)
                break;
            case 2:
                hasil = bilangan1 - bilangan2; //Live template (kurang)
                break;
            case 3:
                hasil = bilangan1 * bilangan2; //Live template (kali)
                break;
            case 4:
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    out.println("Tidak bisa melakukan pembagian dengan nol.");
                    System.exit(1);
                }
            default:
                out.println("Pilihan tidak valid.");
                System.exit(1);
        }
        out.println("Hasil : " + hasil);
    }
}