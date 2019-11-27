package com.praktikum;

import java.util.Scanner;

// CLASS MAIN
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserAccount usr = new UserAccount();
        String ulang = "y";
        String pil;

        while(ulang.equals("y") || ulang.equals("Y")) {
            System.out.println("\n#### Selamat Datang ####");
            System.out.println("#### JBank ####");
            System.out.println("");
            System.out.print("Apakah sudah memiliki account Y/N : ");
            pil = input.nextLine();

            String username, password;
            if(pil.equals("Y")) {
                System.out.println("\nLOGIN");
                System.out.print("Masukan Username anda : ");
                username = input.nextLine();
                System.out.print("Masukan Password anda : ");
                password = input.nextLine();
                if(usr.logUser(username, password)) {
                    Scanner inputMenu = new Scanner(System.in);
                    int pilih;
                    BankAccount objBank = new BankAccount(10000);
                    System.out.println("Input Pilihan : ");
                    pilih = inputMenu.nextInt();
                    switch (pilih){
                        case 1 :
                            objBank.CekSaldo();
                            break;
                        case 2 :
                            objBank.SimpanUang(50000);
                            break;
                        case 3 :
                            objBank.AmbilUang(100000);
                            break;
                        default:
                            System.out.println("Pilihan Anda Tidak Ada");
                    }
                }else{
                    System.out.println("Login Gagal");
                }
            }else if(pil.equals("N")) {
                System.out.println("\nREGISTER");
                System.out.print("Masukan Username anda : ");
                username = input.nextLine();
                System.out.print("Masukan Password anda : ");
                password = input.nextLine();
                if(usr.regUser(username, password)) {
                    System.out.println("Berhasil Register, Silahkan Login");
                }
            } else {
                System.out.println("Inputan yang anda masukan salah!");
            }

            System.out.print("\nUlangi program ? (Y/N) : ");
            ulang = input.nextLine();
        }
    }
}