package com.uniyaz;

import java.util.Scanner;

public class Islemler {
    Scanner scanner = new Scanner(System.in);
    //****************** Aynı scanner kullanılması sorun yaratmadı?
    //  nextline ile çözülecek.
    public void reverseSentence(){
        System.out.println("**** Cümleyi Ters Çevirme ****");
        System.out.println("Ters çevrilecek cümleyi giriniz:");
        String sentence = scanner.nextLine();
        for (int i = sentence.length()-1 ; i >0 ; i--) {
            System.out.print(sentence.charAt(i));
        }
        System.out.println("\n");
    }

    public void drawL(){
        System.out.println("**** Yıldızla L Çizme ****");
        System.out.println("Bir sayı giriniz:");
        int starCount = scanner.nextInt();
        for (int i = 0; i < starCount ; i++) {
            System.out.print("* ");
        }
        //************* Dik Yıldızlar çok aşağıdan başlıyor ??? -- hem println hem \n kullandığın için!
        System.out.print("\n");
        for (int i = 1; i < starCount ; i++) {
            System.out.println("*");
        }
    }

    public void takeSubstring(){
        System.out.println("**** Substring Bulma ****");
        System.out.println("Bir cümle giriniz:");
        String sentence = scanner.nextLine();
        System.out.println("Aralık giriniz:");
        int startIndex = scanner.nextInt();
        int finishIndex = scanner.nextInt();
        if (startIndex > finishIndex) {
            int temp = finishIndex;
            finishIndex = startIndex;
            startIndex = temp;
        }else if (startIndex == finishIndex){
            System.out.println("Eşit sayılar girmeyin!");
            takeSubstring();
        }else if (finishIndex >sentence.length()){
            System.out.println("Verilen aralık cümleyi aştı!");
            System.exit(1);
        }
        System.out.println(sentence.substring(startIndex,finishIndex));
    }

    public void oddNumbers(){
        System.out.println("**** Tek Sayılar ****");
        System.out.println("Aralık değerlerini giriniz:");
        int bigNum = scanner.nextInt();
        int smallNum= scanner.nextInt();
        if (smallNum > bigNum) {
            int temp = bigNum;
            bigNum = smallNum;
            smallNum = temp;
        }else if (smallNum == bigNum){
            System.out.println("Eşit sayılar girmeyin!");
            oddNumbers();
        }
        for (int i = smallNum; i <bigNum ; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public void evenNumbers(){
        System.out.println("**** Çift Sayılar ****");
        System.out.println("Aralık değerlerini giriniz:");
        int bigNum = scanner.nextInt();
        int smallNum= scanner.nextInt();
        if (smallNum > bigNum) {
            int temp = bigNum;
            bigNum = smallNum;
            smallNum = temp;
        }else if (smallNum == bigNum){
            System.out.println("Eşit sayılar girmeyin!");
            oddNumbers();
        }
        for (int i = smallNum; i <bigNum ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}