import java.util.Scanner;
public class tugas2 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPesanan = 0;
        double total =0;

        System.out.print("Masukkan jumlah pesanan : ");
        jmlPesanan = sc.nextInt();
         sc.nextLine();
        String [] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        for (int i =0; i <namaPesanan.length; i++){
            System.out.print(" Masukkan nama makanan/minuman ke-  "+(i+1)+" : ");
            namaPesanan [i] = sc.nextLine();
       

            System.out.print(" Masukkan harga " + namaPesanan[i] + " : ");
            hargaPesanan [i] = sc.nextDouble();
         sc.nextLine();

            total = total + hargaPesanan[i];
           
        }
       System.out.println("Total biaya semua pesanan: Rp " + (int)total);
    
       System.out.println(" \n=================== ");
       System.out.println(" STRUK PEMBAYARAN ");
       System.out.println("===================");

       for (int i =0; i <namaPesanan.length; i++){
    System.out.println((i+1)+ "." + namaPesanan[i] + " Rp." + hargaPesanan[i]);
    }
   System.out.print("\nTotal biaya semua pesanan: Rp " +total);  
}

}
