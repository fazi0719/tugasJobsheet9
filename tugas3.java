import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cariNama;
         String [] menu  = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice"};
    
         System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("\nMasukkan nama makanan/minuman yang Anda cari: ");
        cariNama = sc.nextLine();

        boolean ditemukan = false; // utk search  
        int indeks = -1; // agar output dimulai dari 0

        for (int i = 0; i < menu.length; i++) {
        if (menu[i].equalsIgnoreCase(cariNama)) {
                ditemukan = true;
                indeks = i;

                break;
    }
}
System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
    System.out.println("Makanan \"" + menu[indeks] + "\" tersedia pada menu ke-" + (indeks + 1));
        } else {
            System.out.println("Makanan \"" + cariNama + "\" tidak tersedia di menu.");
}
}
}
