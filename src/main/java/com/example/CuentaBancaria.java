package com.example;


public class CuentaBancaria {
    // Atributos privados para cumplir con el encapsulamiento
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor completo para inicializar la cuenta
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para depositar: El saldo solo cambia si la cantidad es positiva (> 0)
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0");
        }
    }

    // Método para retirar: Valida que la cantidad sea positiva y que existan fondos
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a 0");
        } else if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo restante: " + this.saldo);
        } else {
            // Mensaje exacto según lo visto en la rúbrica del video
            System.out.println("Fondos insuficientes");
        }
    }

    // Getter para el saldo: Permite consultar el dinero sin modificarlo directamente
    public double getSaldo() {
        return this.saldo;
    }

    // Getters adicionales (opcionales pero recomendados para buena práctica)
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
}