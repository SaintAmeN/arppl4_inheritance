package pl.sda.arp4.inheritance.wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        //
        //
        //
        //
        //
        //
        //
        try{
            //1
            //2
            //3 <<<<< WYJATEK
            //4
            //5
            //6
        }catch (Exception e){
            //7
            //8
            //9
        }
        //10
        //11
        //12

        // normalny: 1,2,3,4,5,10,11,12
        // wyjatek : 1,2,3,7,8,9,10,11,12
        int[] tablica = new int[100];
        tablica[392] = 5;

        // wyjątek niejawny
        Integer zmienna = null;
        System.out.println(zmienna.floatValue());

        // IO - input / output
//        File f = new File("./folder1/folder2/folder3/folder4/sciezka.txt");
        File f = new File("./sciezka.txt");
        try {
            PrintWriter writer = new PrintWriter(f);

            // jeśli plik istnieje, to wykona się kod tutaj...
            // kod tutaj
            // ..
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // finally jest blokiem kodu który wykona się zawsze niezależnie od tego czy wystąpił błąd czy nie
        }
    }
}
