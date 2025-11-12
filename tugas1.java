import java.util.Scanner;
public class tugas1 {
                 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int jmlMhs,max = 0,min = 0;
    double rata2, total = 0,nilaiMhslength;

    System.out.print("masukkan jumlah mahasiswa : ");
    jmlMhs = sc.nextInt();

     int [] nilaiMhs = new int [jmlMhs];

     for  (int i = 0; i < nilaiMhs.length; i++){
        System.out.print("masukkan nilai mahasiswa ke-" +(i+1) +" : ");
        nilaiMhs[i] = sc.nextInt();
        total += nilaiMhs[i];
     }
    rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+ rata2);

      max = nilaiMhs[0];  
      min = nilaiMhs[0];  
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }
        }
    System.out.println("Nilai tertinggi : " + max);
    System.out.println("Nilai terendah : " + min);

    System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        }

    }



