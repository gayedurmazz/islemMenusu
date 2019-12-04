package com.uniyaz;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Islemler islemler = new Islemler();
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;
        while(devam){
            System.out.println("İşlem kodunu seçiniz: ");
            System.out.println("1.Cümleyi tersine çevir");
            System.out.println("2.Girilen sayı kadar yıldızla L çiz");
            System.out.println("3.Substring");
            System.out.println("4.Girilen sayıya kadar olan tek sayılar");
            System.out.println("5.Girilen sayıya kadar olan çift sayılar");
            int input = scanner.nextInt();

            switch(input) {

                case 1: {
                    islemler.reverseSentence();
                    break;
                }
                case 2: {
                    islemler.drawL();
                    break;
                }
                case 3: {
                    islemler.takeSubstring();
                    break;
                }
                case 4: {
                    islemler.oddNumbers();
                    break;
                }
                case 5: {
                    islemler.evenNumbers();
                    break;
                }
                default: break;
            }
          // devam = isDevam(scanner, devam);
                System.out.println("\n");
        }

    }

//    public static boolean  isDevam(Scanner scanner, boolean devam) {
//        System.out.println("\n");
//        System.out.println("İşleme devam etmek istiyor musunuz? Y:N ?");
//        scanner.next();
//        String answer = scanner.nextLine();
//        if(answer.equals('N')){
//            return false;
//        }
//        return true;
//    }

}
