package bangunDatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu,pilih1,pilih2;
        double p,l,t,a,ts,tps,tls;
        char balik,balik1,balik2,lanjut,lanjut1;
        do {
            System.out.println("Bangun Datar dan Bangun Ruang");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.print("Pilih:");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Persegi Panjang");
                    System.out.println("==================");
                    System.out.print("Masukkan Panjang = ");
                    p = input.nextDouble();
                    System.out.print("Masukkan Lebar = ");
                    l = input.nextDouble();
                    PersegiPanjang persegipanjang = new PersegiPanjang();
                    System.out.println("Luas Persegi Panjang = "+ persegipanjang.luas(p,l));
                    System.out.println("=============");
                    System.out.print("Lanjut ke Bangun Ruang?(y/n)");
                    lanjut = input.next().charAt(0);
                    if(lanjut=='n' || lanjut=='N')
                        break;
                    do {
                        System.out.println("Pilih Bangun Ruang yang berunsur Persegi Panjang dibawah ini:");
                        System.out.println("1. Balok");
                        System.out.println("2. Limas Persegi Panjang");
                        System.out.print("Pilih:");
                        pilih1 = input.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("==Volume Balok==");
                                System.out.print("Masukkan Tinggi Balok: ");
                                t = input.nextDouble();
                                Balok volumeBalok = new Balok();
                                volumeBalok.setT(t);
                                System.out.println("Volume Balok = " + volumeBalok.luas(p, l));
                                break;
                            case 2:
                                System.out.println("==Volume Limas Persegi Panjang==");
                                System.out.print("Masukkan Tinggi Limas: ");
                                t = input.nextDouble();
                                LimasPersegiPanjang volumeLimasP = new LimasPersegiPanjang();
                                volumeLimasP.setT(t);
                                System.out.println("Volume Limas Persegi Panjang = " + volumeLimasP.luas(p, l));
                                break;
                        }
                    System.out.print("Kembali ke menu bangun ruang persegi panjang(y/n)?");
                    balik1 = input.next().charAt(0);
                 }while(balik1=='y' || balik1=='Y');
                    break;
                case 2:
                    System.out.println("Segitiga");
                    System.out.println("==================");
                    System.out.print("Masukkan Alas Segitiga = ");
                    a = input.nextDouble();
                    System.out.print("Masukkan Tinggi Segitiga = ");
                    ts = input.nextDouble();
                    Segitiga segitiga = new Segitiga();
                    System.out.println("Luas Segitiga = "+ segitiga.luasSegitiga(a,ts));
                    System.out.println("=============");
                    System.out.print("Lanjut ke Bangun Ruang?(y/n)");
                    lanjut1 = input.next().charAt(0);
                    if(lanjut1=='n' || lanjut1=='N')
                        break;
                    do {
                        System.out.println("Pilih Bangun Ruang yang berunsur Segitiga dibawah ini:");
                        System.out.println("1. Prisma Segitiga");
                        System.out.println("2. Limas Segitiga");
                        System.out.print("Pilih:");
                        pilih2 = input.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("Volume Prisma Segitiga");
                                System.out.print("Masukkan Tinggi Prisma Segitiga: ");
                                tps = input.nextDouble();
                                PrismaSegitiga volumePrismaS = new PrismaSegitiga();
                                volumePrismaS.setT(tps);
                                System.out.println("Volume Prisma Segitiga = " + volumePrismaS.luasSegitiga(a, ts));
                                break;
                            case 2:
                                System.out.println("Volume Limas Segitiga");
                                System.out.print("Masukkan Tinggi Limas Segitiga: ");
                                tls = input.nextDouble();
                                LimasSegitiga volumeLimasS = new LimasSegitiga();
                                volumeLimasS.setT(tls);
                                System.out.println("Volume Limas Segitiga = " + volumeLimasS.luasSegitiga(a, ts));
                                break;
                        }
                        System.out.print("Kembali ke menu bangun ruang segitiga(y/n)?");
                        balik2 = input.next().charAt(0);
                    }while(balik2=='y' || balik2=='Y');
                    break;
            }
            System.out.print("Kembali ke menu utama(y/n)?");
            balik = input.next().charAt(0);
        }while(balik=='y' || balik=='Y');
    }
}
