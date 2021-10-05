public class Aprender {
    public static void Intro() {
        boolean x = false;
        boolean y = true;
        // Operator Boolean
        // && and
        // || or
        // == pembanding
        // Contoh And
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(x == y);

        if (x && y) {
            System.out.println("IF ini berjalan");
        }
        if (x == true) {
            System.out.println("X adalah True");
        }

        int nomor = 3;
        // Percabangan
        // < <=
        // > >=
        if (nomor == 1) {
            System.out.println("Cabang 1");
        } else if (nomor == 2) {
            System.out.println("Cabang 2");
        } else {
            System.out.println("Cabang Lainnya");
        }

        // Scope
        int variabel2 = 1;
        if (variabel2 == 2) {
            int dummyVariabel = 99;
            System.out.println("Variabel 2" + variabel2);
            System.out.println("Variabel Scope If " + dummyVariabel);
        } else if (nomor == 2) {
            System.out.println("Cabang 2");
        } else {
            System.out.println("Cabang Lainnya");
        }
        System.out.println("-----------------------------------------------------------------------------");
        switch (variabel2) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Case Default");
                break;
        }

        System.out.println("-----------------------------------------------------------------------------");
        // For loop
        // i++ artinya i + 1
        // i+=2 artinya i + 2
        // i*=2 artinya i * 2
        int n = 4;
        for (int i = 0, counter = 2; i < n && counter == 2; i++, counter++) {
            System.out.println("i:  " + i + " Counter : " + counter);
        }
        System.out.println("-----------------------------------------------------------------------------");
        while (n < 8) {
            System.out.println("N :  " + n);
            n++;
        }
        System.out.println("-----------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        // 1
        int kali_x = 3;
        int kali_y = 2;
        int hasil = 0;
        for (int i = 0; i < kali_x; i++) {
            hasil = hasil + kali_y;
        }
        System.out.println("Hasil Perkalian dari  x=" + kali_x + " y=" + kali_y + " = " + hasil);
        System.out.println("-----------------------------------------------------------------------------");
        // 2
        int bagi_x = 16;
        int pembagi_y = 4;
        int hasil_bagi = 0;
        for (int i = bagi_x; i > 0; i -= pembagi_y) {
            hasil_bagi++;
        }
        System.out.println("Hasil Pembagian dari  x=" + bagi_x + " y=" + pembagi_y + " = " + hasil_bagi);

        System.out.println("-----------------------------------------------------------------------------");
        // 3
        int tukar_var1 = 2;
        int tukar_var2 = 9;
        System.out.println("Before Tukar ");
        System.out.println("Tukar Variabel 1 :" + tukar_var1);
        System.out.println("Tukar Variabel 2 :" + tukar_var2);
        int temp_tukar = tukar_var1;
        tukar_var1 = tukar_var2;
        tukar_var2 = temp_tukar;
        System.out.println("After Tukar ");
        System.out.println("Tukar Variabel 1 :" + tukar_var1);
        System.out.println("Tukar Variabel 2 :" + tukar_var2);

        System.out.println("-----------------------------------------------------------------------------");
        // 4
        int jamMulai = 10;
        int menitMulai = 30;
        int jamSelesai = 12;
        int menitSelesai = 10;

        int totalMenitMulai = (jamMulai * 60) + menitMulai;
        int totalMenitSelesai = (jamSelesai * 60) + menitSelesai;
        int selisihWaktu = totalMenitSelesai - totalMenitMulai;
        int jamSelisih = selisihWaktu / 60;
        int menitSelisih = selisihWaktu % 60;
        System.out.println("Selisih Waktu -> " + jamSelisih + ":" + menitSelisih);

        System.out.println("-----------------------------------------------------------------------------");
        // 5
        int totalAnjingSekarang = 1000;
        int bulanTotalAnjing = 10;
        System.out.println("Total anjing sekarang : " + totalAnjingSekarang);
        for (int i = 0; i < bulanTotalAnjing; i++) {
            int sisaAnjingDijual = totalAnjingSekarang - ((int) (totalAnjingSekarang * 0.2));
            totalAnjingSekarang += sisaAnjingDijual * 2;
        }
        System.out.println("Total anjing setelah " + bulanTotalAnjing + " bulan : " + totalAnjingSekarang);

        // 6
        System.out.println("-----------------------------------------------------------------------------");
        int jarak_Mercury = 0; // 1
        int jarak_Venus = 108; // 2
        int jarak_Earth = 162; // 3
        int jarak_Mars = 225; // 4

        int source_planet = 1;
        int destination_planet = 3;
        int jarakTempuh_planet = 0;

        if (source_planet < 1 && destination_planet >= 1) {
            jarakTempuh_planet = jarakTempuh_planet + jarak_Mercury;
        }
        if (source_planet < 2 && destination_planet >= 2) {
            jarakTempuh_planet = jarakTempuh_planet + jarak_Venus;
        }
        if (source_planet < 3 && destination_planet >= 3) {
            jarakTempuh_planet = jarakTempuh_planet + jarak_Earth;
        }
        if (source_planet < 4 && destination_planet >= 4) {
            jarakTempuh_planet = jarakTempuh_planet + jarak_Mars;
        }
        System.out.println("Jarak tempuh planet  source :" + source_planet + " destination:" + destination_planet
                + " Jarak => " + jarakTempuh_planet);
        // 7
        System.out.println("-----------------------------------------------------------------------------");
        int Algo_SKS = 4;
        int PrakAlgo_SKS = 2;
        int Webdes_SKS = 3;
        String Algo_Nilai = "A";
        String PrakAlgo_Nilai = "B";
        String Webdes_Nilai = "A";
        int totalSKS = Algo_SKS + PrakAlgo_SKS + Webdes_SKS;
        int totalNilai = 0;
        switch (Algo_Nilai) {
            case "A":
                totalNilai += 4 * Algo_SKS;
                break;
            case "B":
                totalNilai += 3 * Algo_SKS;
                break;
            case "C":
                totalNilai += 2 * Algo_SKS;
                break;
            case "D":
                totalNilai += 1 * Algo_SKS;
                break;
            case "E":
                totalNilai += 0 * Algo_SKS;
                break;
            default:
                break;
        }
        switch (PrakAlgo_Nilai) {
            case "A":
                totalNilai += 4 * PrakAlgo_SKS;
                break;
            case "B":
                totalNilai += 3 * PrakAlgo_SKS;
                break;
            case "C":
                totalNilai += 2 * PrakAlgo_SKS;
                break;
            case "D":
                totalNilai += 1 * PrakAlgo_SKS;
                break;
            case "E":
                totalNilai += 0 * PrakAlgo_SKS;
                break;
            default:
                break;
        }
        switch (Webdes_Nilai) {
            case "A":
                totalNilai += 4 * Webdes_SKS;
                break;
            case "B":
                totalNilai += 3 * Webdes_SKS;
                break;
            case "C":
                totalNilai += 2 * Webdes_SKS;
                break;
            case "D":
                totalNilai += 1 * Webdes_SKS;
                break;
            case "E":
                totalNilai += 0 * Webdes_SKS;
                break;
            default:
                break;
        }
        double ipsSemester = (double) totalNilai / (double) totalSKS;
        System.out.println("IPS Budiman : " + ipsSemester);

        // 8
        System.out.println("-----------------------------------------------------------------------------");
        String kataVokal = "Albertus berry";
        String kataNonVokal = "";
        for (int i = 0; i < kataVokal.length(); i++) {
            if (kataVokal.charAt(i) != 'A' && kataVokal.charAt(i) != 'a' && kataVokal.charAt(i) != 'I'
                    && kataVokal.charAt(i) != 'i' && kataVokal.charAt(i) != 'U' && kataVokal.charAt(i) != 'u'
                    && kataVokal.charAt(i) != 'E' && kataVokal.charAt(i) != 'e' && kataVokal.charAt(i) != 'O'
                    && kataVokal.charAt(i) != 'o') {
                kataNonVokal = kataNonVokal + kataVokal.charAt(i);
            }
        }
        System.out.println("Kata Vokal : " + kataVokal);
        System.out.println("Kata Non Vokal : " + kataNonVokal);

        // 9
        System.out.println("-----------------------------------------------------------------------------");
        String kataOriginal = "Albertus berry";
        String kataSubString = "ber";
        String kataFinalSubs = "";
        for (int i = 0; i < kataOriginal.length() - (kataSubString.length() - 1); i++) {
            if (kataOriginal.substring(i, i + kataSubString.length()).equals(kataSubString)) {
                i = i + (kataSubString.length() - 1);
            } else {
                kataFinalSubs += String.valueOf(kataOriginal.charAt(i));
            }
        }
        for (int i = kataOriginal.length() - (kataSubString.length() - 1); i < kataOriginal.length(); i++) {
            kataFinalSubs += String.valueOf(kataOriginal.charAt(i));
        }
        System.out.println("Kata Original : " + kataOriginal);
        System.out.println("Kata Final Subs : " + kataFinalSubs);

        // 10
        System.out.println("-----------------------------------------------------------------------------");
        String kataPalindrom = "adal";
        boolean isPalindrom = true;
        for (int i = 0, j = kataPalindrom.length() - 1; i < kataPalindrom.length() && isPalindrom; i++, j--) {
            if (kataPalindrom.charAt(i) != kataPalindrom.charAt(j)) {
                isPalindrom = false;
            }
        }
        System.out.println("Apakah kata ini palindrom : " + kataPalindrom + " => " + isPalindrom);
        // 11
        int totalTabunganSekarang = 1000000;
        double bunga = 0.2;
        int nBulan = 2;
        System.out.println("Total tabungan sekarang : " + totalTabunganSekarang);
        for (int i = 0; i < nBulan; i++) {
            totalTabunganSekarang = totalTabunganSekarang + ((int) (totalTabunganSekarang * bunga));
        }
        System.out.println("Total tabungan setelah  bulan" + nBulan + "  sebesar : " + totalTabunganSekarang);

        // 12
        System.out.println("-----------------------------------------------------------------------------");
        int tinggiIkan = 5;
        for (int i = 1, space = tinggiIkan / 2 + 1; i < tinggiIkan / 2 + 1; i++, space--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * space - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= (tinggiIkan / 2 + 1) + ((2 * (tinggiIkan / 2) + 1) - 1) + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = tinggiIkan / 2, space = 2; i > 0; i--, space++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * space - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        // 13
        int tinggiPohon = 10;
        int maxPotonganRanting = 4;
        int counterBranch = 1;
        int tinggiFondasiPohon = 2;
        for (int i = 0, ranting = 1; i < tinggiPohon - tinggiFondasiPohon; i++, ranting++) {
            if (ranting > maxPotonganRanting) {
                counterBranch++;
                ranting = 1;
            }
            for (int j = 0; j < (tinggiPohon - tinggiFondasiPohon) - (ranting * counterBranch); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2 * ranting) - 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * (ranting * (counterBranch - 1)) - 1) + counterBranch - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < tinggiFondasiPohon; i++) {
            for (int j = 0; j < ((2 * ((tinggiPohon - tinggiFondasiPohon) / maxPotonganRanting)) - 1) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2 * ((tinggiPohon - tinggiFondasiPohon) / maxPotonganRanting)) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 14
        System.out.println("-----------------------------------------------------------------------------");
        int tinggiJamPasir = 6;
        for (int i = 1, bintang = tinggiJamPasir / 2; i <= tinggiJamPasir / 2; i++, bintang--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * bintang) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1, space = tinggiJamPasir / 2; i <= tinggiJamPasir / 2; i++, space--) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 15
        System.out.println("-----------------------------------------------------------------------------");
        int tinggiPapanCatur = 4;
        int lebarPapanCatur = 7;
        for (int i = 1, space = 1; i <= tinggiPapanCatur; i++) {
            for (int j = 0; j < lebarPapanCatur; j++, space++) {
                if (space % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 16
        System.out.println("-----------------------------------------------------------------------------");
        int tinggiKue = 6;
        for (int i = 0; i < tinggiKue; i++) {
            for (int j = tinggiKue - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            if (0 < (2 * i) - 1) {
                System.out.print("|");
            }
            System.out.println();
        }
        // 17
        System.out.println("-----------------------------------------------------------------------------");
        int bilanganDiCheck = 4729;
        boolean isPrime = true;
        boolean isOdd = true;
        if (bilanganDiCheck % 2 != 0) {
            for (int i = 2; i < bilanganDiCheck && isPrime; i++) {
                if (bilanganDiCheck % i == 0) {
                    isPrime = false;
                }
            }
        } else {
            isOdd = false;
            isPrime = false;
        }
        System.out.println("Angka " + bilanganDiCheck + " : ");
        if (isOdd == true) {
            System.out.println("- Bilangan Ganjil");
        } else {
            System.out.println("- Bilangan Genap");
        }
        if (isPrime == true) {
            System.out.println("- Bilangan Prima");
        } else {
            System.out.println("- Bukan Bilangan Prima");
        }
        // 18
        System.out.println("-----------------------------------------------------------------------------");
        // Simulate
        // https://www.mathsisfun.com/data/cartesian-coordinates-interactive.html
        int x1 = -2;
        int y1 = 2;

        int x2 = 2;
        int y2 = 2;

        int x3 = 2;
        int y3 = -1;

        int x4 = -2;
        int y4 = -1;

        int panjang = 0;
        int lebar = 0;
        if (x1 == x2) {
            y1 = Math.abs(y1);
            y2 = Math.abs(y2);
            lebar = y1 + y2;
            x1 = Math.abs(x1);
            x3 = Math.abs(x3);
            panjang = x1 + x3;
        } else if (x1 == x3) {
            y1 = Math.abs(y1);
            y3 = Math.abs(y3);
            lebar = y1 + y3;
            x1 = Math.abs(x1);
            x2 = Math.abs(x2);
            panjang = x1 + x2;
        } else if (x1 == x4) {
            y1 = Math.abs(y1);
            y4 = Math.abs(y4);
            lebar = y1 + y4;
            x1 = Math.abs(x1);
            x3 = Math.abs(x3);
            panjang = x1 + x3;
        } else {
            System.out.println("Bukan persegi / persegi panjang");
        }
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("Luas = " + luas + " Keliling = " + keliling);
    }
}