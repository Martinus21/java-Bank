package com.praktikum;

public class BankAccount {
    private double saldo;

    public BankAccount(double saldoAwal){
        this.saldo = saldoAwal;
    }

    public void CekSaldo(){
        System.out.println("Saldo anda saat ini : Rp." + this.saldo);
    }

    public void SimpanUang(double simpanSaldo){
        System.out.println("Uang yang anda simpan : Rp." + (this.saldo+simpanSaldo));
    }

    public void AmbilUang(double ambilSaldo){
        System.out.println("Uang yang anda ambil ; Rp." + ambilSaldo);
        if(this.saldo > ambilSaldo){
            System.out.println("Saldo anda Saat ini : Rp." + (this.saldo-ambilSaldo));
        }else{
            System.out.println("Maaf saldo anda tidak cukup");
        }
    }
}
