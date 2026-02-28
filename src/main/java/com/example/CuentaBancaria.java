package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor con validación de saldo inicial
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0; // O la lógica que prefieras, pero debe validarse
        } else {
            this.saldo = saldoInicial;
        }
    }

    // Getter y Setter para Titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // SOLO GETTER para Saldo
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else if (cantidad > this.saldo) {
            System.out.println("Fondos insuficientes");
        }
    }
}