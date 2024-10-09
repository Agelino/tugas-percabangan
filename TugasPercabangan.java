import java.util.Scanner;

public class TugasPercabangan {

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int masaKerja, totalJamKerja;
        double gajiPokok = 5000000, gajiAkhir, tambahanGaji = 0, uangLembur = 0;
      
        int jamKerjaPerbulan = 160;  // Jam kerja normal per bulan karena 4 minggu=1 bulan
        int uangLemburPerJam = 50000;  

        // Input masa kerja dan jumlah jam kerja dari user
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();

        System.out.print("Masukkan total jam kerja dalam 1 bulan: ");
        totalJamKerja = scanner.nextInt();

        // Hitung tambahan gaji berdasarkan masa kerja
        if (masaKerja >= 5 && masaKerja <= 10) {
            tambahanGaji = 0.05 * gajiPokok;  // Tambahan 5% jika masa kerja antara 5-10 tahun
        } else if (masaKerja > 10) {
            tambahanGaji = 0.10 * gajiPokok;  // Tambahan 10% jika masa kerja di atas 10 tahun
        }

        // Hitung jumlah jam lembur dalam 1 bulan 
        
        int jamLembur = totalJamKerja - jamKerjaPerbulan; 

        // Jika ada jam lembur, hitung uang lembur
        if (jamLembur > 0) {
            uangLembur = jamLembur * uangLemburPerJam;
        }

        // Hitung gaji akhir
        gajiAkhir = gajiPokok + tambahanGaji + uangLembur;

        // Tampilkan hasil perhitungan
        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Tambahan gaji: Rp " + tambahanGaji);
        System.out.println("Uang lembur: Rp " + uangLembur);
        System.out.println("Gaji total yang diterima: Rp " + gajiAkhir);
        
        scanner.close();
    }
}
//Pseudocode hitung gaji karyawan

//start
// Deklarasi
// var   uangLemburPerJam = 50000,
//       jamKerjaPerbulan = 160,
//       masakerja,
//       totalJamKerja: integer;

      


// var   gajiPokok = 5000000,
//       tambahanGaji,
//       uanglembur,
//       gajiAkhir:double;


// Algoritma
//   input (masakerja);
//   input (totalJamKerja);

//   if masakerja < 5 then
//       output (tambahanGaji = 0);
//   else if masakerja >= 5 && masakerja <= 10 then
//       output (tambahanGaji = 0.05 * gajiPokok);  // 5% tambahan
//   else if masakerja > 10 then
//       output (tambahanGaji = 0.10 * gajiPokok);  // 10% tambahan
//   end if

//   if totalJamKerja > jamKerjaPerbulan then
//       output (lembur = (totalJamKerja -  jamKerjaPerbulan) * uangLemburPerJam);
//   else
//       lembur = 0;
//   end if

//   output gajiAkhir =( gajiPokok + tambahanGaji + uanglembur);

// End
