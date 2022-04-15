import java.util.Scanner ;

class App {
    public static void main (String[] args) {

        // Scanner Object & Variable
        Scanner userInput = new Scanner (System.in); 

        //Pilih Wilayah (Farden Ramzy Muharram 202143501512)
        // Main Program
        String cakupanWilayah = ""; //  (Farden Ramzy Muharram) Inisialisasi Variable
        System.out.println();
        System.out.println("=====================");
        System.out.println("|   Pilih Wilayah   |");
        System.out.println("=====================");
        System.out.println("| [1] > Jakarta     |");   
        System.out.println("| [2] > Yogyakarta  |");
        System.out.println("| [3] > Bandung     |");
        System.out.println("| [4] > Bali        |");
        System.out.println("| [5] > Lombok      |");
        System.out.println("=====================");
        System.out.println("| [0] > Keluar      |");
        System.out.println("=====================");

        System.out.println();

        // Input
        System.out.print("Input Wilayah Anda : ");
        int userWilayah = Integer.parseInt(userInput.nextLine());

        // Proses
        if (userWilayah == 1) {
            cakupanWilayah += "Jakarta";
            System.out.println("---------------------------------------------------------");
            System.out.println("Wilayah              > " + cakupanWilayah);
            System.out.println("Status Pembayaran    > Online");
            System.out.println("Kunjungi Web Kami    > aetra.co.id");
            System.out.println("Harap hubungi nomor  > 081-548-983-532 Jika ada pertanyaan");
            System.out.println("---------------------------------------------------------");
        } else if (userWilayah == 2) {
            cakupanWilayah += "Yogyakarta";
            System.out.println("---------------------------------------------------------");
            System.out.println("Wilayah              > " + cakupanWilayah);
            System.out.println("Status Pembayaran    > Online");
            System.out.println("Kunjungi Web Kami    > pdamkotajogja.co.id");
            System.out.println("Harap hubungi nomor  > 089-518-428-415 Jika ada pertanyaan");
            System.out.println("---------------------------------------------------------");
        } else if (userWilayah == 3) {
            cakupanWilayah += "Bandung";
            System.out.println("---------------------------------------------------------");
            System.out.println("Wilayah              > " + cakupanWilayah);
            System.out.println("Status Pembayaran    > Online");
            System.out.println("Kunjungi Web Kami    > pambdg.co.id");
            System.out.println("Harap hubungi nomor  > 088-878-218-643 Jika ada pertanyaan");
            System.out.println("---------------------------------------------------------");
        } else if (userWilayah == 4) {
            cakupanWilayah += "Bali";
            System.out.println("---------------------------------------------------------");
            System.out.println("Wilayah              > " + cakupanWilayah);
            System.out.println("Status Pembayaran    > Online");
            System.out.println("Kunjungi Web Kami    > pdam.denpasarkota.go.id");
            System.out.println("Harap hubungi nomor  > 085-878-878-878 Jika ada pertanyaan");
            System.out.println("---------------------------------------------------------");
        } else if (userWilayah == 5) {
            cakupanWilayah += "Lombok";
            System.out.println("---------------------------------------------------------");
            System.out.println("Wilayah              > " + cakupanWilayah);
            System.out.println("Status Pembayaran    > Online");
            System.out.println("Kunjungi Web Kami    > ptamgirimenang.com");
            System.out.println("Harap hubungi nomor  > 085-878-878-878 Jika ada pertanyaan");
            System.out.println("---------------------------------------------------------");
        } else if (userWilayah == 0) {
            System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
            System.exit(0);
        } else {
            System.out.println("Maaf, Pilihan tidak tersedia");
            System.out.println("Silahkan Coba Lagi");
            System.exit(0);
            
        }

        System.out.print("Masukan No. Pelanggan : ");
        long userCustomerCode = Long.parseLong(userInput.nextLine());
        
        //Golongan dan Tarif (Rionggo Rahardi 202143501540)
        float tarifHarga = 0F; // (Rionggo Rahardi) Inisialisasi Variable

        System.out.println();
        System.out.println("Masukan Jenis Golongan Anda... ");
        System.out.println("Memuat Data.............");
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("|    Golongan   |      Kubik Air      |      Tarif      |");
        System.out.println("=========================================================");
        System.out.println("|      [1]      |       30-50m3       |    Rp. 10.523   |");
        System.out.println("|      [2]      |       50-100m3      |    Rp. 15.241   |");
        System.out.println("|      [3]      |       100-150m3     |    Rp. 20.831   |");
        System.out.println("=========================================================");
        System.out.println();

        System.out.print("Masukan Tipe Golongan Anda : ");
        int userGolongan = Integer.parseInt(userInput.nextLine());
        
        if (userGolongan  == 1) {
            tarifHarga += 10.523F;
            System.out.println("---------------------------------------");
            System.out.println("| Golongan Anda : I                   |");
            System.out.println("| Anda Mendapatkan Tarif Rp. " + tarifHarga + ",- |");
            System.out.println("---------------------------------------");
            
        } else if (userGolongan == 2) {
            tarifHarga += 15.241F;
            System.out.println("---------------------------------------");
            System.out.println("| Golongan Anda : II                  |");
            System.out.println("| Anda Mendapatkan Tarif Rp. " + tarifHarga + ",- |");
            System.out.println("---------------------------------------");
            
        } else if (userGolongan == 3) {
            tarifHarga += 20.831F;
            System.out.println("--------------------------------------");
            System.out.println("| Golongan Anda : III                |");
            System.out.println("| Anda Mendapatkan Tarif Rp. " + tarifHarga + ",- |");
            System.out.println("--------------------------------------");
            
        } else {
            System.out.println("Maaf, Pilihan tidak tersedia");
            System.out.println("Silahkan Coba Lagi");
            System.exit(0);
            
        }
        
        System.out.println("---------------------------------------------");       
        System.out.println("|       Data Telah Berhasil Di Input        |");
        System.out.println("|     Silahkan Masukan Data Berikutnya      |");
        System.out.println("---------------------------------------------");
        System.out.println();
        
        //Data Diri Pelanggan (Siti Mawaddah 202143501505)
        //deklarasi variabel
        System.out.println("=============================================");
        System.out.println("|       Silahkan Masukan Data Diri Anda     |");
        System.out.println("=============================================");
        System.out.println();
        System.out.print("Masukkan Nama Pelanggan : ");
        String userNama = userInput.nextLine();

        System.out.print("Masukkan Tanggal Lahir (dd/mm/yyyy) (Contoh) 01/27/2002 : ");
        String userTglLahir = userInput.nextLine();
        
        String Agama = "";
        System.out.println();
        System.out.println("Masukan Agama Anda... ");
        System.out.println("Memuat Data.............");
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |    No     |      Agama     |");
        System.out.println("  ==============================");
        System.out.println("  |    [1]    |    Islam       |");
        System.out.println("  |    [2]    |    Protestan   |");
        System.out.println("  |    [3]    |    Katolik     |");
        System.out.println("  |    [4]    |    Hindu       |");
        System.out.println("  |    [5]    |    Buddha      |");
        System.out.println("  |    [6]    |    Khonghucu   |");
        System.out.println("  =============================");
        System.out.println();

        System.out.print("Masukan Agama Anda : ");
        int userAgama = Integer.parseInt(userInput.nextLine());
        
        if (userAgama == 1) {
            Agama += "Islam";
            System.out.println("Agama : Islam");
            
        } else if (userAgama == 2) {
            Agama += "Protestan";
            System.out.println("Agama : Protestan");
            
        } else if (userAgama == 3) {
            Agama += "Katolik";
            System.out.println("Agama : Katolik");
            
        } else if (userAgama == 4) {
            Agama += "Hindu";
            System.out.println("Agama : Hindu");
            
        } else if (userAgama == 5) {
            Agama += "Buddha";
            System.out.println("Agama : Buddha");
        
        } else if (userAgama == 6) {
            Agama += "Khonghucu";
            System.out.println("Agama : Khonghucu");

        } else {
            System.out.println("Maaf, Pilihan tidak tersedia");
            System.out.println("Silahkan Coba Lagi");
            System.exit(0);
            
        }
        
        String Pekerjaan = "";
        System.out.println();
        System.out.println("Masukan Pekerjaan Anda... ");
        System.out.println("Memuat Data.............");
        System.out.println();
        System.out.println("  ======================================");
        System.out.println("  |    No     |         Pekerjaan       |");
        System.out.println("  ======================================");
        System.out.println("  |    [1]    |    Belum/Tidak Bekerja  |");
        System.out.println("  |    [2]    |    Pelajar/Mahasiswa    |");
        System.out.println("  |    [3]    |    Ibu Rumah Tangga     |");
        System.out.println("  |    [4]    |    Pegawai Negeri Sipil |");
        System.out.println("  |    [5]    |    Buruh                |");
        System.out.println("  |    [6]    |    Wiraswasta           |");
        System.out.println("  ======================================");
        System.out.println();

        System.out.print("Masukan Pekerjaan Anda : ");
        int userPekerjaan = Integer.parseInt(userInput.nextLine());
        
        if (userPekerjaan == 1) {
            Pekerjaan += "Belum/Tidak Bekerja";
            System.out.println("Pekerjaan : Belum/Tidak Bekerja");
            
        } else if (userPekerjaan == 2) {
            Pekerjaan += "Pelajar/Mahasiswa";
            System.out.println("Pekerjaan : Pelajar/Mahasiswa");
            
        } else if (userPekerjaan == 3) {
            Pekerjaan += "Ibu Rumah Tangga";
            System.out.println("Pekerjaan : Ibu Rumah Tangga");
            
        } else if (userPekerjaan == 4) {
            Pekerjaan += "Pegawai Negeri Sipil";
            System.out.println("Pekerjaan : Pegawai Negeri Sipil");
            
        } else if (userPekerjaan == 5) {
            Pekerjaan += "Buruh";
            System.out.println("Pekerjaan : Buruh");
        
        } else if (userPekerjaan == 6) {
            Pekerjaan += "Wiraswasta";
            System.out.println("Pekerjaan : Wiraswasta");
            
        } else {
            System.out.println("Maaf, Pilihan tidak tersedia");
            System.out.println("Silahkan Coba Lagi");
            System.exit(0);
        }

        System.out.println();
        System.out.print("Masukkan Alamat : ");
        String userAlamat = userInput.nextLine();
        
        System.out.print("Masukkan RT : ");
        String userRT = userInput.nextLine();
        
        System.out.print("Masukkan RW : ");
        String userRW = userInput.nextLine();
        
        System.out.print("Masukkan Kelurahan : ");
        String userKelurahan = userInput.nextLine();
        
        System.out.print("Masukkan Kecamatan : ");
        String userKecamatan = userInput.nextLine();

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("|        Data Telah Berhasil Di Input         |");
        System.out.println("|  Silahkan Melanjutkan Ke Metode Pembayaran  |");
        System.out.println("-----------------------------------------------");
        
        //Metode Pembayaran,no telepon dan kode Pembayaran (Amelia Azra Pakaya 202143501538)
        //variabel
        float adminPdam = 0F;
        String paymentMethod = "";
        
        System.out.println();   
        System.out.println("======================================");
        System.out.println("|         METODE PEMBAYARAN          |");
        System.out.println("======================================");
        System.out.println("| Pilihan Pembayaran |  Biaya Admin  |");
        System.out.println("======================================");
        System.out.println("| 1.  Alfamart       |   Rp 6.545    |");
        System.out.println("| 2.  Indomaret      |   Rp 6.045    |");
        System.out.println("| 3.  ShopeePay      |   Rp 5.545    |");
        System.out.println("======================================");
        System.out.println();
        
        System.out.print("Pilih Metode Pembayaran : ");
        int userPayment = Integer.parseInt(userInput.nextLine());              
        System.out.println();

        System.out.println("========================================");
        System.out.println("Masukan Rincian Data Pembayaran Anda... ");
        System.out.println("========================================");
        System.out.println();
        System.out.print("Tanggal Pembayaran : ");
        int userTanggal = Integer.parseInt(userInput.nextLine());

        System.out.print("Bulan Pembayaran : ");
        String userBulan = userInput.nextLine();

        System.out.print("Tahun Pembayaran : ");
        int userTahun = Integer.parseInt(userInput.nextLine());
        System.out.println();

        
        long userPhone = 0L;

        if (userPayment == 1) { 
            adminPdam += 6.545F;
            paymentMethod += "Alfamart";
            System.out.println("--------------------------------------------");
            System.out.println("| Pembayaran Melalui : Alfamart            |");    
            System.out.println("| Dikenakan Biaya Admin Sebesar Rp. " + adminPdam + ",-|");
            System.out.println("--------------------------------------------");
            System.out.println(); 
            System.out.print("Masukan No. Telepon Anda : ");
            userPhone = Long.parseLong(userInput.nextLine());

            System.out.println();
            System.out.println("Mengirim kode pembayaran ke >> " + userPhone);
            System.out.println();
            System.out.println("-------------------------------------------------------------------");
            System.out.println("| Tunggu Beberapa Saat Sampai Kode Pembayaran Terkirim Melaui SMS |");
            System.out.println("-------------------------------------------------------------------");
            System.out.println();
            
            System.out.print("Masukan Kode Pembayaran Yang Telah Dikirimkan : ");
            long kodePembayaran = Long.parseLong(userInput.nextLine()); 
            
            System.out.println();
            System.out.println("Kode " + kodePembayaran + " Berhasil Diverifikasi");
            System.out.println("-----------------------------------------------");
            System.out.println("| Segera Lakukan Pembayaran Ke Gerai Terdekat |");
            System.out.println("-----------------------------------------------");

        } else if (userPayment == 2) {
            adminPdam += 6.045F;
            paymentMethod += "Indomaret";
            System.out.println("---------------------------------------------");
            System.out.println("| Pembayaran Melalui : Indomaret            |");
            System.out.println("| Dikenakan Biaya Admin Sebesar Rp. " + adminPdam + ",-|");
            System.out.println("---------------------------------------------");
            System.out.println(); 
            System.out.print("Masukan No. Telepon Anda : ");
            userPhone = Long.parseLong(userInput.nextLine());

            System.out.println();
            System.out.println("Mengirim kode pembayaran ke >> " + userPhone);
            System.out.println();
            System.out.println("-------------------------------------------------------------------");
            System.out.println("| Tunggu Beberapa Saat Sampai Kode Pembayaran Terkirim Melaui SMS |");
            System.out.println("-------------------------------------------------------------------");
            System.out.println();
            
            System.out.print("Masukan Kode Pembayaran Yang Telah Dikirimkan : ");
            long kodePembayaran = Long.parseLong(userInput.nextLine());

            System.out.println();
            System.out.println("Kode " + kodePembayaran + " Berhasil Diverifikasi");
            System.out.println("-----------------------------------------------");
            System.out.println("| Segera Lakukan Pembayaran Ke Gerai Terdekat |");
            System.out.println("-----------------------------------------------");
    
            
        } else if(userPayment == 3) { 
            adminPdam += 5.545F;
            paymentMethod += "ShopeePay";
            System.out.println("-----------------------------------------------");
            System.out.println("| Pembayaran Melalui : ShopeePay              |");
            System.out.println("| Dikenakan Biaya Admin Sebesar Rp. " + adminPdam + ",-|");
            System.out.println("-----------------------------------------------");
            System.out.print("Masukan Pin Anda Untuk Konfirmasi Pembayaran : ");
            int pin = Integer.parseInt(userInput.nextLine());
            System.out.println();
            
            System.out.println("-----------------------------------------------------");
            System.out.println("| Transaksi sedang diproses,tunggu beberapa saat... |");
            System.out.println("|           Transaksi Anda berhasil                 |");
            System.out.println("-----------------------------------------------------");
            System.out.println();

        } else {
            System.out.println("Maaf, Pilihan tidak tersedia");
            System.out.println("Silahkan Coba Lagi");
            System.exit(0);
        }

        System.out.println();
        System.out.println("Semua Data Telah Berhasil Di input Dengan Benar");
        System.out.print("Ketik [y/n] Untuk Melanjutkan > ");
        String lastInput = userInput.nextLine();

        if (lastInput.equalsIgnoreCase("y")) {
            System.out.println("Mencetak Struk Anda...");
        } else if (lastInput.equalsIgnoreCase("n")) {
            System.out.println("Anda Telah Membatalkan Transaksi");
            System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
            System.exit(203);
        } else {
            System.out.println("Pilihan Anda Tidak Valid Program Akan Keluar..");
            System.exit(404);
        }
        
        // Variabel
        Float totalHarga;
        totalHarga = adminPdam + tarifHarga; // Menghitung Total Harga (Amelia Azra Pakaya)

        System.out.println("| Total Tagihan Anda Rp. " + totalHarga + ",-      |");
        System.out.println("-----------------------------------------------");
        System.out.println("|        Terima Kasih Telah Berbelanja         |");
                        
        //output
        System.out.println("==========================================");
        System.out.println("|             Data Pelanggan             |");
        System.out.println("==========================================");
        System.out.println(" Nama Pelanggan      : " + userNama);
        System.out.println(" Tanggal Lahir       : " + userTglLahir);
        System.out.println(" Agama               : " + Agama);
        System.out.println(" Pekerjaan           : " + Pekerjaan);
        System.out.println("==========================================");
        System.out.println("|         STRUK PEMBAYARAN PDAM          |");
        System.out.println("==========================================");
        System.out.println(" Waktu Pemesanan     : " + userTanggal + "-" + userBulan + "-" + userTahun);
        System.out.println(" No. Telepon         : " + "+(62) " + userPhone);
        System.out.println(" Nama Pelanggan      : " + userNama);
        System.out.println(" Alamat              : " + userAlamat);
        System.out.println(" Wilayah             : " + cakupanWilayah);
        System.out.println(" Golongan            : " + userGolongan);
        System.out.println(" No. Pelanggan       : " + userCustomerCode);
        System.out.println(" Metode Pembayaran   : " + userPayment + " > " + "(" + paymentMethod + ")");
        System.out.println("==========================================");
        System.out.println("|            Rincian Tagihan             |");
        System.out.println("==========================================");
        System.out.println(" Tarif PDAM          : " + "Rp. " + tarifHarga);
        System.out.println(" Biaya Admin         : " + "Rp. " + adminPdam);
        System.out.println(" Total Tagihan       : " + "Rp. " + totalHarga);
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Terima Kasih Telah Berbelanja Di Gerai PDAM Kami");
        System.out.println();
    }
}

    // Dokumen Program
    /*
    *   Data Nama Kelompok :
    *   
    *   Nama : Amelia Azra Pakaya
    *   NPM  : 202143501538
    *   Membuat fitur metode pembayaran,no HP dan kode pembayaran  
    *
    *   Nama : Siti Mawaddah
    *   NPM  : 202143501505
    *   Membuat fitur data diri pelanggan
    *
    *   Nama : Farden Ramzy Muharram
    *   NPM  : 202143501551
    *   Membuat fitur pilih wilayah
    *
    *   Nama : Rionggo Rahardi
    *   NPM  : 202143501540
    *   Membuat fitur golongan dan tarif 

    *   Informasi Fitur Program...

    *   1. Pilih Wilayah (Farden Ramzy Muharram)
    *   *list fitur
    *   - Pilih wilayah yang ingin di bayar
    *   - Informasi mengenai rincian tiap wilayah
    *
    *   2. Pilih Golongan (Rionggo Rahardi)
    *   *list fitur
    *   - Pilih Tipe golongan yang ingin anda bayar
    *   - Tarif per-golongan

    *   3. Input Data Pelanggan (Siti Mawaddah)
    *   *list fitur
    *   - Input data diri konsumer
    *   - rincian kependudukan user

    *   4. Pilih Metode Pembayaran (Amelia Azra Pakaya)
    *   *list fitur
    *   - metode pembayaran yang ingin anda gunakan
    *   - informasi mengenai metode pembayaran

    *   5. Cetak Struk Pembayaran (Semua Tim Kelompok)
    *   *list fitur
    *   - Mencetak Semua Data yang di input oleh user
    *   
    *   6. Keluar Program (Semua Tim Kelompok)
    *   *list fitur
    *   - Pilihan lanjut atau keluar program
    *  
    */


    /* Informasi Tambahan Program
    *
    * Program Akan Keluar Jika Inputan Tidak Valid
    * Setiap Data Bisa Diubah Dengan Mengupdate Data Menggunakan ( += )
    *
    */
